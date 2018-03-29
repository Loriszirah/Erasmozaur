package dao.postgres;
import java.util.*;
import dao.*;
import model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 */
public class UserDAOPostgres extends AbstractDAOPostgres implements UserDAO {
    private static UserDAOPostgres instance = new UserDAOPostgres();
	
	private UserDAOPostgres() {
		super();
		this.openConnection();
	}
	
	public static UserDAOPostgres getUserDAOPostgres() {
		return UserDAOPostgres.instance;
	}
	
    public User createUser(String firstName, String lastName, String password, String email, String username, Date birthDate, String address, String role) throws Exception {
    	try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
		    // Creation of a Statement object
		    Statement state = conn.createStatement();
		    
		    if (checkIfExistsWithUsername(username)) {	    
			    if (checkIfExistsWithEmail(email)){
			    	throw new Exception("Email and username are already taken");
			    }
			    else {
			    	throw new Exception("Username is already taken");
			    }
		    }
		    else if(checkIfExistsWithEmail(email)) {
		    	throw new Exception("Email is already taken");
		    }
		    
		    // Select the id of the type_user
		    ResultSet result = state.executeQuery("SELECT id_role FROM Roles WHERE name = '"+role+"'");
	    	int id=0;
		    if(result.next()) {
		    	id = result.getInt("id_role");
		    } else {
		    	throw new Exception("Problem in the selection of a role");
		    }
		    //The object ResultSet contains the result of the SQL request
		    state.executeUpdate("INSERT INTO Users (username, password, firstname, lastname, email, address, id_role) VALUES('"+username+"','"+password+"','"+firstName+"','"+lastName+"','"+email+"','"+address+"','"+Integer.toString(id)+"')");
		    
		    // The object ResultSet contains the result of the SQL request
		    result = state.executeQuery("SELECT * FROM users WHERE username='"+username+"'");
			
			// Get the user in the database if exists and create the user
			if(result.next()) {
				User user = new User(result.getInt("id_user"), result.getString("firstName"), result.getString("lastName"), result.getString("password"), result.getString("email"), result.getString("username"), null, result.getString("address"), result.getInt("id_role"));
				return user;
			}
    	}catch(SQLException e) {
		      e.printStackTrace();
		}
		return null;
    }
    
    public User login(String username, String password) {
    	User user = null;
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
		    // Creation of a Statement object
		    Statement state = conn.createStatement();
		    
		    // The object ResultSet contains the result of the SQL request
		    ResultSet result = state.executeQuery("SELECT * FROM users WHERE username='"+username+"' and password='"+password+"'");
			
			// Get the user in the database if exists and create the user
			if(result.next()) {
				user = new User(result.getInt("id_user"), result.getString("firstname"), result.getString("lastname"), result.getString("password"), result.getString("email"), result.getString("username"), null, result.getString("address"), result.getInt("id_role"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
    }
 
    public boolean isResponsibleOfUniversity(int id_user) {
    	try{
    		if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    
	    	// Check if the user is responsible of a university
		    ResultSet exists = state.executeQuery("SELECT COUNT(*) as nb FROM Users us "+
		    									  "INNER JOIN Universities un ON un.id_responsible = us.id_user "+
		    									  "WHERE id_user ='"+id_user+"';");
		    if(exists.next()) {
		    	return exists.getInt("nb")>0;
		    }
    	} catch(SQLException e) {
		      e.printStackTrace();
		      return false;
		}
    	return false;
    }
    
    public void leaveUniversity() {
        // TODO implement here
    }

    public void updateUser(int id_user) {
        // TODO implement here
    }

    public void deleteUser(int id_user) {
        // TODO implement here
    }

    public User viewUser(int id_user) {
        // TODO implement here
        return null;
    }
   
    public boolean checkIfExistsWithUsername(String username) {
    	try{
    		if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    
	    	// Check if the username already exist
		    ResultSet exists = state.executeQuery("SELECT COUNT(*) as nb FROM Users WHERE username ='"+username+"';");
		    if(exists.next()) {
		    	return exists.getInt("nb")>0;
		    }
    	} catch(SQLException e) {
		      e.printStackTrace();
		      return false;
		}
    	return false;
    }
    
    public boolean checkIfExistsWithEmail(String email) {
    	try{
    		if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    
		    ResultSet existsEmail = state.executeQuery("SELECT COUNT(*) as nb FROM Users WHERE email ='"+email+"';");
		    if(existsEmail.next()) {
		    	return existsEmail.getInt("nb")>0;
		    }
    	} catch(SQLException e) {
		      e.printStackTrace();
		      return false;
		}
    	return false;
    }

    public void joinUniversity(int id_university, int id_user) {
        // TODO implement here
    }


    public ArrayList<User> getAllUsers() {
        // TODO implement here
        return null;
    }

    public boolean checkIfExists(int id_user) {
        // TODO implement here
        return false;
    }

    public ArrayList<User> getAllUsersByRole(int id_role) {
        // TODO implement here
        return null;
    }

    public ArrayList<User> getAllUsersByUniversityRole(int id_university, int id_role) {
        // TODO implement here
        return null;
    }

    public ArrayList<User> getAllUsersByUniversity(int id_university) {
        // TODO implement here
        return null;
    }
}