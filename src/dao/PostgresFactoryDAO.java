package dao;
import java.util.*;

import dao.postgres.*;

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
    public UserDAO getUserDAO() {
		return UserDAOPostgres.getUserDAOPostgres();
	}

	@Override
	public ScholarshipDAO getScholarshipDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UniversityDAO getUniversityDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReviewDAO getReviewDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ApplicationDAO getApplicationDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CityDAO getCityDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoleDAO getRoleDAO() {
		// TODO Auto-generated method stub
		return RoleDAOPostgres.getRoleDAOPostgres();
	}

	@Override
	public EvaluationDAO getEvaluationDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentDAO getDocumentDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CourseDAO getCourseDAO() {
		// TODO Auto-generated method stub
		return null;
	}
}