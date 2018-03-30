package dao;
import java.sql.SQLException;
import java.util.*;
import model.*;

/**
 * 
 */
public interface UserDAO {

    /**
     * 
     */
    public void leaveUniversity();

    /**
     * Check if a user already exists with this username excepting the user with the given id
     * @param id_user
     * @param username
     * @return true if there is an other user with this username, false otherwise
     */
    public boolean checkIfExistsWithUsername(int id_user, String username);
    
    /**
     * Check if a user already exists with this email exception the user with the given id
     * @param id_user
     * @param email
     * @return true if there is an other user with this email, false otherwise
     */
    public boolean checkIfExistsWithEmail(int id_user, String email);
    
    /**
     * Update the user with the given parameters
     * @param id_user
     * @param firstName
     * @param lastName
     * @param email
     * @param username
     * @param birthDate
     * @param address
     */
    public void updateUser(int id_user, String firstName, String lastName, String email, String username, Date birthDate, String address) throws Exception;

    /**
     * Check if a user already exists with this username
     * @param username 
     * @return true if a user already exists with this username, false otherwise
     */	
    public boolean checkIfExistsWithUsername(String username);
    
    /**
     * Check if a user already exists with this email
     * @param email 
     * @return true if a user already exists with this email, false otherwise
     */
    public boolean checkIfExistsWithEmail(String email);
    
    /**
     * Check if the user with this id is responsible of a university
     * @param id_user
     * @return True is the user is already responsible of a university, false otherwise
     */
    public boolean isResponsibleOfUniversity(int id_user);
    
    /**
     * @param id_user
     */
    public void deleteUser(int id_user);

    /**
     * @param id_user 
     * @return
     */
    public User viewUser(int id_user);

    /**
     * @param id_university 
     * @param id_user
     */
    public void joinUniversity(int id_university, int id_user);

    /**
     * @return
     */
    public ArrayList<User> getAllUsers();

    /**
     * @param id_user 
     * @return
     */
    public boolean checkIfExists(int id_user);

    /**
     * @param id_role 
     * @return
     */
    public ArrayList<User> getAllUsersByRole(int id_role);

    /**
     * @param id_university 
     * @param id_role 
     * @return
     */
    public ArrayList<User> getAllUsersByUniversityRole(int id_university, int id_role);

    /**
     * @param id_university 
     * @return
     */
    public ArrayList<User> getAllUsersByUniversity(int id_university);
    
    /**
     * @param firstName 
     * @param lastName 
     * @param password 
     * @param role
     * @param email 
     * @param username 
     * @param birthDate 
     * @param address 
<<<<<<< Updated upstream
     * @return the user that has been created
=======
     * @return
     * @throws Exception 
     */
    public User createUser(String firstName, String lastName, String password, String email, String username, Date birthDate, String address, String role) throws Exception;
    
    /**
     * 
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password);

}