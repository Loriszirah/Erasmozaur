package model;

/**
 * 
 */
public class City {

    /**
     * Default constructor
     */
    public City(String name) {
    	this.name = name;
    }

    /**
     * 
     */
    public int id_city;

    /**
     * 
     */
    private String name;

    // Getters & Setters
    
	public int getId_city() {
		return id_city;
	}

	public void setId_city(int id_city) {
		this.id_city = id_city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}  
}