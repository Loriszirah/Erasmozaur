package dao;
import java.util.*;
import dao.postgres.*;

/**
 * 
 */
public abstract class AbstractFactoryDAO {

    /**
     * Default constructor
     */
    public AbstractFactoryDAO() {
    }

    /**
     * @return
     */
    public static UserDAO getUserDAO() {
		return UserDAOPostgres.getUserDAOPostgres();
	}

    /**
     * @return
     */
    public ScholarshipDAO ScholarshipDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public UniversityDAO UniversityDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ReviewDAO ReviewDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ApplicationDAO ApplicationDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public CityDAO CityDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public RoleDAO RoleDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public EvaluationDAO EvaluationDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public DocumentDAO DocumentDAO() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public CourseDAO CourseDAO() {
        // TODO implement here
        return null;
    }

}