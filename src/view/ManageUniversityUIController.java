package view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Course;
import presenters.UniversityPresenter;

public class ManageUniversityUIController extends MainController{

	@FXML
	Label universityNameLabel;
	
	@FXML
	Text addressLabel;
	
	@FXML
	Text responsibleLabel;
	
	@FXML
	Text cityLabel;
	
	@FXML 
	Text countryLabel;
	
	@FXML
	TextField coursesTextField;
	
	@FXML
	ListView<Course> coursesListView;
	
	protected UniversityPresenter university;
	
	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public ManageUniversityUIController() {
    }
	
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     * @throws IOException 
     */
    @FXML
    private void initialize() throws IOException {
    	System.out.println("entityId(2) - "+MainController.entityId);
    	if(entityId != 0){
    		System.out.println("entityId(3) - "+MainController.entityId);
    		university = universityFacade.viewUniversityPresenter(entityId);
    		System.out.println(university.getName());
    		if(university != null){
//	    		universityNameLabel.setText(university.getName());
//	    		cityLabel.setText(university.getCity());
//	    		countryLabel.setText(university.getCountry());
//	    		addressLabel.setText(university.getAddress());
    		} else { 
    			setSceneContent("IndexUniversities");
    		}
    	} else { 
    		setSceneContent("IndexUniversities");
    	}
    }
    
}
