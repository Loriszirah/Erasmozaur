package view;

import javafx.scene.control.TableView;


import javafx.fxml.FXML;
import facade.ApplicationFacade;
import facade.UserFacade;

public class AcceptRefuseApplicationController {
	@FXML
	TableView<?> universityTableView;
	protected static ApplicationFacade applicationFacade;
	/**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public AcceptRefuseApplicationController() {
	 applicationFacade = new ApplicationFacade();

    	applicationFacade.addStatusApplication(1,true);
    }
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    //getAllAppliersForTheUniversity
    }
}

