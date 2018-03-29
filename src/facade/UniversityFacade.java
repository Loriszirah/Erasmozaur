package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.RoleDAO;
import dao.UniversityDAO;
import model.*;

/**
 * 
 */
public class UniversityFacade {
	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private UniversityDAO universityDAO = factory.getUniversityDAO();
    /**
     * Default constructor
     */
    public UniversityFacade() {
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
     * @return
     */
    public ArrayList<University> getAllUniversities() {
    	System.out.println("2");
        return universityDAO.getAllUniversities();

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
    public void deleteUniversity(int id_university) {
        // TODO implement here
    }

    /**
     * @param id_university
     */
    public void updateUniversity(int id_university) {
        // TODO implement here
    }

}