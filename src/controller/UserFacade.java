package controller;
import java.util.*;
import model.*;
/**
 * 
 */
public class UserFacade {

    /**
     * Default constructor
     */
    public UserFacade() {
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
     * @param id_university
     */
    public void joinUniversity(int id_university) {
        // TODO implement here
    }

    /**
     * 
     */
    public void updateUser() {
        // TODO implement here
    }

    /**
     * @param id_user 
     * @return
     */
    public User deleteUser(int id_user) {
        // TODO implement here
        return null;
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
     * @return
     */
    public ArrayList<User> getAllUsers() {
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

    /**
     * @param id_university 
     * @param id_role 
     * @return
     */
    public ArrayList<User> getAllUsers(int id_university, int id_role) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_role 
     * @return
     */
    public ArrayList<User> getAllUsers(int id_role) {
        // TODO implement here
        return null;
    }

}