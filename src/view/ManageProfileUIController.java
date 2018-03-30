package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import main.MainApp;
import model.Role;
import model.User;

import java.io.IOException;
import java.sql.Date;
import java.time.ZoneId;
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
	
	protected RoleFacade rf = new RoleFacade();
	protected ArrayList<Role> rolesAL;
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
				userFacade.updateUser(currentUser.getId(), firstNameTextField.getText(), lastNameTextField.getText(), emailTextField.getText(), usernameTextField.getText(), null, addressTextField.getText());
	    		errorMessage.setText("Informations updated");
	    	} catch(Exception e){
	    		errorMessage.setText(e.getMessage());
	    		firstNameTextField.setText(userFacade.getCurrentUser().getFirstName());
	    		lastNameTextField.setText(userFacade.getCurrentUser().getLastName());
	    		usernameTextField.setText(userFacade.getCurrentUser().getUsername());
	    		emailTextField.setText(userFacade.getCurrentUser().getEmail());
	    		addressTextField.setText(userFacade.getCurrentUser().getAddress());
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
