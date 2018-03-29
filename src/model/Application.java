package model;
import java.util.*;

/**
 * 
 */
public class Application {

    /**
     * Default constructor
     */
    public Application() {
    }

    /**
     * 
     */
    public int id_application;

    /**
     * 
     */
    public Date date;

    /**
     * 
     */
    public String comment;

    // Getters & Setters
    
	public int getId_application() {
		return id_application;
	}

	public void setId_application(int id_application) {
		this.id_application = id_application;
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