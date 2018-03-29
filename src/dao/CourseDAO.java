package dao;
import java.util.*;
import model.*;

/**
 * 
 */
public interface CourseDAO {

    /**
     * @param name 
     * @param specialization 
     * @return
     */
    public Course createCourse(String name, String specialization, int id_university);

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
    public ArrayList<Course> getAllCoursesByUniversity(int id_university);

    /**
     * @param id_scholarship 
     * @return
     */
    public ArrayList<Course> getAllCoursesByScholarship(int id_scholarship);

    /**
     * @param id_agreement 
     * @return
     */
    public ArrayList<Course> getAllCoursesByAgreement(int id_agreement);

}