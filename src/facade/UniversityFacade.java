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
     * Create a university
     * @param name 
     * @param address 
     * @return the university with the given parameters
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
     * @return an array list of all the universities
     */
    public ArrayList<University> getAllUniversities() {
        return universityDAO.getAllUniversities();
    }
    
    /**
     * @return an array list of type UniversityPresenter of all the universities
     */
    public ArrayList<UniversityPresenter> getAllUniversitiesPresenter() {
        return universityDAO.getAllUniversitiesPresenter();
    }

    /**
     * @param id_university 
     * @return the university with the given id
     */
    public University viewUniversity(int id_university) {
        return universityDAO.viewUniversity(id_university);
    }
    
    /**
     * @param id_university 
     * @return the universityPresenter of the university with the given id
     */
    public UniversityPresenter viewUniversityPresenter(int id_university) {
        return universityDAO.viewUniversityPresenter(id_university);
    }

    /**
     * Delete a university
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
    
    /**
     * @return an array list of all the cities
     */
    public ArrayList<City> getAllCities(){
    		return cityDAO.indexCities();
    }
}