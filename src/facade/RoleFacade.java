package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.RoleDAO;
import model.*;

/**
 * 
 */
public class RoleFacade {

	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private RoleDAO roleDAO = factory.getRoleDAO();
	
    /**
     * Default constructor
     */
    public RoleFacade() {
    }


    /**
     * Create a role
     * @param name 
     * @param description 
     * @return the role with the given parameters
     */
    public Role createRole(String name, String description) {
        // TODO implement here
        return null;
    }

    /**
     * Return a role
     * @param id_role 
     * @return the role with the given id
     */
    public Role getRole(int id_role) {
        return roleDAO.viewRole(id_role);
    }

    /**
     * @param id_role
     */
    public void updateRole(int id_role) {
        // TODO implement here
    }

    /**
     * Delete a role
     * @param id_role
     */
    public void deleteRole(int id_role) {
        // TODO implement here
    }

    /**
     * @return an array list of all the roles
     */
    public ArrayList<Role> getAllRoles() {
        return roleDAO.getAllRoles();
    }

}