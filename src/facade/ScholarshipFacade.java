package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.CityDAO;
import dao.ScholarshipDAO;
import dao.UniversityDAO;
import model.*;

/**
 * 
 */
public class ScholarshipFacade {
	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private ScholarshipDAO scholarshipDAO = factory.getScholarshipDAO();

    /**
     * Default constructor
     */
    public ScholarshipFacade() {
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
    public  ArrayList<Scholarship> getAllScholarship() {
        return scholarshipDAO.getAllScholarships();
    }
    
    /**
     * @return
     */
    public ArrayList<Scholarship> getAllScholarshipByUniversities(int id_university) {
        return scholarshipDAO.getAllScholarshipsByUniversity(id_university);
    }

}