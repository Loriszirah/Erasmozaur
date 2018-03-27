package model;
import java.util.*;

/**
 * 
 */
public class Role {

    /**
     * Default constructor
     */
    public Role() {
    }

    /**
     * 
     */
    public int id_role;

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