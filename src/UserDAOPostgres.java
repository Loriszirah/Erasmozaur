import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class UserDAOPostgres extends UserDAO {
	
	public UserDAOPostgres() {
		this.url = System.getenv("DBurl");
		this.userDB =System.getenv("DBuser");
		this.passwdDB = System.getenv("DBpwd");
		this.openConnection();
	}
}
