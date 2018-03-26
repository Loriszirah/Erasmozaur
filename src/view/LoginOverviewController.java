package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.MainApp;
import facade.UserFacade;

public class LoginOverviewController extends MainController {
	

	@FXML
	TextField usernameTextField;
	
	@FXML
	TextField passwordTextField;
	
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
    	if(userFacade.login(usernameTextField.getText(), passwordTextField.getText()))
    		System.out.println("Login Succesful!");
    	else
    		System.out.println("Login Failed!");
    }
    
    @FXML
    private void register(){
    	
    }
    
    
}
