package dao.postgres;
import dao.*;
import model.City;
import java.util.*;

/**
 * 
 */
public class CityDAOPostgres implements CityDAO {
    private static CityDAOPostgres instance = new CityDAOPostgres();
	
	
	
	public static CityDAOPostgres getCityDAOPostgres() {
		return CityDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    public CityDAOPostgres() {
    }

    /**
     * @param name 
     * @return
     */
    public City createCity(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param city 
     * @return
     */
    public void updateCity(City city) {
        // TODO implement here
    }

    /**
     * @param city
     */
    public void deleteCity(City city) {
        // TODO implement here
    }

    /**
     * @param id_city 
     * @return
     */
    public City getCity(int id_city) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<City> indexCities() {
        // TODO implement here
        return null;
    }

}