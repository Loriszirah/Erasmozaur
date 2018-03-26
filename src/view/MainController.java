package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.MainApp;
import facade.UserFacade;

public abstract class MainController {
	
	// global application attributes
		protected MainApp mainApp;
		protected UserFacade userFacade;
		
	// global user attributes
		String username;
		String roleType;
		
	public MainController(){
		username = "";
		roleType = "";
		
		userFacade = new UserFacade();
		
	}
	
	/**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	// insert code here...
    }
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

}
