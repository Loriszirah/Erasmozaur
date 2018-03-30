package model;
import java.util.*;

/**
 * 
 */
public class Agreement extends Application {

    /**
     * Default constructor
     */
    public Agreement(Date date, String comment, int id_student, int id_scholarship) {
		super(date, comment, id_student, id_scholarship);
		// TODO Auto-generated constructor stub
	}

    /**
     * 
     */
    public int id_agreement;

    /**
     * 
     */
    private Date startDate;

    /**
     * 
     */
    private Date endDate;

    /**
     * 
     */
    private String comment;
    
    // Getters & Setters

	public int getId_agreement() {
		return id_agreement;
	}

	public void setId_agreement(int id_agreement) {
		this.id_agreement = id_agreement;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}