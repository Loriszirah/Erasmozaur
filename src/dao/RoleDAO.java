package dao;
import java.util.*;
import model.*;

/**
 * 
 */
public interface RoleDAO {

    /**
     * Create a role
     * @param name Name of the new role
     * @param description Description of the role
     * @return the role created
     */
    public Role createRole(String name, String description);

    /**
     * Return the role with the given id id
     * @param id_role 
     * @return the role with this id
     */
    public Role viewRole(int id_role);

    /**
     * Update the role with the given id
     * @param id_role
     */
    public void updateRole(int id_role);

    /**
     * Delete the role with the given id
     * @param id_role
     */
    public void deleteRole(int id_role);

    /**
     * Get all the roles
     * @return all the roles in the database
     */
    public ArrayList<Role> getAllRoles();

}