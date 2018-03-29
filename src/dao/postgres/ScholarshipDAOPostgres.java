package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import dao.*;
import model.*;

/**
 * 
 */
public class ScholarshipDAOPostgres implements ScholarshipDAO {
    private static ScholarshipDAOPostgres instance = new ScholarshipDAOPostgres();
	
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
	
	public static ScholarshipDAOPostgres getScholarshipDAOPostgres() {
		return ScholarshipDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private ScholarshipDAOPostgres() {
    	this.url = System.getenv("DBurl");
		this.userDB =System.getenv("DBuser");
		this.passwdDB = System.getenv("DBpwd");
		this.openConnection();
    }

    /**
     * @param description 
     * @param duration 
     * @param startDate 
     * @param endDate 
     * @return
     */
    public Scholarship createScholarship(String description, int duration, Date startDate, Date endDate, String domain, int id_sending_university, int id_receiving_university) {
    	try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			// Creation of a Statement object
			Statement state = conn.createStatement();

			//The object ResultSet contains the result of the SQL request
			state.executeUpdate("INSERT INTO Scholarships (description, duration, startDate, endDate, domain, id_sending_university, id_receiving_university) VALUES('"+description+"','"+duration+"','"+startDate+"','"+endDate+"','"+domain+"','"+id_sending_university+"','"+id_receiving_university+"')");

			// The object ResultSet contains the result of the SQL request
			ResultSet result = state.executeQuery("SELECT * FROM Scholarships WHERE id_sending_university="+id_sending_university+" AND id_receiving_university = "+id_receiving_university+" AND startdate='"+startDate+"'");

			// Get the user in the database if exists and create the user
			if(result.next()) {
				Scholarship scholarship = new Scholarship(result.getInt("id_scholarship"), result.getString("description"), result.getInt("duration"), result.getDate("startdate"), result.getDate("enddate"), result.getString("domain"), result.getInt(id_sending_university), result.getInt(id_receiving_university));
				return scholarship;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * @param id_scholarship
     */
    public void updateScholarship(int id_scholarship) {
        // TODO implement here
    }

    /**
     * @param id_scholarship
     */
    public void deleteScholarship(int id_scholarship) {
        // TODO implement here
    }

    /**
     * @param id_scholarship 
     * @return
     */
    public Scholarship viewScholarship(int id_scholarship) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Scholarship> getAllScholarships() {
        // TODO implement here
        return null;
    }

    /**
     * @param id_user 
     * @return
     */
    public boolean checkIfExists(int id_user) {
        // TODO implement here
        return false;
    }

}