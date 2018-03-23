package dao;
import java.util.*;

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
    public Scholarship createScholarship(String description, int duration, Date startDate, Date endDate);

    /**
     * @param id_scholarship
     */
    public void updateScholarship(Int id_scholarship);

    /**
     * @param id_scholarship
     */
    public void deleteScholarship(Int id_scholarship);

    /**
     * @param id_scholarship 
     * @return
     */
    public Scholarship viewScholarship(Int id_scholarship);

    /**
     * @return
     */
    public ArrayList<Scholarship> getAllScholarships();

    /**
     * @param id_user 
     * @return
     */
    public boolean checkIfExists(int id_user);

}