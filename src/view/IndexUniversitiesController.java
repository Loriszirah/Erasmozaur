package view;
import javafx.collections.ObservableList;
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
import presenters.UniversityPresenter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import facade.UniversityFacade;
 

public class IndexUniversitiesController extends MainController{

	@FXML
	TableView<UniversityPresenter> joinUniversityTable = new TableView<UniversityPresenter>();
	
	@FXML
	TableColumn universityColumn;
	
	@FXML
	TableColumn cityColumn;
	
	@FXML
	TableColumn countryColumn;
	
	@FXML
	TableColumn actionColumn;
	
	@FXML
	Label usernameLabel;
	
	
	
	protected ObservableList<UniversityPresenter> universities;

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
    	universities = (ObservableList<UniversityPresenter>) universityFacade.getAllUniversities();
    	
    	universityColumn.setCellValueFactory(new PropertyValueFactory<UniversityPresenter, String>("name"));
    	cityColumn.setCellValueFactory(new PropertyValueFactory<UniversityPresenter, String>("city"));
    	countryColumn.setCellValueFactory(new PropertyValueFactory<UniversityPresenter, String>("country"));
    	
    	if(universities.size() > 0){
	    	joinUniversityTable.setItems(universities);
	    	joinUniversityTable.getColumns().addAll(universityColumn, cityColumn, countryColumn);
    	}
    }
}


	
	
	
	