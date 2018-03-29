package model;
import java.util.*;

/**
 * 
 */
public class University {

    /**
     * Default constructor
     */
    public University(int id_university, String name, String address, int id_city) {
    	this.id_university = id_university;
    	this.name = name;
    	this.address = address;
    	this.id_city = id_city;
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
    private int id_city;

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