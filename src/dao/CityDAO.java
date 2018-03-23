package dao;
import java.util.*;

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
    public void updateCity(void city);

    /**
     * @param city
     */
    public void deleteCity(void city);

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