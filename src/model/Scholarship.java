package model;
import java.util.*;

/**
 * 
 */
public class Scholarship {

    /**
     * Default constructor
     */
    public Scholarship() {
    }

    /**
     * 
     */
    public int id_scholarship;

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