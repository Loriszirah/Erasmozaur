package dao;
import java.util.*;
import model.*;
import presenters.UniversityPresenter;

/**
 * 
 */
public interface UniversityDAO {

    /**
     * @param name 
     * @param address 
     * @return
     * @throws Exception 
     */
    public University createUniversity(String name, String address, String city, int id_responsible) throws Exception;

    /**
     * @param id_university 
     * @return
     */
    public University viewUniversity(int id_university);

    /**
     * @param id_university 
     * @return
     */
    public UniversityPresenter viewUniversityPresenter(int id_university);
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
	 * @return
	 */
	public ArrayList<UniversityPresenter> getAllUniversitiesPresenter();

    /**
     * @param id_university 
     * @return
     */
    public boolean checkIfExists(int id_university);
    
    /**
     * Check if a university already exists with this name
     * @param username 
     * @return true if a university already exists with this name, false otherwise
     */
    public boolean checkIfExistsWithName(String name);

}