package dao;
import dao.postgres.ApplicationDAOPostgres;
import dao.postgres.CityDAOPostgres;
import dao.postgres.CountryDAOPostgres;
import dao.postgres.CourseDAOPostgres;
import dao.postgres.DocumentDAOPostgres;
import dao.postgres.EvaluationDAOPostgres;
import dao.postgres.ReviewDAOPostgres;
import dao.postgres.RoleDAOPostgres;
import dao.postgres.ScholarshipDAOPostgres;
import dao.postgres.UniversityDAOPostgres;
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