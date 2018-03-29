package presenters;

public class UniversityPresenter {
	
	/**
     * 
     */
    private int id_university;

    /**
     * 
     */
    private String name;
    
    /**
     * 
     */
    private String address;
    
    /**
     * 
     */
    private String responsible;

    /**
     * 
     */
    private String city;
    
    /**
     * 
     */
    private String country;

	public UniversityPresenter(int id_university, String name, String address, String responsible, String city, String country) {
		super();
		this.id_university = id_university;
		this.name = name;
		this.address = address;
		this.responsible = responsible;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}
	
}
