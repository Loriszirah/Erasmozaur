package view;

import java.io.IOException;
import java.util.logging.Level;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class LoginOverviewController extends MainController {
	

	@FXML
	TextField usernameTextField;
	
	@FXML
	TextField passwordTextField;
	
	@FXML
	Label errorMessage;
	
	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public LoginOverviewController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
    	
//        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
//        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }
    
    @FXML
    private void login(){
    	if((!(usernameTextField.getText().equals("")) && !(passwordTextField.getText().equals(""))) && userFacade.login(usernameTextField.getText(), passwordTextField.getText())) {
    		System.out.println("Login Succesful!");
    		username = userFacade.getCurrentUser().getUsername();
//    		roleType = userFacade.getRoleType();
			 try {
				setSceneContent("HomePageUI");
			} catch (IOException e) {
				e.printStackTrace();
			} 
    	}
    	else{
    		System.out.println("Login Failed!");
    		errorMessage.setText("Login Failed! Wrong credentials!");
    		errorMessage.setTextFill(Color.RED);
    	}
    }
    
    @FXML
    private void register(){
    	System.out.println("A 'Register' action has been called!");
    	MainController.registerUser = true;
    	 try {
    		 setSceneContent("createProfileUI");  
	     } catch (IOException ex) {  
	    	 	LOGGER.log(Level.SEVERE, null, ex);  
	     }  	
    }
    
    
}
