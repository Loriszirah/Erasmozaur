package dao;
import java.util.*;
import model.*;

/**
 * 
 */
public interface CountryDAO {

    /**
     * @param name 
     * @return
     */
    public Country createCountry(String name);

    /**
     * @param country 
     */
    public void updateCountry(Country country);

    /**
     * @param country
     */
    public void deleteCountry(Country country);

    /**
     * @param id_country 
     * @return
     */
    public Country getCountry(int id_country);

    /**
     * @return
     */
    public ArrayList<Country> indexCountries();

}