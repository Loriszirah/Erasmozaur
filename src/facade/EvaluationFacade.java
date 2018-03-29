package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.EvaluationDAO;
import dao.ScholarshipDAO;
import model.*;

/**
 * 
 */
public class EvaluationFacade {

	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private EvaluationDAO evaluationDAO = factory.getEvaluationDAO();
	
    /**
     * Default constructor
     */
    public EvaluationFacade() {
    }


    /**
     * Create an evaluation
     * @param grade 
     * @param date 
     * @param comment 
     * @param id_agreement 
     * @return the evaluation with the given parameters
     */
    public Evaluation createEvaluation(String grade, Date date, String comment, int id_agreement) {
        // TODO implement here
        return null;
    }

    /**
     * Return the evaluation of the specified id
     * @param id_evaluation 
     * @return The evaluation object with the specified id
     */
    public Evaluation viewEvaluation(int id_evaluation) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_evaluation
     */
    public void updateEvaluation(int id_evaluation) {
        // TODO implement here
    }

    /**
     * Delete the evaluation with the specified id
     * @param id_evaluation
     */
    public void deleteEvaluation(int id_evaluation) {
        // TODO implement here
    }

    /**
     * @return an array list of all the evaluations
     */
    public ArrayList<Evaluation> getAllEvaluations() {
        // TODO implement here
        return null;
    }

}