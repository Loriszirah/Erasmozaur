package dao.postgres;
import java.util.*;
import dao.*;
import model.*;

/**
 * 
 */
public class UserDAOPostgres implements UserDAO {

    /**
     * Default constructor
     */
    public UserDAOPostgres() {
    }

    /**
     * @param firstName 
     * @param lastName 
     * @param password 
     * @param email 
     * @param username 
     * @param birthDate 
     * @param address 
     * @return
     */
    public User createUser(String firstName, String lastName, String password, String email, String username, Date birthDate, String address) {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void leaveUniversity() {
        // TODO implement here
    }

    /**
     * @param id_user
     */
    public void updateUser(int id_user) {
        // TODO implement here
    }

    /**
     * @param id_user
     */
    public void deleteUser(int id_user) {
        // TODO implement here
    }

    /**
     * @param id_user 
     * @return
     */
    public User viewUser(int id_user) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @param id_user
     */
    public void joinUniversity(int id_university, int id_user) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<User> getAllUsers() {
        // TODO implement here
        return null;
    }

    /**
     * @param id_user 
     * @return
     */
    public boolean checkIfExists(int id_user) {
        // TODO implement here
        return false;
    }

    /**
     * @param id_role 
     * @return
     */
    public ArrayList<User> getAllUsersByRole(int id_role) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @param id_role 
     * @return
     */
    public ArrayList<User> getAllUsersByUniversityRole(int id_university, int id_role) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @return
     */
    public ArrayList<User> getAllUsersByUniversity(int id_university) {
        // TODO implement here
        return null;
    }

}