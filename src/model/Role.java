package model;
import java.util.*;

/**
 * 
 */
public class Role {

    /**
     * Default constructor
     * @param id_role 
     * @param name 
     * @param description
     */
    public Role(int id_role, String name, String description) {
    	this.id_role = id_role;
    	this.name = name;
    	this.description = description;
    }

    /**
     * 
     */
    private int id_role;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String description;

	public int getId_role() {
		return id_role;
	}

	public void setId_role(int id_role) {
		this.id_role = id_role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    
}