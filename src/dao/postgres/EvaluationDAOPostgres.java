package dao.postgres;
import java.util.*;
import dao.*;
import model.*;

/**
 * 
 */
public class EvaluationDAOPostgres implements EvaluationDAO {
    private static EvaluationDAOPostgres instance = new EvaluationDAOPostgres();
	
	
	
	public static EvaluationDAOPostgres getEvaluationDAOPostgres() {
		return EvaluationDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    public EvaluationDAOPostgres() {
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