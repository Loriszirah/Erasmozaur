package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import dao.*;
import model.*;

/**
 * 
 */
public class EvaluationDAOPostgres extends AbstractDAOPostgres implements EvaluationDAO {
    private static EvaluationDAOPostgres instance = new EvaluationDAOPostgres();
    protected String url;
    protected String userDB;
    protected String passwdDB;
    protected Connection conn;
	
	public static EvaluationDAOPostgres getEvaluationDAOPostgres() {
		return EvaluationDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private EvaluationDAOPostgres() {
    	super();
    	this.openConnection();
    }
    
    /**
     *  This function connect you to the Database
     */
    public void openConnection() {
    	try {
			this.conn = DriverManager.getConnection(url, userDB, passwdDB);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    /**
     * @param grade 
     * @param date 
     * @param comment 
     * @param id_agreement 
     * @return
     */
    public Evaluation createEvaluation(String grade, Date date, String comment, int id_agreement) {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void updateEvaluation() {
        // TODO implement here
    }

    /**
     * 
     */
    public void deleteEvaluation() {
        // TODO implement here
    }

    /**
     * @return
     */
    public Evaluation viewEvaluation() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Evaluation> getAllEvaluations() {
        // TODO implement here
        return null;
    }

}