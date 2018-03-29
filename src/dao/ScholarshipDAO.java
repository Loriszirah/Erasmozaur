package dao;
import java.util.*;
import model.*;
import presenters.ScholarshipPresenter;

/**
 * 
 */
public interface ScholarshipDAO {

    /**
     * Create a scholarship
     * @param description Description of the scholarship
     * @param duration Duration of the scholarship in months
     * @param startDate Date of the beginning of the scholarship
     * @param endDate Date of the ending of the scholarship
     * @param domain It's the specialty of this scholarship
     * @param id_sending_university The id of the university sending the student
     * @param id_receiving_university The id of the university receiving the student
     * @return the scholarship with all these informations
     */
    public Scholarship createScholarship(String description, int duration, Date startDate, Date endDate, String domain, int id_sending_university, int id_receiving_university);

    /**
     * Update the scholarship
     * @param scholarship Is the scholarship modified that will be save in database
     */
    public void updateScholarship(Scholarship scholarship);

    /**
     * Delete the scholarship
     * @param id_scholarship
     */
    public void deleteScholarship(int id_scholarship);

    /**
     * Select a scholarship 
     * @param id_scholarship ID of a scholarship
     * @return the scholarship find by the id
     */
    public Scholarship viewScholarship(int id_scholarship);

    /**
     * List all scholarships 
     * @return a list of scholarships
     */
    public ArrayList<Scholarship> getAllScholarships();
    
    /**
     * List all scholarships for a university
     * @param id_sending_university ID of the university sending a student
     * @return an ArrayList of all scholarships for a university
     */
    public ArrayList<Scholarship> getAllScholarshipsByUniversity(int id_sending_university);

    /**
     * 
     * @param id_user
     * @return a boolean, true if it exists else false
     */
    public boolean checkIfExists(int id_user);

}