package dao;
import java.util.*;
import dao.postgres.*;

/**
 * 
 */
public abstract class AbstractFactoryDAO {
	/**
	 * Method to get a factory of DAO
	 * @param factory : a string describing the database to use
	 * @return AbstractFactoryDAO
	 */
	public static AbstractFactoryDAO getFactory(){
		return PostgresFactoryDAO.getInstance();
	}
	
    public abstract UserDAO getUserDAO();
    public abstract ScholarshipDAO getScholarshipDAO();
    public abstract UniversityDAO getUniversityDAO();
    public abstract ReviewDAO getReviewDAO();
    public abstract ApplicationDAO getApplicationDAO();
    public abstract CityDAO getCityDAO();
    public abstract RoleDAO getRoleDAO();
    public abstract EvaluationDAO getEvaluationDAO();
    public abstract DocumentDAO getDocumentDAO();
    public abstract CourseDAO getCourseDAO();
}