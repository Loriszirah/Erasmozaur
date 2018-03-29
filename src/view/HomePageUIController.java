package view; 
 
import java.io.IOException; 
 
import javafx.event.ActionEvent; 
import javafx.fxml.FXML; 
import javafx.scene.control.MenuItem; 
import main.Context; 
 
public class HomePageUIController extends MainController { 
 
  @FXML 
  MenuItem logoutMenu; 
   
  /** 
     * The constructor. 
     * The constructor is called before the initialize() method. 
     */ 
    public HomePageUIController() { 
    } 
 
    /** 
     * Initializes the controller class. This method is automatically called 
     * after the fxml file has been loaded. 
     */ 
    @FXML 
    private void initialize() {  
    
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
        setSceneContent("HomePageUI"); 
      } catch (IOException e) { 
        e.printStackTrace(); 
      }  
    } 
    @FXML 
    private void universitiesClicked(ActionEvent event){ 
       try { 
      setSceneContent("ManageUniversities"); 
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
} 