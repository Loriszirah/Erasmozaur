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
public class RoleDAOPostgres extends AbstractDAOPostgres implements RoleDAO {
    private static RoleDAOPostgres instance = new RoleDAOPostgres();
	
	public static RoleDAOPostgres getRoleDAOPostgres() {
		return RoleDAOPostgres.instance;
	}
	
    /**
     * Default constructor
     */
    private RoleDAOPostgres() {
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

    public Role createRole(String name, String description) {
        // TODO implement here
        return null;
    }

    public Role viewRole(int id_role) {
    	Role role = null;
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();
			// Check if the username already exist

			ResultSet exists = state.executeQuery("SELECT * FROM Roles WHERE id_role = "+id_role+";");

			String name, description;
			if(exists.next()) {
				name = exists.getString("name");
				description = exists.getString("description");
				role = new Role(id_role,name,description);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return role;
    }

    public void updateRole(int id_role) {
        // TODO implement here
    }

    public void deleteRole(int id_role) {
        // TODO implement here
    }

    public ArrayList<Role> getAllRoles() {
    	ArrayList<Role> roles = new ArrayList<Role>();
    	try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    
		    ResultSet exists = state.executeQuery("SELECT name FROM Roles;");
		    String nameRole, description;
		    int id_role;
		    while(exists.next()) {
		    	id_role = exists.getInt("id_role");
		    	nameRole = exists.getString("name");
		    	description = exists.getString("description");
		    	roles.add(new Role(id_role,nameRole,description));
		    }
    	}catch(SQLException e) {
		      e.printStackTrace();
		      return null;
		}
        return roles;
    }
}