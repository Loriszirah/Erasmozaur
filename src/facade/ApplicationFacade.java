package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.ApplicationDAO;
import model.*;

/**
 * 
 */
public class ApplicationFacade {

	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private ApplicationDAO applicationDAO = factory.getApplicationDAO();
    
    /**
     * Default constructor
     */
    public ApplicationFacade() {
    }


    /**
     * Create an application
     * @param userId 
     * @param startDate 
     * @param duration 
     * @param comment 
     * @return the application with the given parameters
     */
    public Application createApplication( Date startDate, String comment, int id_student, int id_scholarship) {
        return applicationDAO.createApplication(startDate, comment, id_student, id_scholarship);
    }

    /**
     * Return an application
     * @param id_application 
     * @return the application corresponding to the given id
     */
    public Application viewApplication(int id_application) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_application
     */
    public void updateApplication(int id_application) {
        // TODO implement here
    }

    /**
     * @return an array list of all the applications
     */
    public ArrayList<Application> getAllApplications() {
        // TODO implement here
        return null;
    }

    /**
     * Delete the application that correspond to the given id
     * @param id_application
     */
    public void deleteApplication(int id_application) {
        // TODO implement here
    }

    /**
     * Modify the status of an application
     * @param id_application 
     * @param status, true if the application is accepted, false otherwise
     */
    public void addStatusApplication(int id_application, Boolean status) {
        // TODO implement here
    }

    /**
     * Attach a document to the given application
     * @param id_application 
     * @param id_document
     */
    public void attachDocument(int id_application, int id_document) {
        // TODO implement here
    }

}