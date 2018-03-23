package dao;
import java.util.*;

/**
 * 
 */
public interface ApplicationDAO {

    /**
     * 
     */
    public void createApplication(userId: int, startDate: Date,  duration: int ,  comment: String): Application;

    /**
     * 
     */
    public void viewApplication(id_application: int): Application;

    /**
     * 
     */
    public void updateApplication(id_application: int);

    /**
     * 
     */
    public void deleteApplication(id_application: int);

    /**
     * 
     */
    public void getAllApplications(): ArrayList<Application>;

    /**
     * 
     */
    public void addStatusApplication(id_application: int, status: Boolean);

    /**
     * 
     */
    public void addDocumentToApplication(id_application: int, id_document: int);

}