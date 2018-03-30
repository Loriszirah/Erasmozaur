package facade;
import java.sql.SQLException;
import java.util.*;
import model.*;
import dao.*;
/**
 * 
 */
public class UserFacade {
	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private static User currentUser;
	private UserDAO userDAO = factory.getUserDAO();
	
    /**
     * Default constructor
     */
    public UserFacade() {
    }
    
    /**
     * Try to login the user to the application with the given parameters
     * @param username
     * @param password
     * @return true if the login was successful, false otherwise
     */
	public boolean login(String username, String password) {
		try{
			UserFacade.currentUser = this.userDAO.login(username, password);
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
	
	/**
	 * Try to register the user with the given parameters
	 * @param firstName
	 * @param lastName
	 * @param password
	 * @param email
	 * @param username
	 * @param birthDate
	 * @param address
	 * @param role
	 * @return true if the user has been registered, false otherwise
	 * @throws Exception
	 */
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
			UserFacade.currentUser = this.userDAO.createUser(firstName, lastName, password, email, username, birthDate, address, role);
			return true;
		} catch(Exception e){
			e.printStackTrace();
			return false;
		}	
	}
	
	/**
	 * @return the current user logged into the application
	 */
	public User getCurrentUser(){
		return UserFacade.currentUser;
	}
	
	/**
     * Check if a user already exists with this username
     * @param username 
     * @return true if a user already exists with this username, false otherwise
     */
	private boolean checkIfExistsWithUsername(String username) {
		return userDAO.checkIfExistsWithUsername(username);
	}
	
	/**
     * Check if a user already exists with this email
     * @param email 
     * @return true if a user already exists with this email, false otherwise
     */
	private boolean checkIfExistsWithEmail(String email) {
		return userDAO.checkIfExistsWithEmail(email);
	}
	
	/**
	 * Check if a user is the responsible of a university
	 * @param id
	 * @return true if the user with the given id is responsible of one or more universities, false otherwise
	 */
	public boolean isResponsibleOfUniversity(int id) {
		return userDAO.isResponsibleOfUniversity(id);
	}

    /**
     * Create a user
     * @param firstName 
     * @param lastName 
     * @param password 
     * @param email 
     * @param username 
     * @param birthDate 
     * @param address 
     * @return the user with the given parameters
     */
    public User createUser(String firstName, String lastName, String password, String email, String username, Date birthDate, String address) {
        // TODO implement here
        return null;
    }

    /**
     * Leave the university that the user belongs to
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
     * Check if a user already exists with this username excepting the user with the given id
     * @param id_user
     * @param username
     * @return true if there is an other user with this username, false otherwise
     */
    public boolean checkIfExistsWithUsername(int id_user, String username) {
    	return UserDAO.checkIfExistsWithUsername(id_user, username);
    }
    
    /**
     * Check if a user already exists with this email exception the user with the given id
     * @param id_user
     * @param email
     * @return true if there is an other user with this email, false otherwise
     */
    public boolean checkIfExistsWithEmail(int id_user, String email) {
    	return UserDAO.checkIfExistsWithEmail(id_user, email);
    }
    
    /**
     * Update the user with the given parameters
     * @param id_user
     * @param firstName
     * @param lastName
     * @param email
     * @param username
     * @param birthDate
     * @param address
     * @throws Exception
     */
    public void updateUser(int id_user, String firstName, String lastName, String email, String username, Date birthDate, String address) throws Exception{
    	if(checkIfExistsWithEmail(id_user, email)) {
    		if(checkIfExistsWithUsername(id_user, username)) {
        		throw new Exception("This email and this username are already taken");
    		}
    		throw new Exception("This email is already taken");
    	}
    	else if(checkIfExistsWithUsername(id_user,username)) {
    		throw new Exception("This username is already taken");
    	}
    	else {
    		try {
        		UserDAO.updateUser(id_user, firstName, lastName, email, username, birthDate, address);
    			currentUser.setFirstName(firstName);
    			currentUser.setLastName(lastName);
    			currentUser.setEmail(email);
    			currentUser.setUsername(username);
    			currentUser.setBirthDate(birthDate);
    			currentUser.setAddress(address);
    		}catch(SQLException e) {
  		      e.printStackTrace(); 	
    		}
    	}
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
        return userDAO.viewUser(id_user);
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