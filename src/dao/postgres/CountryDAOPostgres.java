package dao.postgres;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.CountryDAO;
import model.Country;

/**
 * 
 */
public class CountryDAOPostgres extends AbstractDAOPostgres implements CountryDAO {
    private static CountryDAOPostgres instance = new CountryDAOPostgres();
	
	public static CountryDAOPostgres getCountryDAOPostgres() {
		return CountryDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private CountryDAOPostgres() {
    	super();
    	this.openConnection();
    }
    
    /**
     *  This function connect you to the Database
     */
    public void openConnection() {
    	try {
			this.conn = DriverManager.getConnection(url, userDB, passwdDB);
		} catch (SQLException e) {
			e.printStackTrace();
		}
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