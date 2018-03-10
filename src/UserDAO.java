import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class UserDAO {
	String url;
    String userDB;
    String passwdDB;
    Connection conn;
    
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
				user = new User(result.getInt("id_user"), result.getString("username"), result.getString("password"), result.getInt("id_type_user"));
			}
		}catch(SQLException e) {
		      e.printStackTrace();
		}
		return user;
    }
    
    public boolean register(String username, String password, String typeUser) {
    	try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
		    //Creation of a Statement object
		    Statement state = conn.createStatement();
		    // Select the id of the type_user
		    ResultSet result = state.executeQuery("SELECT id_type_user FROM Types_user WHERE name = '"+typeUser+"'");
	    	int id=0;
		    if(result.next()) {
		    	id = result.getInt("id_type_user");
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
}
