package dao;
import java.util.*;

/**
 * 
 */
public interface CourseDAO {

    /**
     * @param name 
     * @param specialization 
     * @return
     */
    public Course createCourse(String name, String specialization);

    /**
     * @param id_course
     */
    public void updateCourse(int id_course);

    /**
     * @param id_course
     */
    public void deleteCourse(int id_course);

    /**
     * @param id_course 
     * @return
     */
    public Course viewCourse(int id_course);

    /**
     * @param id_course 
     * @return
     */
    public boolean checkIfExists(int id_course);

    /**
     * @return
     */
    public ArrayList<Course> getAllCourses();

    /**
     * @param id_university 
     * @return
     */
    public ArrayList<Course> getAllCourses(void id_university);

    /**
     * @param id_scholarship 
     * @return
     */
    public ArrayList<Course> getAllCourses(void id_scholarship);

    /**
     * @param id_agreement 
     * @return
     */
    public ArrayList<Course> getAllCourses(void id_agreement);

}