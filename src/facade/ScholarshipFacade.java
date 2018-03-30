package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.CityDAO;
import dao.ScholarshipDAO;
import dao.UniversityDAO;
import model.*;
import presenters.ScholarshipPresenter;
import presenters.UniversityPresenter;

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
     * Create a scholarship
     * @param description 
     * @param duration 
     * @param startDate 
     * @param endDate 
     * @return the scholarship with the given parameters
     */
    public Scholarship createScholarship(String description, int duration, Date startDate, Date endDate, String domain, int id_receiving_university) {
        return scholarshipDAO.createScholarship(description, duration, startDate, endDate, domain, id_receiving_university);
    }

    /**
     * @param id_scholarship
     */
    public void updateScholarship(int id_scholarship) {
        // TODO implement here
    }

    /**
     * Delete a scholarship
     * @param id_scholarship
     */
    public void deleteScholarship(int id_scholarship) {
        scholarshipDAO.deleteScholarship(id_scholarship);
    }

    /**
     * @param id_scholarship 
     * @return a scholarship with the given id
     */
    public Scholarship viewScholarship(int id_scholarship) {
        return scholarshipDAO.viewScholarship(id_scholarship);
    }

    /**
     * @return an array list of all the scholarships
     */
    public ArrayList<Scholarship> getAllScholarships() {
        return scholarshipDAO.getAllScholarships();
    }
    
    /**
     * @return an array list of all the scholarships
     */
    public ArrayList<Scholarship> indexScholarships() {
    	return scholarshipDAO.getAllScholarships();
    }
    
    public ScholarshipPresenter viewScholarshipPresenter(int id_scholarship) {
        return scholarshipDAO.viewScholarshipPresenter(id_scholarship);
    }
    
    /**
     * @return an array list of all the scholarships
     */
    public ArrayList<ScholarshipPresenter> indexScholarshipPresenters() {
    	return scholarshipDAO.getAllScholarshipPresenters();
    }
    
    /**
     * @return an array list of all the scholarships of the given university
     */
    public ArrayList<Scholarship> getAllScholarshipByUniversities(int id_university) {
        return scholarshipDAO.getAllScholarshipsByUniversity(id_university);
    }
}