package model;
import java.util.*;

/**
 * 
 */
public class Country {

    /**
     * 
     */
    public int id_country;

    /**
     * 
     */
    private String name;

    // Constructors
    /**
     * Default constructor
     */
    public Country() {
    }

    // Getters & Setters
    
	public int getId_country() {
		return id_country;
	}

	public void setId_country(int id_country) {
		this.id_country = id_country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}  
}