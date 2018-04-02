package view;

import facade.UserFacade;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class ValidateResponsibleControlleur {
	@FXML
	TableView<?> responsiblesTableView;
	protected static UserFacade userFacade = new UserFacade();
	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public ValidateResponsibleControlleur() {
	

    }
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    //getAllAppliersForTheUniversity
    }
    @FXML
    private void validateButton() {
    	// change role
    //	userid.userFacade.updateUser(getRoleByName("Responsible"));
    
    	}
    @FXML
    private void refuseButton() {
    	// setSceneContent("manageResponsible");  
    	//removeRow()
    	
    }
    @FXML
    private void detailsButton() {
    	//setSceneContent("ViewApplicationDetails"); 
    	//envoieDonnées
    	}
    
    
    private void removeRow( int idUser) {
   // 	MyDataType selectedItem = responsiblesTableView.getSelectionModel().getSelectedItem();
   //	responsiblesTableView.getItems().remove(selectedItem);
    }
}

