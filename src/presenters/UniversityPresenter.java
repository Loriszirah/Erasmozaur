package presenters;

public class UniversityPresenter {
	
	/**
     * 
     */
    private int id_university;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public String city;
    
    /**
     * 
     */
    public String country;

	public UniversityPresenter(int id_university, String name, String city, String country) {
		super();
		this.id_university = id_university;
		this.name = name;
		this.city = city;
		this.country = country;
	}

	public int getId_university() {
		return id_university;
	}

	public void setId_university(int id_university) {
		this.id_university = id_university;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
    
}
