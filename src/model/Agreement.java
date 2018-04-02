package model;
import java.util.*;

/**
 * 
 */
public class Agreement extends Application {

    /**
     * Default constructor
     */
    public Agreement(int id_application, Date date, String comment, int id_student, int id_scholarship, Date startDate, Date endDate, String commentAgreement) {
		super(id_application, date, comment, id_student, id_scholarship);
		this.startDate = startDate;
		this.endDate = endDate;
		this.commentAgreement = commentAgreement;
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
    private String commentAgreement;
    
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

	public String getCommentAgreement() {
		return commentAgreement;
	}

	public void setCommentAgreement(String commentAgreement) {
		this.commentAgreement = commentAgreement;
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