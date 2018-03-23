package dao.postgres;
import java.util.*;
import dao.*;
import model.*;

/**
 * 
 */
public class ScholarshipDAOPostgres implements ScholarshipDAO {

    /**
     * Default constructor
     */
    public ScholarshipDAOPostgres() {
    }

    /**
     * @param description 
     * @param duration 
     * @param startDate 
     * @param endDate 
     * @return
     */
    public Scholarship createScholarship(String description, int duration, Date startDate, Date endDate) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_scholarship
     */
    public void updateScholarship(int id_scholarship) {
        // TODO implement here
    }

    /**
     * @param id_scholarship
     */
    public void deleteScholarship(int id_scholarship) {
        // TODO implement here
    }

    /**
     * @param id_scholarship 
     * @return
     */
    public Scholarship viewScholarship(int id_scholarship) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Scholarship> getAllScholarships() {
        // TODO implement here
        return null;
    }

    /**
     * @param id_user 
     * @return
     */
    public boolean checkIfExists(int id_user) {
        // TODO implement here
        return false;
    }

}