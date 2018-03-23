package controller;
import java.util.*;
import model.*;

/**
 * 
 */
public class ApplicationFacade {

    /**
     * Default constructor
     */
    public ApplicationFacade() {
    }


    /**
     * @param userId 
     * @param startDate 
     * @param duration 
     * @param comment 
     * @return
     */
    public Application createApplication(int userId, Date startDate, int duration, String comment) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_application 
     * @return
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
     * @return
     */
    public ArrayList<Application> getAllApplications() {
        // TODO implement here
        return null;
    }

    /**
     * @param id_application
     */
    public void deleteApplication(int id_application) {
        // TODO implement here
    }

    /**
     * @param id_application 
     * @param status
     */
    public void addStatusApplication(int id_application, Boolean status) {
        // TODO implement here
    }

    /**
     * @param id_application 
     * @param id_document
     */
    public void attachDocument(int id_application, int id_document) {
        // TODO implement here
    }

}