package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import model.*;
import dao.*;

/**
 * 
 */
public class UniversityDAOPostgres implements UniversityDAO {
    private static UniversityDAOPostgres instance = new UniversityDAOPostgres();
    protected String url;
    protected String userDB;
    protected String passwdDB;
    protected Connection conn;
	
 // This function connect you to the Database
    public void openConnection() {
    	try {
			this.conn = DriverManager.getConnection(url, userDB, passwdDB);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	
	public static UniversityDAOPostgres getUniversityDAOPostgres() {
		return UniversityDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private UniversityDAOPostgres() {
    	this.url = System.getenv("DBurl");
		this.userDB =System.getenv("DBuser");
		this.passwdDB = System.getenv("DBpwd");
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
        // TODO implement here
        return null;
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
				System.out.println("good");
			}
			System.out.println("done");
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
     * @param id_university 
     * @return
     */
    public boolean checkIfExists(int id_university) {
        // TODO implement here
        return false;
    }

}