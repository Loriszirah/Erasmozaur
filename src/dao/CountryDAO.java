package dao;
import java.util.*;

/**
 * 
 */
public interface CountryDAO {

    /**
     * @param name 
     * @return
     */
    public country createCountry(String name);

    /**
     * @param country 
     * @return
     */
    public void updateCountry(void country);

    /**
     * @param country
     */
    public void deleteCountry(void country);

    /**
     * @param id_country 
     * @return
     */
    public country getCountry(int id_country);

    /**
     * @return
     */
    public ArrayList<Country> indexCountries();

}