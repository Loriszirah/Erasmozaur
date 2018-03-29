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
     * @param id_user
     */
    public void updateUser(int id_user);

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