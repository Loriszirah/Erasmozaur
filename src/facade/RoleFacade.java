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
     * @param name 
     * @param description 
     * @return
     */
    public Role createRole(String name, String description) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_role 
     * @return
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
     * @param id_role
     */
    public void deleteRole(int id_role) {
        // TODO implement here
    }

    /**
     * @return
     */
    public ArrayList<Role> getAllRoles() {
        return roleDAO.getAllRoles();
    }

}