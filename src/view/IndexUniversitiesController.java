package view;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import main.ActionButtonTableCell;
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
	
	@FXML
	Button createUniversityButton;
	
	protected ObservableList<UniversityPresenter> universities;
	protected User currentUser = MainController.getUserFacade().getCurrentUser();
	
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
    	if(MainController.getUserFacade().isResponsibleOfUniversity(currentUser.getId())) {
			createUniversityButton.setVisible(false);
    	}
    	usernameLabel.setText(currentUser.getUsername());
    	universities = FXCollections.observableArrayList(universityFacade.getAllUniversitiesPresenter());
    	
    	universityColumn.setCellValueFactory(new PropertyValueFactory<UniversityPresenter, String>("name"));
    	cityColumn.setCellValueFactory(new PropertyValueFactory<UniversityPresenter, String>("city"));
    	countryColumn.setCellValueFactory(new PropertyValueFactory<UniversityPresenter, String>("country"));
    	actionColumn.setCellFactory(ActionButtonTableCell.<UniversityPresenter>forTableColumn("Details", (UniversityPresenter u) -> {
//    		joinUniversityTable.getItems().remove(u);
    		System.out.println(u.getName()+" - "+u.getId_university());
    		MainController.entityId = u.getId_university();
    		System.out.println("entityId(1) - "+MainController.entityId);
    		try {
				setSceneContent("manageUniversityUI");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	    return u;
    	}));  
    	// Model for a 'Remove' button inside a TableView
//    	actionColumn.setCellFactory(ActionButtonTableCell.<Person>forTableColumn("Remove", (Person p) -> {
//    		joinUniversityTable.getItems().remove(p);
//    	    return p;
//    	}));   
    	
    	// refresh and clear the lines in the table
    	joinUniversityTable.getColumns().clear();
    	
    	// if we have results, we place them in the table
    	if(universities.size() > 0){
	    	joinUniversityTable.setItems(universities);
	    	joinUniversityTable.getColumns().addAll(universityColumn, cityColumn, countryColumn, actionColumn);
    	}
    }
}


	
	
	
	