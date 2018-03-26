package dao;
import java.util.*;

import dao.postgres.UserDAOPostgres;

/**
 * 
 */
public class PostgresFactoryDAO extends AbstractFactoryDAO {

	private static PostgresFactoryDAO instance = new PostgresFactoryDAO();
	
    /**
     * Default constructor
     */
    private PostgresFactoryDAO() {
    }

	public static AbstractFactoryDAO getInstance() {
		return instance;
	}

    @Override
    public dao.UserDAO getUserDAO() {
		return UserDAOPostgres.getUserDAOPostgres();
	}

	@Override
	public dao.ScholarshipDAO ScholarshipDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dao.UniversityDAO UniversityDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dao.ReviewDAO ReviewDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dao.ApplicationDAO ApplicationDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dao.CityDAO CityDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dao.RoleDAO RoleDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dao.EvaluationDAO EvaluationDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dao.DocumentDAO DocumentDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public dao.CourseDAO CourseDAO() {
		// TODO Auto-generated method stub
		return null;
	}
}