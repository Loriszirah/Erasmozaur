package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
    public Scholarship createScholarship(String description, int duration, Date startDate, Date endDate) {
        // TODO implement here
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