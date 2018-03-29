package view;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import main.MainApp;
import model.Role;
import model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


import facade.RoleFacade;
import facade.UserFacade;

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
	ChoiceBox roles;
	
	@FXML
	Text emptyTextField;
	
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
	protected RoleFacade rf = new RoleFacade();
	
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
    		rolesAL = rf.getAllRoles();
    		for(Role role : rolesAL) {
    			roles.getItems().add(role.getName());
    		}
    		roles.setValue(roles.getItems().get(0));
    	}
    	else {
    		try {
				setSceneContent("ManageProfileUI");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }
    
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
	    	if(userFacade.register(firstNameTextField.getText(), lastNameTextField.getText(), passwordTextField.getText(), emailTextField.getText(), usernameTextField.getText(), null, addressTextField.getText(), roles.getValue().toString())){
	    		System.out.println("The 'Register' request was succesful!");
	    		try {
					setSceneContent("LoginOverview");
				} catch (IOException e) {
					e.printStackTrace();
				}
	    	} else {
	    		System.out.println("The 'Register' request failed!");
	    	}
    	}
    	else{
    		emptyTextField.setText("Missing fields");
    	}
    }
    
    @FXML
    private void  cancelButton() {
    	try {
			setSceneContent("LoginOverview");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
