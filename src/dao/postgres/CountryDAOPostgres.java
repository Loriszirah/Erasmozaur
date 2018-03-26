package dao.postgres;
import java.util.*;
import dao.*;
import model.*;

/**
 * 
 */
public class CountryDAOPostgres implements CountryDAO {
    private static CountryDAOPostgres instance = new CountryDAOPostgres();
	
	
	
	public static CountryDAOPostgres getCountryDAOPostgres() {
		return CountryDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private CountryDAOPostgres() {
    }

    /**
     * @param name 
     * @return
     */
    public Country createCountry(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param country 
     * @return
     */
    public void updateCountry(Country country) {
        // TODO implement here
    }

    /**
     * @param country
     */
    public void deleteCountry(Country country) {
        // TODO implement here
    }

    /**
     * @param id_country 
     * @return
     */
    public Country getCountry(int id_country) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Country> indexCountries() {
        // TODO implement here
        return null;
    }

}