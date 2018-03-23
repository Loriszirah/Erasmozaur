package dao;
import java.util.*;
import model.*;

/**
 * 
 */
public interface ApplicationDAO {

    /**
     * 
     */
    public Application createApplication(int userId, Date startDate, int duration , String comment);

    /**
     * 
     */
    public Application viewApplication(int id_application);

    /**
     * 
     */
    public void updateApplication(int id_application);

    /**
     * 
     */
    public void deleteApplication(int id_application);

    /**
     * 
     */
    public ArrayList<Application> getAllApplications();

    /**
     * 
     */
    public void addStatusApplication(int id_application, boolean status);

    /**
     * 
     */
    public void addDocumentToApplication(int id_application, int id_document);

}