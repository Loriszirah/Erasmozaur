
public abstract class AbstractFactoryDAO {
	private static UserDAO userDAO;
		
	public static UserDAO createUserDAO() {
		if(AbstractFactoryDAO.userDAO == null) {
			AbstractFactoryDAO.userDAO = new UserDAOPostgres();
		}
		return AbstractFactoryDAO.userDAO;
	}
}
