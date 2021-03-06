package dao.postgres;
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
	public University createUniversity(String name, String address, String city, int id_responsible) throws Exception {
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			// Creation of a Statement object
			Statement state = conn.createStatement();
			
			// Select the id of the city
			ResultSet result = state.executeQuery("SELECT id_city FROM Cities WHERE name = '"+city+"'");
			int id=0;
			if(result.next()) {
				id = result.getInt("id_city");
			} else {
				throw new Exception("Problem in the selection of a city");
			}
			
			//The object ResultSet contains the result of the SQL request
			state.executeUpdate("INSERT INTO Universities (name, address, id_city, id_responsible) VALUES('"+name+"','"+address+"','"+id+"','"+id_responsible+"')");

			// The object ResultSet contains the result of the SQL request
			result = state.executeQuery("SELECT * FROM cities WHERE name='"+name+"'");

			// Get the user in the database if exists and create the user
			if(result.next()) {
				University university = new University(result.getInt("id_university"), result.getString("name"), result.getString("address"), result.getInt("id_city"), id_responsible);
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
			
			ResultSet exists = state.executeQuery("SELECT * FROM Universities WHERE id_university = "+id_university+";");

			String nameUniversity;
			String addressUniversity;
			int id_city;
			int id_responsible;
			if(exists.next()) {
				nameUniversity = exists.getString("name");
				addressUniversity = exists.getString("address");
				id_city = exists.getInt("id_city");
				id_responsible = exists.getInt("id_responsible");
				university = new University(id_university,nameUniversity,addressUniversity,id_city,id_responsible);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return university;
	}
	
	public University getByName(String name) {
		University university = null;
		if(checkIfExistsWithName(name)) {
			try {
				if(!this.conn.isValid(1)) {
					openConnection();
				}
				//Creation of a Statement object
				Statement state = conn.createStatement();

				ResultSet exists = state.executeQuery("SELECT * FROM Universities WHERE name = '"+name+"';");

				String addressUniversity;
				int id_city;
				int id_responsible;
				int id_university;
				if(exists.next()) {
					addressUniversity = exists.getString("address");
					id_city = exists.getInt("id_city");
					id_responsible = exists.getInt("id_responsible");
					id_university = exists.getInt("id_university");
					university = new University(id_university,name,addressUniversity,id_city,id_responsible);
				}
			}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
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

			ResultSet exists = state.executeQuery("SELECT Universities.id_university id, Universities.address, Users.firstname userFirstName, Users.lastname userLastName, Universities.name nameUniversity, Cities.name cityName, Countries.name countryName "
					+ "FROM Universities, Cities, Countries, Users "
					+ "WHERE Universities.id_city = Cities.id_city "
					+ "AND Cities.id_country = Countries.id_country "
					+ "AND Universities.id_university = "+id_university+" "
					+ "AND Universities.id_responsible = Users.id_user;");

			String nameUniversity, addressUniversity, cityName, countryName, responsibleName;
			if(exists.next()) {
				nameUniversity = exists.getString("nameUniversity");
				addressUniversity = exists.getString("address");
				responsibleName = exists.getString("userFirstName")+" "+exists.getString("userLastName");
				cityName = exists.getString("cityName");
				countryName = exists.getString("countryName");
				
				universityPresenter = new UniversityPresenter(id_university,nameUniversity,addressUniversity, responsibleName, cityName,countryName);
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
			int id_responsible;
			while(exists.next()) {
				id_university = exists.getInt("id_university");
				nameUniversity = exists.getString("name");
				addressUniversity = exists.getString("address");
				id_city = exists.getInt("id_city");
				id_responsible = exists.getInt("id_responsible");
				universities.add(new University(id_university,nameUniversity,addressUniversity,id_city, id_responsible));
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

			ResultSet exists = state.executeQuery("SELECT Universities.id_university id, Universities.address, Users.firstname userFirstName, Users.lastname userLastName, Universities.name nameUniversity, Cities.name cityName, Countries.name countryName "
					+ "FROM Universities, Cities, Countries, Users "
					+ "WHERE Universities.id_city = Cities.id_city "
					+ "AND Cities.id_country = Countries.id_country "
					+ "AND Universities.id_responsible = Users.id_user;");

			int id_university;
			String nameUniversity, address, nameCity, nameCountry, responsibleName;
			
			while(exists.next()) {
				id_university = exists.getInt("id");
				nameUniversity = exists.getString("nameUniversity");
				address = exists.getString("address");
				responsibleName = exists.getString("userFirstName")+" "+exists.getString("userLastName");
				nameCity = exists.getString("cityName");
				nameCountry = exists.getString("countryName");
				universities.add(new UniversityPresenter(id_university, nameUniversity, address, responsibleName, nameCity, nameCountry));
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return universities;
	}

	public boolean checkIfExistsWithName(String name) {
		try{
    		if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    
	    	// Check if the username already exist
		    ResultSet exists = state.executeQuery("SELECT COUNT(*) as nb FROM Universities WHERE name ='"+name+"';");
		    if(exists.next()) {
		    	return exists.getInt("nb")>0;
		    }
    	} catch(SQLException e) {
		      e.printStackTrace();
		      return false;
		}
    	return false;
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