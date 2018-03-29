package model;
import java.util.*;

/**
 * 
 */
public class Scholarship {

	// Constructors 
	
	/**
	 * @param id_scholarship
	 * @param description
	 * @param duration
	 * @param startDate
	 * @param endDate
	 * @param domain
	 * @param id_receiving_university
	 */
    public Scholarship(int id_scholarship, String description, int duration, java.sql.Date startDate, java.sql.Date endDate, String domain, int id_receiving_university) {
    	this.id_scholarship = id_scholarship;
    	this.description = description;
    	this.duration = duration;
    	this.startDate = startDate;
    	this.endDate = endDate;
    	this.domain = domain;
    	this.id_receiving_university = id_receiving_university;
    }

	/**
     * 
     */
    private int id_scholarship;

    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private int duration;

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
    private String domain;
    
    /**
     * 
     */
    private int id_receiving_university;

	public int getId_scholarship() {
		return id_scholarship;
	}

	public void setId_scholarship(int id_scholarship) {
		this.id_scholarship = id_scholarship;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    public int getId_receiving_university() {
		return id_receiving_university;
	}

	public void setId_receiving_university(int id_receiving_university) {
		this.id_receiving_university = id_receiving_university;
	}
	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
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

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}  
}