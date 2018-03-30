package view;

import java.io.IOException;
import java.sql.Date;

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
import presenters.ScholarshipPresenter;
import facade.ScholarshipFacade;

public class IndexScholarshipsController extends MainController{
	@FXML
	TableView<ScholarshipPresenter> scholarshipsTableView = new TableView<ScholarshipPresenter>();
	
	@FXML
	TableColumn<ScholarshipPresenter, String> universityColumn;
	
	@FXML
	TableColumn<ScholarshipPresenter, Integer> durationColumn;
	
	@FXML
	TableColumn<ScholarshipPresenter, String> descriptionColumn;
	
	@FXML
	TableColumn<ScholarshipPresenter, Date> startDateColumn;
	
	@FXML
	TableColumn<ScholarshipPresenter, Date> endDateColumn;
	
	@FXML
	TableColumn<ScholarshipPresenter, String> domaineColumn;
	
	@FXML
	TableColumn buttonColumn;
	
	@FXML
	Label usernameLabel;
	
	@FXML
	Button logoutButton;

	protected ObservableList<ScholarshipPresenter> scholarships;

	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public IndexScholarshipsController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	usernameLabel.setText(userFacade.getCurrentUser().getUsername());
    	
//		if(scholarshipFacade == null) {
//			System.out.println("yoyoyoyo");
//		}
    	scholarships = FXCollections.observableArrayList(scholarshipFacade.indexScholarshipPresenters());
    
    	universityColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, String>("universityName"));
    	descriptionColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, String>("description"));
    	durationColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, Integer>("duration"));
    	startDateColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, Date>("startDate"));
    	endDateColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, Date>("endDate"));
    	domaineColumn.setCellValueFactory(new PropertyValueFactory<ScholarshipPresenter, String>("domain"));
    	buttonColumn.setCellFactory(ActionButtonTableCell.<ScholarshipPresenter>forTableColumn("Details", (ScholarshipPresenter s) -> {
//    		joinUniversityTable.getItems().remove(u);
    		entityId = s.getId_scolarship();
    		try {
				setSceneContent("ScholarshipViewUI");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	    return s;
    	}));   
    	
    	// refresh and clear the lines in the table
    	scholarshipsTableView.getColumns().clear();
    	
    	// if we have results, we place them in the table
    	if(scholarships.size() > 0){
    		scholarshipsTableView.setItems(scholarships);
    		scholarshipsTableView.getColumns().addAll(universityColumn, descriptionColumn, startDateColumn, endDateColumn, domaineColumn, durationColumn, buttonColumn);
//    		scholarshipsTableView.getColumns().add(universityColumn);
//    		scholarshipsTableView.getColumns().add(descriptionColumn);
//    		scholarshipsTableView.getColumns().add(domaineColumn);
//    		scholarshipsTableView.getColumns().add(buttonColumn);
    	}
    
    }
    
	
}
