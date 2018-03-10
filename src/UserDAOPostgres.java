import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class UserDAOPostgres extends UserDAO {
	
	public UserDAOPostgres() {
		this.url = "jdbc:postgresql://localhost:5432/erasmozaur";
		this.userDB = "postgres";
		this.passwdDB = "saphar02";
		this.openConnection();
	}
}
