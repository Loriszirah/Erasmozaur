
public abstract class AbstractFactoryDAO {
		
	public static UserDAO getUserDAO() {
		return UserDAOPostgres.getUserDAOPostgres();
	}
}
