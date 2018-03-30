package view;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
	Label addressLabel;
	
	@FXML
	Label responsibleLabel;
	
	@FXML
	Label cityLabel;
	
	@FXML 
	Label countryLabel;
	
	@FXML
	TextField courseNameTextField;
	
	@FXML
	TextField courseSpecializationTextField;
	
	@FXML
	Button backButton;
	
	@FXML
	Button createCourseButton;
	
	@FXML
	ListView<String> coursesListView = new ListView<String>();
	
	protected UniversityPresenter university;
	protected ObservableList<String> courses;
	
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
    		university = universityFacade.viewUniversityPresenter(entityId);
    		if(university != null){
    			// setting the labels
	    		universityNameLabel.setText(university.getName());
	    		cityLabel.setText(university.getCity());
	    		responsibleLabel.setText(university.getResponsible());
	    		countryLabel.setText(university.getCountry());
	    		addressLabel.setText(university.getAddress());
	    		
	    		//setting the courses in the ListView
	    		ObservableList<String> courses = FXCollections.observableArrayList(courseFacade.getAllCoursesFullNamesByUniversity(entityId));
	    		coursesListView.getItems().clear();
	    		coursesListView.setItems(courses);
    		} else { 
    			setSceneContent("IndexUniversities");
    		}
    	} else { 
    		setSceneContent("IndexUniversities");
    	}
    }
    
    @FXML
    private void backAction() throws IOException {
    	setSceneContent("IndexUniversities");
    }
    
    @FXML
    private void createCourseAction() throws IOException {
    	Course newCourse = courseFacade.createCourse(courseNameTextField.getText(), courseSpecializationTextField.getText(), entityId);
    	
    	// re-do the 'Courses' query and refresh the listView
    	ObservableList<String> courses = FXCollections.observableArrayList(courseFacade.getAllCoursesFullNamesByUniversity(entityId));
		coursesListView.getItems().clear();
		coursesListView.setItems(courses);
    }
    
}
