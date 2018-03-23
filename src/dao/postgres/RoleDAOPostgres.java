package dao.postgres;
import java.util.*;
import dao.RoleDAO;
import model.*;

/**
 * 
 */
public class RoleDAOPostgres implements RoleDAO {

    /**
     * Default constructor
     */
    public RoleDAOPostgres() {
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
    public Role viewRole(int id_role) {
        // TODO implement here
        return null;
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
        // TODO implement here
        return null;
    }

}