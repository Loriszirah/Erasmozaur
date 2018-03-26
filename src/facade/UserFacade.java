package facade;
import java.util.*;
import model.*;
import dao.*;
import javafx.fxml.FXML;
/**
 * 
 */
public class UserFacade {
	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private User user;
	private UserDAO UserDAO = factory.getUserDAO();
	
	
    /**
     * Default constructor
     */
    public UserFacade() {
    }
    
    @FXML
	public boolean login(String username, String password) {
		this.user = this.UserDAO.login(username, password);
		if(this.user == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean register(String username, String password, String typeUser) {
		return this.UserDAO.register(username, password, typeUser);
	}
	
	public User getCurrentUser(){
		return this.user;
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