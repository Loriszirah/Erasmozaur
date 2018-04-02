package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.CourseDAO;
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
     * Create a course
     * @param name 
     * @param specialization 
     * @return the course with the specified arguments
     */
    public Course createCourse(String name, String specialization, int id_university) {
        return courseDAO.createCourse(name, specialization, id_university);
    }

    /**
     * @param id_course
     */
    public void updateCourse(int id_course) {
        // TODO implement here
    }

    /**
     * Delete a course
     * @param id_course
     */
    public void deleteCourse(int id_course) {
        // TODO implement here
    }

    /**
     * @param id_course 
     * @return the course corresponding to the given id
     */
    public Course viewCourse(int id_course) {
        // TODO implement here
        return null;
    }

    /**
     * @return an array list of all the courses
     */
    public ArrayList<Course> getAllCourses() {
        // TODO implement here
        return null;
    }

    /**
     * @param id_university 
     * @return an array list of all the courses of the given university
     */
    public ArrayList<String> getAllCoursesFullNamesByUniversity(int id_university) {
        return courseDAO.getAllCourseFullNamesForUniversity(id_university);
    }

    /**
     * @param id_scholarship 
     * @return an array list of all the courses of the given scholarship
     */
    public ArrayList<Course> getAllCoursesByScolarship(int id_scholarship) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_agreement 
     * @return an array list of all the courses of the given agreement
     */
    public ArrayList<Course> getAllCoursesByAgreement(int id_agreement) {
        // TODO implement here
        return null;
    }
}