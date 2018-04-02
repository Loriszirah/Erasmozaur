package view;
import java.io.IOException;
import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import presenters.UniversityPresenter;
 

public class ApplyScholarshipController extends MainController{
	
	@FXML
	Label universityNameLabel;
	
	@FXML
	TextArea coverLetterTextArea;
	
	@FXML
	Label scholarshipName;
	
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
		universityNameLabel.setText("Applying to a scolarship");
		scholarshipName.setText(MainController.universityName);
    }
    
    @FXML
    private void applyButton() {
    	String coverLetter = coverLetterTextArea.getText();
    	Date date = new Date();
    	int userId = 	MainController.getUserFacade().getCurrentUser().getId()  ;  	
    	applicationFacade.createApplication(date, coverLetter,userId ,entityId); 
		try {
			setSceneContent("ScholarshipViewController");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
 
}
