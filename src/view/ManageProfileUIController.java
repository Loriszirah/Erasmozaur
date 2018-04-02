package view;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import model.University;
import model.User;

import java.io.IOException;
import java.util.ArrayList;

import facade.RoleFacade;
import facade.UniversityFacade;

public class ManageProfileUIController extends MainController{
	
	@FXML
	TextField firstNameTextField;
	
	@FXML
	TextField lastNameTextField;
	
	@FXML
	TextField usernameTextField;
	
	@FXML
	TextField emailTextField;
	
	@FXML
	TextField addressTextField;
	
	@FXML
	DatePicker birthdateDatePicker;
	
	@FXML
	ImageView lastnameWarning;
	
	@FXML
	ImageView firstnameWarning;
	
	@FXML
	ImageView emailWarning;
	
	@FXML
	ImageView usernameWarning;
	
	@FXML
	Text errorMessage;
	
	@FXML
	TextField roleTextField;
	
	@FXML
	ChoiceBox<String> universities;
	
	protected RoleFacade roleFacade = new RoleFacade();
	protected UniversityFacade universityFacade = new UniversityFacade();
	protected ArrayList<University> universitiesAL;
	User currentUser = MainController.getUserFacade().getCurrentUser();

	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public ManageProfileUIController() {
    }
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	if(currentUser != null){
    		// Insert default values of the form
    		firstNameTextField.setText(userFacade.getCurrentUser().getFirstName());
    		lastNameTextField.setText(userFacade.getCurrentUser().getLastName());
    		usernameTextField.setText(userFacade.getCurrentUser().getUsername());
    		emailTextField.setText(userFacade.getCurrentUser().getEmail());
    		addressTextField.setText(userFacade.getCurrentUser().getAddress());
    		int id_role = userFacade.getCurrentUser().getId_role();
    		roleTextField.setText(roleFacade.getRole(id_role).getName());
    		
    		// Filling the Choice box of universities
    		universitiesAL = universityFacade.getAllUniversities();
    		if(!universitiesAL.isEmpty()) {
	    		for(int i = 0; i<universitiesAL.size(); i++) {
	    			universities.getItems().add(universitiesAL.get(i).getName());
	    			if(universitiesAL.get(i).getId_university() == userFacade.getCurrentUser().getId_university()) {
	    				universities.setValue(universities.getItems().get(i));
	    			}
	    		}
    		}
    	}
    	else{
    		try {
				setSceneContent("LoginOverview");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
    
    /**
     * Check if the fields are correctly and if it's correct, change the informations of the user.
     */
    @FXML 
    private void submitFormButton() {
    	boolean emptyField = false;

    	if(emailTextField.getText().isEmpty()) {
    		emptyField = true;
    		emailWarning.setVisible(true);
    	}
    	else {
    		emailWarning.setVisible(false);
    	}
    	
    	if(usernameTextField.getText().isEmpty()) {
    		emptyField = true;
    		usernameWarning.setVisible(true);
    	}
    	else {
    		usernameWarning.setVisible(false);
    	}
    	
    	if(firstNameTextField.getText().isEmpty()) {
    		firstnameWarning.setVisible(true);
    	}
    	else {
    		firstnameWarning.setVisible(false);
    	}
    	
    	if(lastNameTextField.getText().isEmpty()) {
    		lastnameWarning.setVisible(true);
    	}
    	else {
    		lastnameWarning.setVisible(false);
    	}
    	
    	if(!emptyField) {
    		try{
    			userFacade.updateUser(currentUser.getId(), firstNameTextField.getText(), lastNameTextField.getText(), emailTextField.getText(), usernameTextField.getText(), userFacade.getCurrentUser().getBirthDate(), addressTextField.getText(), universities.getValue().toString());
	    		errorMessage.setText("Informations updated");
	    	} catch(Exception e){
	    		errorMessage.setText(e.getMessage());
	    		firstNameTextField.setText(userFacade.getCurrentUser().getFirstName());
	    		lastNameTextField.setText(userFacade.getCurrentUser().getLastName());
	    		usernameTextField.setText(userFacade.getCurrentUser().getUsername());
	    		emailTextField.setText(userFacade.getCurrentUser().getEmail());
	    		addressTextField.setText(userFacade.getCurrentUser().getAddress());
	    		universities.setValue(universities.getItems().get(universitiesAL.indexOf(universityFacade.getByName(universities.getValue().toString()))));
	    	}
    	}
    	else{
    		errorMessage.setText("Missing fields");
    	}
    }
    
    /**
     * Cancel the modification of the profile
     */
    @FXML
    private void  cancelButton() {
    	try {
			setSceneContent("HomePageUI");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    private void logoutMenu() {
		try {
			setSceneContent("LoginOverview");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
