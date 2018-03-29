package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.CityDAO;
import dao.CountryDAO;
import dao.RoleDAO;
import dao.UniversityDAO;
import model.*;
import presenters.UniversityPresenter;

/**
 * 
 */
public class UniversityFacade {
	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private UniversityDAO universityDAO = factory.getUniversityDAO();
    private CityDAO cityDAO = factory.getCityDAO();
    private CountryDAO countryDAO = factory.getCountryDAO();
	
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
    public University createUniversity(String name, String address, String city, int id_responsible) throws Exception{
    	if(checkIfExistsWithName(name)) {
    		throw new Exception("A university with this name already exists");
    	}
    	
    	University university = null;
		university = universityDAO.createUniversity(name, address, city, id_responsible);
    	return university;
    }
    
    /**
     * Check if a university already exists with this name
     * @param username 
     * @return true if a university already exists with this name, false otherwise
     */
	private boolean checkIfExistsWithName(String name) {
		return universityDAO.checkIfExistsWithName(name);
	}

    /**
     * @return
     */
    public ArrayList<University> getAllUniversities() {
        return universityDAO.getAllUniversities();
    }
    
    /**
     * @return
     */
    public ArrayList<UniversityPresenter> getAllUniversitiesPresenter() {
        return universityDAO.getAllUniversitiesPresenter();
    }

    /**
     * @param id_university 
     * @return
     */
    public University viewUniversity(int id_university) {
        return universityDAO.viewUniversity(id_university);
    }
    
    /**
     * @param id_university 
     * @return
     */
    public UniversityPresenter viewUniversityPresenter(int id_university) {
        return universityDAO.viewUniversityPresenter(id_university);
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
    
    public ArrayList<City> getAllCities(){
    		return cityDAO.indexCities();
    }

}