package dao.postgres;
import java.util.*;
import dao.*;
import model.*;

/**
 * 
 */
public class CourseDAOPostgres implements CourseDAO {

    /**
     * Default constructor
     */
    public CourseDAOPostgres() {
    }

    /**
     * @param name 
     * @param specialization 
     * @return
     */
    public Course createCourse(String name, String specialization) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_course
     */
    public void updateCourse(int id_course) {
        // TODO implement here
    }

    /**
     * @param id_course
     */
    public void deleteCourse(int id_course) {
        // TODO implement here
    }

    /**
     * @param id_course 
     * @return
     */
    public Course viewCourse(int id_course) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_course 
     * @return
     */
    public boolean checkIfExists(int id_course) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public ArrayList<Course> getAllCourses() {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @return
     */
    public ArrayList<Course> getAllCoursesByUniversity(int id_university) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_scholarship 
     * @return
     */
    public ArrayList<Course> getAllCoursesByScholarship(int id_scholarship) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_agreement 
     * @return
     */
    public ArrayList<Course> getAllCoursesByAgreement(int id_agreement) {
        // TODO implement here
        return null;
    }

}