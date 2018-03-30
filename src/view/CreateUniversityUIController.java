package view;
import java.io.IOException;
import java.util.ArrayList;

import facade.UniversityFacade;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import model.City;
import model.User;

public class CreateUniversityUIController extends MainController {
	
	@FXML
	TextField nameTextField;
	
	@FXML
	TextField addressTextField;
	
	@FXML
	ChoiceBox<String> citiesChoiceBox;
	
	@FXML
	ImageView nameWarning;

	@FXML
	Text errorText;
	
	protected UniversityFacade universityFacade = new UniversityFacade();
	protected ArrayList<City> citiesAL;
	protected User currentUser = MainController.getUserFacade().getCurrentUser();
	
	/**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	if(currentUser == null){
    		try {
				setSceneContent("LoginOverview");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	else {
    		citiesAL = universityFacade.getAllCities();
    		if(!citiesAL.isEmpty()) {
	    		for(City city : citiesAL) {
	    			citiesChoiceBox.getItems().add(city.getName());
	    		}
	    		citiesChoiceBox.setValue(citiesChoiceBox.getItems().get(0));
    		}
    		else {
    			citiesChoiceBox.getItems().add("No university");
    			citiesChoiceBox.setDisable(true);
    		}
    	}
    }
	
    /**
     * Check if the fields are correctly given and try to create the university
     */
	@FXML
	public void createUniversityButton() {
		if(nameTextField.getText().isEmpty()) {
    		nameWarning.setVisible(true);
    		errorText.setText("You need to specify a name");
    	}
		else {
			try{
    			universityFacade.createUniversity(nameTextField.getText(), addressTextField.getText(), citiesChoiceBox.getValue().toString(), currentUser.getId());
	    		System.out.println("The university has been created");
	    		try {
					setSceneContent("IndexUniversities");
				} catch (IOException e) {
					e.printStackTrace();
				}
	    	} catch(Exception e){
	    		errorText.setText(e.getMessage());
			}
		}
	}
	
	/**
	 * Cancel the creation of the university
	 */
	@FXML
	public void cancelCreateUniversityButton() {
		try {
			setSceneContent("IndexUniversities");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
