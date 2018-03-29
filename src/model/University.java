package model;

/**
 * 
 */
public class University {

    /**
     * Default constructor
     */
    public University(int id_university, String name, String address, int id_city, int id_responsible) {
    	this.id_university = id_university;
    	this.name = name;
    	this.address = address;
    	this.id_city = id_city;
    	this.id_responsible = id_responsible;
    }

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
    private int id_responsible;
    
    /**
     * 
     */
    private int id_city;
    
    public int getId_responsible() {
		return id_responsible;
	}

	public void setId_responsible(int id_responsible) {
		this.id_responsible = id_responsible;
	}

	public int getId_city() {
		return id_city;
	}

	public void setId_city(int id_city) {
		this.id_city = id_city;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	} 
}