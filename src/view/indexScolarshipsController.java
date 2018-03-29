package view;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import main.ActionButtonTableCell;
import presenters.ScholarshipPresenter;
import presenters.ScholarshipPresenter;
import presenters.UniversityPresenter;
import facade.ScholarshipFacade;

public class indexScolarshipsController extends MainController{
	@FXML
	TableView<ScholarshipPresenter> scolarshipsTableView = new TableView<ScholarshipPresenter>();
	
	@FXML
	TableColumn universityColumn;
	
	@FXML
	TableColumn durationColumn;
	
	@FXML
	TableColumn startDateColumn;
	
	@FXML
	TableColumn endDateColumn;
	
	@FXML
	TableColumn domaineColumn;
	
	@FXML
	TableColumn buttonColumn;
	
	
	protected ObservableList<ScholarshipPresenter> scholarships;

	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public indexScolarshipsController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	
    
    	
    	
    	
    	scholarships = FXCollections.observableArrayList(ScholarshipFacade.getAllScolarshipsPresenter());
    	
    	universityColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, String>("name"));
    	durationColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, String>("duration"));
    	startDateColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, String>("startDate"));
    	endDateColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, String>("endDate"));
    	domaineColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, String>("country"));
    	buttonColumn.setCellFactory(ActionButtonTableCell.<ScholarshipPresenter>forTableColumn("Details", (ScholarshipPresenter u) -> {
//    		joinUniversityTable.getItems().remove(u);
    		entityId = u.getId_scolarship();
    		try {
				setSceneContent("HomePageUI");
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
    	scolarshipsTableView.getColumns().clear();
    	
    	// if we have results, we place them in the table
    	if(scholarships.size() > 0){
    		scolarshipsTableView.setItems(scholarships);
    		scolarshipsTableView.getColumns().addAll(universityColumn, durationColumn, startDateColumn, buttonColumn);
    	}
    
    }
    
	
}
