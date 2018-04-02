package dao;

/**
 * 
 */
public abstract class AbstractFactoryDAO {
	
	/**
	 * Methode to get a factory of DAO
	 * @return an AbstractFactoryDAO
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
    public abstract CountryDAO getCountryDAO();
    public abstract RoleDAO getRoleDAO();
    public abstract EvaluationDAO getEvaluationDAO();
    public abstract DocumentDAO getDocumentDAO();
    public abstract CourseDAO getCourseDAO();
}