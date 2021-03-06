package view;

import java.io.IOException;
import java.util.logging.Logger;

import facade.ApplicationFacade;
import facade.CourseFacade;
import facade.ScholarshipFacade;
import facade.UniversityFacade;
import facade.UserFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Context;
import main.MainApp;

public abstract class MainController {
	
	// global application attributes
		protected static MainApp mainApp;
		protected static UserFacade userFacade;
		protected static UniversityFacade universityFacade;
		protected static ScholarshipFacade scholarshipFacade;
		protected static CourseFacade courseFacade;
		protected static ApplicationFacade applicationFacade;

		
	// controller attributes
		public final Logger LOGGER = Logger.getLogger(this.getClass().getName());  
		private static final String UI_BASE_LOCATION = "/view/";  
		private static final String FXML_PREFIX = ".fxml";
		protected static Boolean registerUser = false;
		
	// global utility variables
		protected static String username = "";
		protected static String roleType = "";
		protected static int entityId = 0;
		protected static int universityId = 0;
		protected static String universityName ="";
		
		
	public MainController(){
		userFacade = new UserFacade();
		universityFacade = new UniversityFacade();
		scholarshipFacade = new ScholarshipFacade();
		courseFacade = new CourseFacade();
		applicationFacade = new ApplicationFacade();
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
        MainController.mainApp = mainApp;
    }

    public static UserFacade getUserFacade() {
    	return MainController.userFacade;
    }
    
    public void logout() throws IOException{
    	System.gc();
    	setSceneContent("LoginOverview");
    }
    @FXML 
    private void logoutMenuClicked(ActionEvent event){ 
    try { 
      setSceneContent("LoginOverview"); 
    } catch (IOException e) { 
      // TODO Auto-generated catch block 
      e.printStackTrace(); 
    } 
    } 
    @FXML 
    private void manageProfileClicked(ActionEvent event){ 
        try { 
        setSceneContent("ManageProfileUI"); 
      } catch (IOException e) { 
        e.printStackTrace(); 
      }  
    } 
    @FXML 
    private void universitiesClicked(ActionEvent event){ 
       try { 
      setSceneContent("IndexUniversities"); 
    } catch (IOException e) { 
      e.printStackTrace(); 
    }  
    } 
    @FXML 
    private void evaluationsClicked(ActionEvent event){ 
       try { 
      setSceneContent("manageEvaluations"); 
    } catch (IOException e) { 
      e.printStackTrace(); 
    }  
    } 
    @FXML 
    private void QuitAppClicked(ActionEvent event){        
      System.exit(0); 
     } 
    @FXML 
    private void applicationsClicked(ActionEvent event){ 
    		try { 
    			setSceneContent("manageApplicationUser"); 
    		} catch (IOException e) { 
    			e.printStackTrace(); 
    		}  
    } 
    @FXML 
    private void reviewsClicked(ActionEvent event){ 
    		try { 
    			setSceneContent("reviewUniversity1"); 
    		} catch (IOException e) { 
    			e.printStackTrace(); 
    		}  
    }
    @FXML 
    private void scholarshipsClicked(ActionEvent event){ 
    		try { 
    			setSceneContent("IndexScholarships"); 
    		} catch (IOException e) { 
    			e.printStackTrace(); 
    		} 
    }
   
}


