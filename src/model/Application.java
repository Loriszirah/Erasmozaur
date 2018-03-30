package model;
import java.util.*;

/**
 * 
 */
public class Application {

    /**
     * Default constructor
     */
    public Application(int id_application, Date date, String comment, int id_student, int id_scholarship) {
    this.id_application = id_application;
    	this.date = date;
    	this.comment = comment;
    	this.id_student = id_student;
    	this.id_scholarship = id_scholarship;
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

    /**
     * 
     */
    public int id_student;

    /**
     * 
     */
    public int id_scholarship;

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