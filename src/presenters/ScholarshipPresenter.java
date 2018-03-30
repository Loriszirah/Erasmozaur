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
    public String description;

    /**
     * 
     */
    public int duration;
    
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
    
    /**
     * 
     */
    public String universityName;

	

	public ScholarshipPresenter(int id_scolarship, String description, int duration, Date startDate, Date endDate, String domain, String universityName) {
		super();
		this.id_scolarship = id_scolarship;
		this.description = description;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
		this.domain = domain;
		this.universityName = universityName;

	}

	public int getId_scolarship() {
		return id_scolarship;
	}

	public void setId_scolarship(int id_scolarship) {
		this.id_scolarship = id_scolarship;
	}
	
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
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

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	@Override
	public String toString() {
		return "ScholarshipPresenter [description=" + description + ", duration=" + duration + ", startDate="
				+ startDate + ", endDate=" + endDate + ", domain=" + domain + ", universityName=" + universityName
				+ "]";
	}

	
    
}
