package dao.postgres;
import dao.*;
import model.City;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

/**
 * 
 */
public class CityDAOPostgres implements CityDAO {
    private static CityDAOPostgres instance = new CityDAOPostgres();
    protected String url;
    protected String userDB;
    protected String passwdDB;
    protected Connection conn;
	
	
	public static CityDAOPostgres getCityDAOPostgres() {
		return CityDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private CityDAOPostgres() {
    	this.url = System.getenv("DBurl");
		this.userDB =System.getenv("DBuser");
		this.passwdDB = System.getenv("DBpwd");
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
        // TODO implement here
        return null;
    }

}