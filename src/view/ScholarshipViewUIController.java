package view;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Scholarship;
import presenters.ScholarshipPresenter;
import presenters.UniversityPresenter;
import model.Scholarship;
import presenters.ScholarshipPresenter;
import facade.ScholarshipFacade;

public class ScholarshipViewUIController extends MainController {
	@FXML
	Button applyButton;
	@FXML
	Button backButton;
	@FXML
	Label nameScholarship;
	
	@FXML
	Label descriptionScholarship;
	
	@FXML
	Label monthsScholarship;
	
	@FXML
	Label startDateScholarship;
	@FXML
	Label endDateScholarship;
	
	@FXML 
	Label domainScholarship;
	
	
	@FXML
	ChoiceBox listCoursesScholarship;
	
	String universityName;
	
	int idScolar;
	
	@FXML
	ListView<String> coursesScholarship = new ListView<String>();
	protected ScholarshipPresenter scholarship;
	protected ObservableList<String> courses;

	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public ScholarshipViewUIController() {
    }
	
	@FXML
	private void initialize() throws IOException {

		if(entityId != 0){
			scholarship = scholarshipFacade.viewScholarshipPresenter(entityId);
    		if(scholarship != null){
    			// setting the labels
    			idScolar = scholarship.getId_scolarship();
    			universityName = scholarship.getUniversityName();
    			nameScholarship.setText(scholarship.getUniversityName());
    			descriptionScholarship.setText(scholarship.getDescription());
    			String duration = String.valueOf(scholarship.getDuration());
    			monthsScholarship.setText(duration);
    			String datestart = new SimpleDateFormat("yyyy-MM-dd",   Locale.getDefault()).format(scholarship.getStartDate());
    			startDateScholarship.setText(datestart);
    			String dateend = new SimpleDateFormat("yyyy-MM-dd",   Locale.getDefault()).format(scholarship.getEndDate());
    			endDateScholarship.setText(dateend);
    			domainScholarship.setText(scholarship.getDomain());
	    		
	    		
    			//setting the courses in the ListView
	    		
    			//ObservableList<String> courses = FXCollections.observableArrayList(courseFacade.getAllCoursesFullNamesByUniversity(entityId));
	    		//if(!courses.isEmpty()){
	    	//		listCoursesScholarship.getItems().clear();
	    	//		listCoursesScholarship.setItems(courses);
	    	//	}
    		//} else { 
    		//	setSceneContent("IndexUniversities");
    		}
    	} else { 
    		setSceneContent("IndexUniversities");
    	}
	
	}
	@FXML
	private void backButton() {
		try {
			setSceneContent("IndexScholarships");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@FXML
	private void applyButton() {
		try {
    		MainController.entityId = this.idScolar;
    		MainController.universityId = this.universityId;
    		MainController.universityName = this.universityName;

			setSceneContent("ApplyScholarship");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	 
}
