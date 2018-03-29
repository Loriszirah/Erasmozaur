package facade;
import java.util.*;
import model.*;
import dao.*;
/**
 * 
 */
public class UserFacade {
	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private static User currentUser;
	private UserDAO UserDAO = factory.getUserDAO();
	
    /**
     * Default constructor
     */
    public UserFacade() {
    }
    
	public boolean login(String username, String password) {
		try{
			UserFacade.currentUser = this.UserDAO.login(username, password);
		}catch(Exception ex){
			System.out.println("Exception was caught in the login!");
		}
		if(UserFacade.currentUser == null) {
			return false;
		}
		else {
			System.out.println("The following User has succesfully logged in - "+UserFacade.currentUser.getUsername());
			return true;
		}
	}
	
	public boolean register(String firstName, String lastName, String password, String email, String username, Date birthDate,
			String address, String role) throws Exception{
    	
    	if(checkIfExistsWithEmail(email)) {
    		if(checkIfExistsWithUsername(username)) {
    			throw new Exception("Username and email are already taken");
    		}
    		else {
    			throw new Exception("Email is already taken");
    		}
    	}
    	else if(checkIfExistsWithUsername(username)) {
    		throw new Exception("Username is already taken");
    	}
		
		try{
			UserFacade.currentUser = this.UserDAO.createUser(firstName, lastName, password, email, username, birthDate, address, role);
			return true;
		} catch(Exception e){
			e.printStackTrace();
			return false;
		}	
	}
	
	public User getCurrentUser(){
		return UserFacade.currentUser;
	}
	
	/**
     * Check if a user already exists with this username
     * @param username 
     * @return true if a user already exists with this username, false otherwise
     */
	private boolean checkIfExistsWithUsername(String username) {
		return UserDAO.checkIfExistsWithUsername(username);
	}
	
	/**
     * Check if a user already exists with this email
     * @param email 
     * @return true if a user already exists with this email, false otherwise
     */
	private boolean checkIfExistsWithEmail(String email) {
		return UserDAO.checkIfExistsWithEmail(email);
	}
	
	public boolean isResponsibleOfUniversity(int id) {
		return UserDAO.isResponsibleOfUniversity(id);
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
     * Leave the university that theh user belongs to
     */
    public void leaveUniversity() {
        // TODO implement here
    }

    /**
     * Join the university with the given id
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
     * Delete a user
     * @param id_user 
     */
    public void deleteUser(int id_user) {
        // TODO implement here
    }

    /**
     * @param id_user 
     * @return the user with the given id
     */
    public User viewUser(int id_user) {
        // TODO implement here
        return null;
    }

    /**
     * @return an array list of all the users
     */
    public ArrayList<User> getAllUsers() {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @return an array list of all the users in the given university
     */
    public ArrayList<User> getAllUsersByUniversity(int id_university) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @param id_role 
     * @return an array list of all the users of the given university who have the given role
     */
    public ArrayList<User> getAllUsersByUniversityByRole(int id_university, int id_role) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_role 
     * @return an array list of all the users who have the given role
     */
    public ArrayList<User> getAllUsers(int id_role) {
        // TODO implement here
        return null;
    }
}