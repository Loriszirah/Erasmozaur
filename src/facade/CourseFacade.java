package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.CourseDAO;
import dao.ScholarshipDAO;
import model.*;

/**
 * 
 */
public class CourseFacade {

	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private CourseDAO courseDAO = factory.getCourseDAO();
    /**
     * Default constructor
     */
    public CourseFacade() {
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
    public ArrayList<Course> getAllCoursesByScolarship(int id_scholarship) {
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