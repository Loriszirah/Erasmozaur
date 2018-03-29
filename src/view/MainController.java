package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.MainApp;
import main.Context;

import java.io.IOException;
import java.util.logging.Logger;

import facade.UserFacade;

public abstract class MainController {
	
	// global application attributes
		protected static MainApp mainApp;
		protected static UserFacade userFacade;
		public final Logger LOGGER = Logger.getLogger(this.getClass().getName());  
		private static final String UI_BASE_LOCATION = "/view/";  
		private static final String FXML_PREFIX = ".fxml";
		protected static Boolean registerUser = false;
		
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
    
    public static void setSceneContentStartup(Stage stage) throws IOException{  
        Context.getInstance().setCurrentStage(stage);  
        setSceneContent("LoginOverview");
      }  
      public static Parent setSceneContent(String pageName) throws IOException {  
        Stage currentStage = Context.getInstance().getCurrentStage();  
        Scene scene = currentStage.getScene();  
        Parent page = (Parent) FXMLLoader.load(MainController.class.getResource(UI_BASE_LOCATION + pageName + FXML_PREFIX));  
        if (scene == null) {  
          scene = new Scene(page);  
          currentStage.setScene(scene);  
          currentStage.setTitle("Erasmozaur");  
          currentStage.setWidth(800);  
          currentStage.setHeight(600);  
        } else {  
          currentStage.getScene().setRoot(page);  
        }  
        currentStage.centerOnScreen();  
        currentStage.sizeToScene();  
        currentStage.show();  
        return page;  
      }  
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public static UserFacade getUserFacade() {
    	return MainController.userFacade;
    }
}
