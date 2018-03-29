package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
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
     * @param id_evaluation 
     * @return
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
     * @param id_evaluation
     */
    public void deleteEvaluation(int id_evaluation) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<Evaluation> getAllEvaluations() {
        // TODO implement here
        return null;
    }

}