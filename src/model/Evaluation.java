package model;
import java.util.*;

/**
 * 
 */
public class Evaluation {

    /**
     * Default constructor
     */
    public Evaluation() {
    }

    /**
     * 
     */
    public int id_evaluation;

    /**
     * 
     */
    private float grade;

    /**
     * 
     */
    private Date date;

    /**
     * 
     */
    private String comment;

	public int getId_evaluation() {
		return id_evaluation;
	}

	public void setId_evaluation(int id_evaluation) {
		this.id_evaluation = id_evaluation;
	}

	public float getGrade() {
		return grade;
	}

	public void setGrade(float grade) {
		this.grade = grade;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
    
    
}