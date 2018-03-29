package presenters;

import java.util.Date;

public class ScholarshipPresenter {
	
	/**
     * 
     */
    private int id_scolarship;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public String duration;
    
    /**
     * 
     */
    public Date startDate;
    
    /**
     * 
     */
    public Date endDate;

    /**
     * 
     */
    public String domain;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public ScholarshipPresenter(int id_scolarship, String name, String duration, Date startDate, Date endDate, String domain) {
		super();
		this.id_scolarship = id_scolarship;
		this.name = name;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
		this.domain = domain;

	}

	public int getId_scolarship() {
		return id_scolarship;
	}

	public void setId_scolarship(int id_scolarship) {
		this.id_scolarship = id_scolarship;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
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

	
    
}
