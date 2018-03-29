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
     * @return
     */
    public University createUniversity(String name, String address) {
        // TODO implement here
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
  System.out.println("1");
    		ArrayList<University> universities = new ArrayList<University>();
System.out.println("3");
     	try {
			if(!this.conn.isValid(1)) {
				openConnection();
				System.out.println("good");
			}
			System.out.println("done");
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    // Check if the username already exist

		    ResultSet exists = state.executeQuery("SELECT name FROM Universities;");

		    String nameUniversity;
		    if(exists.next()) {
		    	nameUniversity = exists.getString("name");
		    	System.out.println("yoyo" + nameUniversity);
		    	universities.add(new University(nameUniversity));
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