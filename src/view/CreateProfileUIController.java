package view;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import model.Role;
import model.University;
import model.User;

import java.io.IOException;
import java.util.ArrayList;



import facade.RoleFacade;
import facade.UniversityFacade;

public class CreateProfileUIController extends MainController{
	
	@FXML
	TextField firstNameTextField;
	
	@FXML
	TextField lastNameTextField;
	
	@FXML
	TextField usernameTextField;
	
	@FXML
	TextField passwordTextField;
	
	@FXML
	TextField emailTextField;
	
	@FXML
	TextField addressTextField;
	
	@FXML
	ChoiceBox<String> roles;
	
	@FXML
	ChoiceBox<String> universities;
	
	@FXML
	Text errorText;
	
	@FXML
	ImageView emailWarning;
	
	@FXML
	ImageView usernameWarning;
	
	@FXML
	ImageView passwordWarning;
	
	@FXML
	ImageView firstNameWarning;
	
	@FXML
	ImageView lastNameWarning;
	
	protected ArrayList<Role> rolesAL;
	protected ArrayList<University> universitiesAL;
	protected RoleFacade roleFacade = new RoleFacade();
	protected UniversityFacade universityFacade = new UniversityFacade();
	
	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public CreateProfileUIController() {
    }
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	User currentUser = MainController.getUserFacade().getCurrentUser();
    	if(currentUser == null){
    		// Filling the Choice box of roles
    		rolesAL = roleFacade.getAllRoles();
    		for(Role role : rolesAL) {
    			roles.getItems().add(role.getName());
    		}
    		roles.setValue(roles.getItems().get(0));
    		
    		// Filling the Choice box of universities
    		universitiesAL = universityFacade.getAllUniversities();
    		if(!universitiesAL.isEmpty()) {
	    		for(University university : universitiesAL) {
	    			universities.getItems().add(university.getName());
	    		}
	    		universities.setValue(universities.getItems().get(0));
    		}
    		else {
    			universities.getItems().add("No university");
    			universities.setDisable(true);
    		}
    	}
    	else {
    		try {
				setSceneContent("ManageProfileUI");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
    
    /**
     * Check if the required fields are empty and try to register. If the register succedeed, it's redirect to the login view
     */
    @FXML
    private void submitForm() {
    	boolean emptyField = false;
    	if(passwordTextField.getText().isEmpty()) {
    		emptyField = true;
    		passwordWarning.setVisible(true);
    	}
    	else {
    		passwordWarning.setVisible(false);
    	}
    	
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
    		firstNameWarning.setVisible(true);
    	}
    	else {
    		firstNameWarning.setVisible(false);
    	}
    	
    	if(lastNameTextField.getText().isEmpty()) {
    		lastNameWarning.setVisible(true);
    	}
    	else {
    		lastNameWarning.setVisible(false);
    	}
    	    	    	
    	if(!emptyField) {
    		try{
				if(userFacade.register(firstNameTextField.getText(), lastNameTextField.getText(), passwordTextField.getText(), emailTextField.getText(), usernameTextField.getText(), null, addressTextField.getText(), roles.getValue().toString(), universities.getValue().toString())){
		    		System.out.println("The 'Register' request was succesful!");
		    		try {
						setSceneContent("LoginOverview");
					} catch (IOException e) {
						e.printStackTrace();
					}
		    	} else {
		    		System.out.println("The 'Register' request failed!");
		    	}
	    	} catch(Exception e){
	    		errorText.setText(e.getMessage());
			}
    	}
    	else{
    		errorText.setText("Missing fields");
    	}
    }
    
    /**
     * Cancel the register phase and redirect to the login view
     */
    @FXML
    private void cancelButton() {
    	try {
			setSceneContent("LoginOverview");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
