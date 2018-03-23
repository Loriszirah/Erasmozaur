package dao.postgres;
import java.util.*;

/**
 * 
 */
public class UniversityDAOPostgres implements UniversityDAO {

    /**
     * Default constructor
     */
    public UniversityDAOPostgres() {
    }

    /**
     * @param name 
     * @param address 
     * @return
     */
    public University createUniversity(String name, String address) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @return
     */
    public University viewUniversity(Int id_university) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university
     */
    public void updateUniversity(Int id_university) {
        // TODO implement here
    }

    /**
     * @param id_university
     */
    public void deleteUniversity(Int id_university) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<University> getAllUniversities() {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @return
     */
    public boolean checkIfExists(int id_university) {
        // TODO implement here
        return false;
    }

}