package dao.postgres;
import dao.*;
import model.City;
import model.Role;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * 
 */
public class CityDAOPostgres extends AbstractDAOPostgres implements CityDAO {
    private static CityDAOPostgres instance = new CityDAOPostgres();
    
	public static CityDAOPostgres getCityDAOPostgres() {
		return CityDAOPostgres.instance;
	}
	
    /**
     * Default constructor
     */
    private CityDAOPostgres() {
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
    	ArrayList<City> cities = new ArrayList<City>();
    	try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    
		    ResultSet exists = state.executeQuery("SELECT name FROM Cities;");
		    String nameCity;
		    while(exists.next()) {
		    	nameCity = exists.getString("name");
		    	cities.add(new City(nameCity));
		    }
    	}catch(SQLException e) {
		      e.printStackTrace();
		      return null;
		}
        return cities;
    }

}