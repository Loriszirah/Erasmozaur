package dao;
import java.util.ArrayList;
import java.util.Date;

import model.Scholarship;
import presenters.ScholarshipPresenter;

/**
 * 
 */
public interface ScholarshipDAO {

    /**
     * Create a scholarship
     * @param description
     * @param duration
     * @param startDate
     * @param endDate
     * @param domain
     * @param id_receiving_university
     * @return a scholarship with the given parameters
     */
    public Scholarship createScholarship(String description, int duration, Date startDate, Date endDate, String domain, int id_receiving_university);

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
     * @param id_university 
     * @return
     */
    public ScholarshipPresenter viewScholarshipPresenter(int id_university);
    /**
     * List all scholarships presenters 
     * @return a list of scholarships presenters
     */
    public ArrayList<ScholarshipPresenter> getAllScholarshipPresenters();
    
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