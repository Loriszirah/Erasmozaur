package controller;

import dao.UserDAO;
import dao.postgres.UserDAOPostgres;

public abstract class AbstractFactoryDAO {
		
	public static UserDAO getUserDAO() {
		return UserDAOPostgres.getUserDAOPostgres();
	}
}
