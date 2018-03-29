package view;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import main.ActionButtonTableCell;
import model.Scholarship;
import facade.ScholarshipFacade;

public class indexScolarshipsController extends MainController{
	@FXML
	TableView<Scholarship> scolarshipsTableView = new TableView<Scholarship>();
	
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
	
	@FXML
	Label usernameLabel;
	
	@FXML
	Button logoutButton;

	protected ObservableList<Scholarship> scholarships;

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
    	
    
    	usernameLabel.setText(userFacade.getCurrentUser().getUsername());
	//ScholarshipFacade scholarshipFacade = null;
	if(scholarshipFacade == null) {
		System.out.println("yoyoyoyo");
	}
    	scholarships = FXCollections.observableArrayList(scholarshipFacade.getAllScholarship());
    
    	universityColumn.setCellValueFactory(new PropertyValueFactory<Scholarship, String>("description"));
    	durationColumn.setCellValueFactory(new PropertyValueFactory<Scholarship, String>("duration"));
    	startDateColumn.setCellValueFactory(new PropertyValueFactory<Scholarship, String>("StarDate"));
    	endDateColumn.setCellValueFactory(new PropertyValueFactory<Scholarship, String>("EndDate"));
    	domaineColumn.setCellValueFactory(new PropertyValueFactory<Scholarship, String>("domaine"));
    	buttonColumn.setCellFactory(ActionButtonTableCell.<Scholarship>forTableColumn("Details", (Scholarship u) -> {
//    		joinUniversityTable.getItems().remove(u);
    		entityId = u.getId_scholarship();
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
