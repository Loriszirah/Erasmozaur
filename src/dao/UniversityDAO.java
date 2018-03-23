package dao;
import java.util.*;
import model.*;

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
    public University viewUniversity(int id_university);

    /**
     * @param id_university
     */
    public void updateUniversity(int id_university);

    /**
     * @param id_university
     */
    public void deleteUniversity(int id_university);

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