package view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import presenters.UniversityPresenter;

public class ManageUniversityUIController extends MainController{

	@FXML
	Label universityNameLabel;
	
	@FXML
	Label addressLabel;
	
	@FXML
	Label responsibleLabel;
	
	@FXML
	Label cityLabel;
	
	@FXML 
	Label countryLabel;
	
	@FXML
	TextField coursesTextField;
	
	@FXML
	ListView coursesListView;
	
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
    	if(entityId != 0){
//    		university = universityFacade.viewUniversityPresenter(entityId);
    		if(university != null){
	    		universityNameLabel.setText(university.getName());
	    		cityLabel.setText(university.getCity());
	    		countryLabel.setText(university.getCountry());
//	    		addressLabel.setText(university.getAddress());
    		} else { 
    			setSceneContent("IndexUniversities");
    		}
    	} else { 
    		setSceneContent("IndexUniversities");
    	}
    }
    
}
