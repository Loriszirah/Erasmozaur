import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class LoginFacade {
	private User user;
	private UserDAO UserDAO;
	
	public boolean login(String username, String password) {
		if(this.UserDAO == null) {
			this.UserDAO = AbstractFactoryDAO.getUserDAO();
		}
		this.user = this.UserDAO.login(username, password);
		if(this.user == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean register(String username, String password, String typeUser) {
		if(this.UserDAO == null) {
			this.UserDAO = AbstractFactoryDAO.getUserDAO();
		}
		return this.UserDAO.register(username, password, typeUser);
	}
	
	public String getName() {
		return user.getName();
	}
}
