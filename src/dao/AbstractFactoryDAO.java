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
    public abstract ScholarshipDAO ScholarshipDAO();
    public abstract UniversityDAO UniversityDAO();
    public abstract ReviewDAO ReviewDAO();
    public abstract ApplicationDAO ApplicationDAO();
    public abstract CityDAO CityDAO();
    public abstract RoleDAO RoleDAO();
    public abstract EvaluationDAO EvaluationDAO();
    public abstract DocumentDAO DocumentDAO();
    public abstract CourseDAO CourseDAO();
}