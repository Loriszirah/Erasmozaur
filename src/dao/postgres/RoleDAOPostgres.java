package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import dao.RoleDAO;
import model.*;

/**
 * 
 */
public class RoleDAOPostgres implements RoleDAO {
    private static RoleDAOPostgres instance = new RoleDAOPostgres();
    protected String url;
    protected String userDB;
    protected String passwdDB;
    protected Connection conn;
	
	public static RoleDAOPostgres getRoleDAOPostgres() {
		return RoleDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private RoleDAOPostgres() {
    	this.url = System.getenv("DBurl");
		this.userDB =System.getenv("DBuser");
		this.passwdDB = System.getenv("DBpwd");
		this.openConnection();
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
     * @param name 
     * @param description 
     * @return
     */
    public Role createRole(String name, String description) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_role 
     * @return
     */
    public Role viewRole(int id_role) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_role
     */
    public void updateRole(int id_role) {
        // TODO implement here
    }

    /**
     * @param id_role
     */
    public void deleteRole(int id_role) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<Role> getAllRoles() {
    	ArrayList<Role> roles = new ArrayList<Role>();
    	try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    // Check if the username already exist
		    ResultSet exists = state.executeQuery("SELECT name FROM Roles;");
		    String nameRole;
		    if(exists.next()) {
		    	nameRole = exists.getString("name");
		    	System.out.println("yoyo" + nameRole);
		    	roles.add(new Role(nameRole));
		    }
    	}catch(SQLException e) {
		      e.printStackTrace();
		      return null;
		}
        return roles;
    }
}