package dao.postgres;
import java.util.*;
import model.*;
import dao.*;

/**
 * 
 */
public class UniversityDAOPostgres implements UniversityDAO {
    private static UniversityDAOPostgres instance = new UniversityDAOPostgres();
	
	
	
	public static UniversityDAOPostgres getUniversityDAOPostgres() {
		return UniversityDAOPostgres.instance;
	}
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
    public University viewUniversity(int id_university) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university
     */
    public void updateUniversity(int id_university) {
        // TODO implement here
    }

    /**
     * @param id_university
     */
    public void deleteUniversity(int id_university) {
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