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
    private Integer id_role;
    
    //
    
    public User(Integer id_user, String name, String password, Integer id_role) {
		this.id_user = id_user;
		this.firstName = name;
		this.password = password;
		this.id_role = id_role;
	}
}