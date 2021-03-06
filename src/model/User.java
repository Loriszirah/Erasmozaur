package model;
import java.util.*;

/**
 * 
 */
public class User {

    /**
     * 
     */
    public int id_user;

	/**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private Date birthDate;

    /**
     * 
     */
    private String address;
    
    /**
     * 
     */
    private int id_role;
    
    /**
     * 
     */
    private int id_university;
    
    // Constructors
    
    public int getId_university() {
		return id_university;
	}

	public void setId_university(int id_university) {
		this.id_university = id_university;
	}

	public User(int id_user, String name, String password, int id_role) {
		this.id_user = id_user;
		this.firstName = name;
		this.password = password;
		this.id_role = id_role;
	}

	public User(int id_user, String firstName, String lastName, String password, String email, String username, Date birthDate,
			String address, int id_role, int id_university) {
		this.id_user = id_user;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.username = username;
		this.birthDate = birthDate;
		this.address = address;
		this.id_role = id_role;
		this.id_university = id_university;
	}
	
	// Destructor
	@Override
	  public void finalize() {
	    System.out.println("User instance will be cleaned!");
	  }
	
	// Getters & Setters
    public int getId() {
		return id_user;
	}
    
	public void setId(int id_user) {
		this.id_user = id_user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId_role() {
		return id_role;
	}

	public void setId_role(Integer id_role) {
		this.id_role = id_role;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean equals(User user) {
		if ( //this.getAddress().equals(user.getAddress()) &&
				this.getUsername().equals(user.getUsername())
				&& this.getEmail().equals(user.getEmail()) 
				&& this.getFirstName().equals(user.getFirstName()) 
				&& this.getLastName().equals(user.getLastName())
				&& this.getPassword().equals(user.getPassword()) 
				&& this.getId_role() == user.getId_role()
				) {
			return true;
		}
		return false;
		
	}
}