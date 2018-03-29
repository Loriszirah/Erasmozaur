package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.MainApp;
import model.Role;
import model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import facade.RoleFacade;
import facade.UserFacade;

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
	Button leaveUniversityButton;
	
	@FXML
	Button joinUniversityButton;
	
	
	
	protected RoleFacade rf = new RoleFacade();
	protected ArrayList<Role> rolesAL;
	
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
    	User currentUser = MainController.getUserFacade().getCurrentUser();
    	if(currentUser != null){
	    		// Insert default values of the form
	    		firstNameTextField.setText(userFacade.getCurrentUser().getFirstName());
	    		lastNameTextField.setText(userFacade.getCurrentUser().getLastName());
	    		usernameTextField.setText(userFacade.getCurrentUser().getUsername());
	    		emailTextField.setText(userFacade.getCurrentUser().getEmail());
	    		addressTextField.setText(userFacade.getCurrentUser().getAddress());
	    }
    	else{
    		try {
				setSceneContent("LoginOverview");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
    
    @FXML 
    private void submitForm() {
    	System.out.println("The form has been submitted!");
    	//if(userFacade.register(firstNameTextField.getText(), lastNameTextField.getText(), passwordTextField.getText(), emailTextField.getText(), usernameTextField.getText(), null, addressTextField.getText(), "Student")){
    	//	System.out.println("The 'Register' request was succesful!");
    //	} else { 
    //		System.out.println("The 'Register' request failed!");
    	//}
    	// TODO : change the register for updateProfile()
    }
    @FXML
    private void  cancelButton() {
	
    }
    
    @FXML
    private void joinUniversity() {
	try {
		setSceneContent("indexUniversities");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    	leaveUniversityButton.setVisible(true);
    	joinUniversityButton.setVisible(false);
    }
    
    @FXML
    private void leaveUniversity() {
    	leaveUniversityButton.setVisible(false);
    	joinUniversityButton.setVisible(true);
    }
    
    @FXML
    private void logoutMenu() {
    		try {
				setSceneContent("HomePageUI");
			} catch (IOException e) {
				e.printStackTrace();
			}
    }

}
