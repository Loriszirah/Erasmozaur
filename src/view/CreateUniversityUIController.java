package view;
import java.io.IOException;

import facade.UniversityFacade;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import model.Role;
import model.University;
import model.User;

public class CreateUniversityUIController extends MainController {
	
	@FXML
	TextField nameTextField;
	
	@FXML
	TextField addressTextField;
	
	@FXML
	ChoiceBox citiesChoiceBox;
	
	@FXML
	ImageView nameWarning;
	
	@FXML
	Text errorText;
	
	protected UniversityFacade universityFacade = new UniversityFacade();
	
	@FXML
	public void createUniversityButton() {
		if(nameTextField.getText().isEmpty()) {
    		nameWarning.setVisible(true);
    		errorText.setText("You need to specify a name");
    	}
		else {
			try{
    			if(universityFacade.createUniversity(firstNameTextField.getText(), lastNameTextField.getText(), passwordTextField.getText(), emailTextField.getText(), usernameTextField.getText(), null, addressTextField.getText(), roles.getValue().toString())){
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
	}
	
	/**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	User currentUser = MainController.getUserFacade().getCurrentUser();
    	if(currentUser == null){
    		try {
				setSceneContent("LoginOverview");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
	
	@FXML
	public void cancelCreateUniversityButton() {
		try {
			setSceneContent("HomePageUI");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
