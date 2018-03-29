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
public class UserDAOPostgres implements UserDAO {
	protected String url;
    protected String userDB;
    protected String passwdDB;
    protected Connection conn;
    private static UserDAOPostgres instance = new UserDAOPostgres();
	
	private UserDAOPostgres() {
		this.url = System.getenv("DBurl");
		this.userDB =System.getenv("DBuser");
		this.passwdDB = System.getenv("DBpwd");
		this.openConnection();
	}
	
	public static UserDAOPostgres getUserDAOPostgres() {
		return UserDAOPostgres.instance;
	}
	
    /**
     * @param firstName 
     * @param lastName 
     * @param password 
     * @param email 
     * @param username 
     * @param birthDate 
     * @param address 
     * @return
     */
    public User createUser(String firstName, String lastName, String role, String password, String email, String username, Date birthDate, String address) {
        // TODO implement here
    	try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    // Check if the username already exist
		    ResultSet exists = state.executeQuery("SELECT COUNT(*) as nb FROM Users WHERE username ='"+username+"';");
		    if(exists.next()) {
		    	if(exists.getInt("nb")>0) {
		    		return null;
		    	}
		    }
		    // Select the id of the type_user
		    ResultSet result = state.executeQuery("SELECT id_type_user FROM Types_user WHERE name = '"+role+"'");
	    	int id=0;
		    if(result.next()) {
		    	id = result.getInt("id_type_user");
		    }
		    else {
		    	return null;
		    }
		    //The object ResultSet contains the result of the SQL request
		    state.executeUpdate("INSERT INTO Users (username, password, firstname, lastname, email, address, id_role) VALUES('"+username+"','"+password+"','"+firstName+"','"+lastName+"','"+email+"','"+address+"','"+Integer.toString(id)+"')");
		    
		    //The object ResultSet contains the result of the SQL request
		    result = state.executeQuery("SELECT * FROM users WHERE username='"+username+"'");
		    //We get the MetaData
			ResultSetMetaData resultMeta = result.getMetaData();
			//Get the user in the database if exists and create the user
			if(result.next()) {
				User user = new User(result.getInt("id_user"), result.getString("firstName"), result.getString("lastName"), result.getString("password"), result.getString("email"), result.getString("username"), null, result.getString("address"), result.getInt("id_role"));
				return user;
			} else {
				return null;
			}
    	}catch(SQLException e) {
		      e.printStackTrace();
		      return null;
		}
    }
    
    public User login(String username, String password) {
    	User user = null;
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    //The object ResultSet contains the result of the SQL request
		    ResultSet result = state.executeQuery("SELECT * FROM users WHERE username='"+username+"' and password='"+password+"'");
		    //We get the MetaData
			ResultSetMetaData resultMeta = result.getMetaData();
			//Get the user in the database if exists and create the user
			if(result.next()) {
				user = new User(result.getInt("id_user"), result.getString("firstname"), result.getString("lastname"), result.getString("password"), result.getString("email"), result.getString("username"), null, result.getString("address"), result.getInt("id_role"));
			} else {
				System.out.println("'User' does not exist!");
				user = null;
			}
		}catch(SQLException e) {
		      return null;
		}
		return user;
    }
    
    public boolean register(String username, String password, String role) {
    	try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    // Check if the username already exist
		    ResultSet exists = state.executeQuery("SELECT COUNT(*) as nb FROM Users WHERE username ='"+username+"';");
		    if(exists.next()) {
		    	if(exists.getInt("nb")>0) {
		    		return false;
		    	}
		    }
		    // Select the id of the type_user
		    ResultSet result = state.executeQuery("SELECT id_type_user FROM Types_user WHERE name = '"+role+"'");
	    	int id=0;
		    if(result.next()) {
		    	id = result.getInt("id_type_user");
		    }
		    else {
		    	return false;
		    }
		    //The object ResultSet contains the result of the SQL request
		    state.executeUpdate("INSERT INTO Users (username, password, id_type_user) VALUES('"+username+"','"+password+"','"+Integer.toString(id)+"')");
		    
    	}catch(SQLException e) {
		      e.printStackTrace();
		      return false;
		}
    	return true;
    }
    
    // This function connect you to the Database
    public void openConnection() {
    	try {
			this.conn = DriverManager.getConnection(url, userDB, passwdDB);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    /**
     * 
     */
    public void leaveUniversity() {
        // TODO implement here
    }

    /**
     * @param id_user
     */
    public void updateUser(int id_user) {
        // TODO implement here
    }

    /**
     * @param id_user
     */
    public void deleteUser(int id_user) {
        // TODO implement here
    }

    /**
     * @param id_user 
     * @return
     */
    public User viewUser(int id_user) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @param id_user
     */
    public void joinUniversity(int id_university, int id_user) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<User> getAllUsers() {
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

    /**
     * @param id_role 
     * @return
     */
    public ArrayList<User> getAllUsersByRole(int id_role) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @param id_role 
     * @return
     */
    public ArrayList<User> getAllUsersByUniversityRole(int id_university, int id_role) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @return
     */
    public ArrayList<User> getAllUsersByUniversity(int id_university) {
        // TODO implement here
        return null;
    }

}