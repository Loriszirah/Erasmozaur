package view;
import java.io.File;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.layout.VBoxBuilder;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import main.Context;
import model.Application;
import model.Scholarship;
import presenters.ScholarshipPresenter;
import presenters.UniversityPresenter;
import facade.UniversityFacade;
 

public class ApplyScholarshipController extends MainController{
	
	@FXML
	Label universityNameLabel;
	
	@FXML
	TextArea coverLetterTextArea;
	
	UniversityPresenter university ;
	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public ApplyScholarshipController() {
    }
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	//currentScholarship = scholarshipFacade.viewScholarship(MainController.entityId);
		university = universityFacade.viewUniversityPresenter(universityId);
		universityNameLabel.setText(university.getName());
		
    }
    
    @FXML
    private void applyButton() {
    	String coverLetter = coverLetterTextArea.getText();
    	Date date = new Date();
    	int userId = 	MainController.getUserFacade().getCurrentUser().getId()  ;  	
    	applicationFacade.createApplication(date, coverLetter,userId ,entityId); 
    }
    
 
}
