package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import model.*;
import presenters.UniversityPresenter;
import dao.*;

/**
 * 
 */
public class UniversityDAOPostgres extends AbstractDAOPostgres implements UniversityDAO {
    private static UniversityDAOPostgres instance = new UniversityDAOPostgres();
	
	public static UniversityDAOPostgres getUniversityDAOPostgres() {
		return UniversityDAOPostgres.instance;
	}
	
    /**
     * Default constructor
     */
    private UniversityDAOPostgres() {
    	super();
		this.openConnection();
	}

	/**
	 * @param name 
	 * @param address 
	 * @param city
	 * @return
	 * @throws Exception 
	 */
	public University createUniversity(String name, String address, String city) throws Exception {
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			// Creation of a Statement object
			Statement state = conn.createStatement();

			// Select the id of the type_user
			ResultSet result = state.executeQuery("SELECT id_city FROM Cities WHERE name = '"+city+"'");
			int id=0;
			if(result.next()) {
				id = result.getInt("id_city");
			} else {
				throw new Exception("Problem in the selection of a city");
			}
			//The object ResultSet contains the result of the SQL request
			state.executeUpdate("INSERT INTO Universities (name, address, id_city) VALUES('"+name+"','"+address+"','"+id+"')");

			// The object ResultSet contains the result of the SQL request
			result = state.executeQuery("SELECT * FROM cities WHERE name='"+name+"'");

			// Get the user in the database if exists and create the user
			if(result.next()) {
				University university = new University(result.getInt("id_university"), result.getString("name"), result.getString("address"), result.getInt("id_city"));
				return university;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param id_university 
	 * @return
	 */
	public University viewUniversity(int id_university) {
		University university = null;
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();
			// Check if the username already exist

			ResultSet exists = state.executeQuery("SELECT * FROM Universities WHERE id_university = "+id_university+";");

			String nameUniversity;
			String addressUniversity;
			int id_city;
			if(exists.next()) {
				nameUniversity = exists.getString("name");
				addressUniversity = exists.getString("address");
				id_city = exists.getInt("id_city");
				university = new University(id_university,nameUniversity,addressUniversity,id_city);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return university;
	}
	
	/**
	 * @param id_university 
	 * @return
	 */
	public UniversityPresenter viewUniversityPresenter(int id_university) {
		UniversityPresenter universityPresenter = null;
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();
			// Check if the username already exist

			ResultSet exists = state.executeQuery("SELECT id_university, address, Universities.name nameUniversity, Cities.name cityName, Countries.name countryName "
					+ "FROM Universities, Cities, Countries "
					+ "WHERE Universities.id_city = Cities.id_city "
					+ "AND Cities.id_country = Countries.id_country "
					+ "AND id_university = "+id_university+";");

			String nameUniversity, addressUniversity, cityName, countryName;
			if(exists.next()) {
				nameUniversity = exists.getString("nameUniversity");
				addressUniversity = exists.getString("address");
				cityName = exists.getString("cityName");
				countryName = exists.getString("countryName");
				
				universityPresenter = new UniversityPresenter(id_university,nameUniversity,addressUniversity,cityName,countryName);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return universityPresenter;
	}

	/**
	 * @param id_university
	 */
	public void updateUniversity(int id_university) {
		// TODO implement here
	}

	/**
	 * @param id_university
	 */
	public void deleteUniversity(int id_university) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public ArrayList<University> getAllUniversities() { 
		ArrayList<University> universities = new ArrayList<University>();
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();
			// Check if the username already exist

			ResultSet exists = state.executeQuery("SELECT * FROM Universities;");

			int id_university;
			String nameUniversity;
			String addressUniversity;
			int id_city;
			if(exists.next()) {
				id_university = exists.getInt("id_university");
				nameUniversity = exists.getString("name");
				addressUniversity = exists.getString("address");
				id_city = exists.getInt("id_city");
				universities.add(new University(id_university,nameUniversity,addressUniversity,id_city));
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return universities;
	} 


	/**
	 * @return
	 */
	public ArrayList<UniversityPresenter> getAllUniversitiesPresenter() {
		ArrayList<UniversityPresenter> universities = new ArrayList<UniversityPresenter>();
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();
			// Check if the username already exist

			ResultSet exists = state.executeQuery("SELECT id_university, address, Universities.name nameUniversity, Cities.name cityName, Countries.name countryName "
					+ "FROM Universities, Cities, Countries "
					+ "WHERE Universities.id_city = Cities.id_city "
					+ "AND Cities.id_country = Countries.id_country ;");

			int id_university;
			String nameUniversity, address, nameCity, nameCountry;
			
			if(exists.next()) {
				id_university = exists.getInt("id_university");
				nameUniversity = exists.getString("nameUniversity");
				address = exists.getString("address");
				nameCity = exists.getString("cityName");
				nameCountry = exists.getString("countryName");
				universities.add(new UniversityPresenter(id_university, nameUniversity, address, nameCity, nameCountry));
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return universities;
	}

	/**
	 * @param id_university 
	 * @return
	 */
	public boolean checkIfExists(int id_university) {
		// TODO implement here
		return false;
	}

}