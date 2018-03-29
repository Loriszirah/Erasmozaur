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
		return ScholarshipDAOPostgres.getScholarshipDAOPostgres();
	}

	@Override
	public UniversityDAO getUniversityDAO() {
		return UniversityDAOPostgres.getUniversityDAOPostgres();
	}

	@Override
	public ReviewDAO getReviewDAO() {
		return ReviewDAOPostgres.getReviewDAOPostgres();
	}

	@Override
	public ApplicationDAO getApplicationDAO() {
		return ApplicationDAOPostgres.getApplicationDAOPostgres();
	}

	@Override
	public CityDAO getCityDAO() {
		return CityDAOPostgres.getCityDAOPostgres();
	}
	
	@Override
	public CountryDAO getCountryDAO() {
		return CountryDAOPostgres.getCountryDAOPostgres();
	}

	@Override
	public RoleDAO getRoleDAO() {
		return RoleDAOPostgres.getRoleDAOPostgres();
	}

	@Override
	public EvaluationDAO getEvaluationDAO() {
		return EvaluationDAOPostgres.getEvaluationDAOPostgres();
	}

	@Override
	public DocumentDAO getDocumentDAO() {
		return DocumentDAOPostgres.getDocumentDAOPostgres();
	}

	@Override
	public CourseDAO getCourseDAO() {
		return CourseDAOPostgres.getCourseDAOPostgres();
	}
}