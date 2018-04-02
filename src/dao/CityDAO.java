package dao;
import java.util.*;
import model.*;

/**
 * 
 */
public interface CityDAO {

    /**
     * Create a city
     * @param name : Name of the city
     * @return The city created
     */
    public City createCity(String name);

    /**
     * @param city 
     */
    public void updateCity(City city);

    /**
     * @param city
     */
    public void deleteCity(City city);

    /**
     * @param id_city 
     * @return
     */
    public City getCity(int id_city);

    /**
     * @return
     */
    public ArrayList<City> indexCities();

}