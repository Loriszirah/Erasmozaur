package dao;
import java.util.*;
import model.*;
import presenters.ScholarshipPresenter;

/**
 * 
 */
public interface ScholarshipDAO {

    /**
     * @param description 
     * @param duration 
     * @param startDate 
     * @param endDate 
     * @return
     */
    public Scholarship createScholarship(String description, int duration, Date startDate, Date endDate, String domain, int id_sending_university, int id_receiving_university);

    /**
     * @param id_scholarship
     */
    public void updateScholarship(int id_scholarship);

    /**
     * @param id_scholarship
     */
    public void deleteScholarship(int id_scholarship);

    /**
     * @param id_scholarship 
     * @return
     */
    public Scholarship viewScholarship(int id_scholarship);

    /**
     * @return
     */
    public ArrayList<Scholarship> getAllScholarships();
    
    public ArrayList<Scholarship> getAllScholarshipsByUniversity(int id_sending_university);
    
    public ArrayList<ScholarshipPresenter> getAllScholarshipsPresenterByUniversity(int id_sending_university);

    /**
     * @param id_user 
     * @return
     */
    public boolean checkIfExists(int id_user);

}