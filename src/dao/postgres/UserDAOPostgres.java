package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import dao.UserDAO;

public class UserDAOPostgres extends UserDAO {
	private static UserDAOPostgres DAOPostgres;
	
	private UserDAOPostgres() {
		this.url = System.getenv("DBurl");
		this.userDB =System.getenv("DBuser");
		this.passwdDB = System.getenv("DBpwd");
		this.openConnection();
	}
	
	public static UserDAOPostgres getUserDAOPostgres() {
		if(UserDAOPostgres.DAOPostgres == null) {
			UserDAOPostgres.DAOPostgres = new UserDAOPostgres();
		}
		return UserDAOPostgres.DAOPostgres;
	}
}
