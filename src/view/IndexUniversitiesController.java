package view;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import main.MainApp;
import model.Role;
import model.University;
import model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import facade.UniversityFacade;
 

public class IndexUniversitiesController extends MainController{
	@FXML
	TableView<String> universitiesTableViews;
	@FXML
	TableColumn universitiesColumn;
	
	@FXML
	TableColumn joinColumn;
	
	@FXML
	TableColumn detailsColumn;
	
	protected UniversityFacade universityFacade;
	protected ArrayList<University> universitiesList;

	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public IndexUniversitiesController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the university table with the two columns.
    	universityFacade = new UniversityFacade();
    	universitiesList = universityFacade.getAllUniversities();
		for(University university : universitiesList) {
			System.out.println(university);
		}

    }
}


	
	
	
	