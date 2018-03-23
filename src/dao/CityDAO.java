package dao;
import java.util.*;
import model.*;

/**
 * 
 */
public interface CityDAO {

    /**
     * @param name 
     * @return
     */
    public City createCity(String name);

    /**
     * @param city 
     * @return
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