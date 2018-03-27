package dao;
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
     * @return
     */
    public User createUser(String firstName, String lastName, String role, String password, String email, String username, Date birthDate, String address);
    

    /**
     * 
     * @param username
     * @param password
     * @param role
     * @return
     */
    public boolean register(String username, String password, String role);
    
    /**
     * 
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password);

}