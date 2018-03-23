package dao;
import java.util.*;

/**
 * 
 */
public interface EvaluationDAO {

    /**
     * @param grade 
     * @param date 
     * @param comment 
     * @param id_agreement 
     * @return
     */
    public Evaluation createEvaluation(String grade, Date date, String comment, int id_agreement);

    /**
     * 
     */
    public void updateEvaluation();

    /**
     * 
     */
    public void deleteEvaluation();

    /**
     * @return
     */
    public Evaluation viewEvaluation();

    /**
     * @return
     */
    public ArrayList<Evaluation> getAllEvaluations();

}