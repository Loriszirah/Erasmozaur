package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import dao.*;
import model.Application;
import model.Scholarship;

/**
 * 
 */
public class ApplicationDAOPostgres extends AbstractDAOPostgres implements ApplicationDAO {
 	private static ApplicationDAOPostgres instance = new ApplicationDAOPostgres();
 	protected String url;
    protected String userDB;
    protected String passwdDB;
    protected Connection conn;
	
	
	public static ApplicationDAOPostgres getApplicationDAOPostgres() {
		return ApplicationDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private ApplicationDAOPostgres() {
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

	@Override
	public Application createApplication(Date date, String comment,int id_student, int id_scholarship) {
		try {
				openConnection();
			
			// Creation of a Statement object
			Statement state = conn.createStatement();

			//The object ResultSet contains the result of the SQL request
			state.executeUpdate("INSERT INTO Applications (date, comment, id_student, id_scholarship) VALUES('"+date+"','"+comment+"','"+id_student+"','"+id_scholarship+"')");

			// The object ResultSet contains the result of the SQL request
			ResultSet result = state.executeQuery("SELECT * FROM Scholarships WHERE id_student = "+id_student+" AND id_scholarship='"+id_scholarship+"'");

			// Get the user in the database if exists and create the user
			if(result.next()) {
				Application application = new Application(result.getInt("id_application"), result.getDate("date"), result.getString("comment"), result.getInt("id_student"), result.getInt("id_scholarship"));
				return application;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Application viewApplication(int id_application) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateApplication(int id_application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteApplication(int id_application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Application> getAllApplications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStatusApplication(int id_application, boolean status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDocumentToApplication(int id_application, int id_document) {
		// TODO Auto-generated method stub
		
	}

}