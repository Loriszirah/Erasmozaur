package model;
import java.util.*;

/**
 * 
 */
public class Review {

    /**
     * Default constructor
     */
    public Review() {
    }

    /**
     * 
     */
    public int id_review;

    /**
     * 
     */
    private String comment;

    /**
     * 
     */
    private int nbStars;

	public int getId_review() {
		return id_review;
	}

	public void setId_review(int id_review) {
		this.id_review = id_review;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getNbStars() {
		return nbStars;
	}

	public void setNbStars(int nbStars) {
		this.nbStars = nbStars;
	}
}