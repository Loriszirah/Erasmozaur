package dao;
import java.util.*;
import model.*;

/**
 * 
 */
public interface ApplicationDAO {

    /**
     * 
     * @param startDate
     * @param comment
     * @param id_student
     * @param id_scholarship
     * @return
     */
    public Application createApplication(Date startDate, String comment,int id_student, int id_scholarship );

    /**
     * 
     * @param id_application
     * @return
     */
    public Application viewApplication(int id_application);

    /**
     * 
     * @param id_application
     */
    public void updateApplication(int id_application);

    /**
     * 
     * @param id_application
     */
    public void deleteApplication(int id_application);

    /**
     * 
     * @return
     */
    public ArrayList<Application> getAllApplications();

    /**
     * 
     * @param id_application
     * @param status
     */
    public void addStatusApplication(int id_application, boolean status);

    /**
     * 
     * @param id_application
     * @param id_document
     */
    public void addDocumentToApplication(int id_application, int id_document);

}