package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.MainApp;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import facade.UserFacade;

public class ManageProfileUIController extends MainController{
	
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
    	if(registerUser != null){
	    	if(registerUser == false){
	    		// Insert default values of the form
	    		firstNameTextField.setText(userFacade.getCurrentUser().getFirstName());
	    		lastNameTextField.setText(userFacade.getCurrentUser().getLastName());
	    		usernameTextField.setText(userFacade.getCurrentUser().getUsername());
	    		emailTextField.setText(userFacade.getCurrentUser().getEmail());
	    		addressTextField.setText(userFacade.getCurrentUser().getAddress());
	    	}
	    	else{
	    		// Nothing to do!
	    		// The textFields will remain null
	    	}
    	}
    }
    
    @FXML 
    private void submitForm() {
    	System.out.println("The form has been submitted!");
    	if(userFacade.register(firstNameTextField.getText(), lastNameTextField.getText(), passwordTextField.getText(), emailTextField.getText(), usernameTextField.getText(), null, addressTextField.getText(), "Student")){
    		System.out.println("The 'Register' request was succesful!");
    	} else { 
    		System.out.println("The 'Register' request failed!");
    	}
    }
    @FXML
    private void  cancelButton() {
	
    }

}
