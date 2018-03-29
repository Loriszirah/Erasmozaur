package facade;
import java.util.*;
import model.*;
import dao.*;
/**
 * 
 */
public class UserFacade {
	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private static User user;
	private UserDAO UserDAO = factory.getUserDAO();
	
	
    /**
     * Default constructor
     */
    public UserFacade() {
    }
    
	public boolean login(String username, String password) {
		try{
			UserFacade.user = this.UserDAO.login(username, password);
		}catch(Exception ex){
			System.out.println("Exception was caught in the login!");
		}
		if(UserFacade.user == null) {
			return false;
		}
		else {
			System.out.println("The following User has succesfully logged in - "+UserFacade.user.getUsername());
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
			UserFacade.user = this.UserDAO.createUser(firstName, lastName, password, email, username, birthDate, address, role);
			return true;
		} catch(Exception e){
			e.printStackTrace();
			return false;
		}	
	}
	
	public User getCurrentUser(){
		return UserFacade.user;
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