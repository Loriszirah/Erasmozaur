package dao;
import java.util.*;

/**
 * 
 */
public interface RoleDAO {

    /**
     * @param name 
     * @param description 
     * @return
     */
    public Role createRole(String name, String description);

    /**
     * @param id_role 
     * @return
     */
    public Role viewRole(int id_role);

    /**
     * @param id_role
     */
    public void updateRole(int id_role);

    /**
     * @param id_role
     */
    public void deleteRole(int id_role);

    /**
     * @return
     */
    public ArrayList<Role> getAllRoles();

}