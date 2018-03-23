package dao;
import java.util.*;

/**
 * 
 */
public interface UniversityDAO {

    /**
     * @param name 
     * @param address 
     * @return
     */
    public University createUniversity(String name, String address);

    /**
     * @param id_university 
     * @return
     */
    public University viewUniversity(Int id_university);

    /**
     * @param id_university
     */
    public void updateUniversity(Int id_university);

    /**
     * @param id_university
     */
    public void deleteUniversity(Int id_university);

    /**
     * @return
     */
    public ArrayList<University> getAllUniversities();

    /**
     * @param id_university 
     * @return
     */
    public boolean checkIfExists(int id_university);

}