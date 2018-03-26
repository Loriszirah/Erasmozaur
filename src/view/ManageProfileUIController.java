package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.MainApp;
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
