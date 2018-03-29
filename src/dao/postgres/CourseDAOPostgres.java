package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import dao.*;
import model.*;

/**
 * 
 */
public class CourseDAOPostgres extends AbstractDAOPostgres implements CourseDAO {
    private static CourseDAOPostgres instance = new CourseDAOPostgres();
	
	public static CourseDAOPostgres getCourseDAOPostgres() {
		return CourseDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private CourseDAOPostgres() {
    	super();
    	openConnection();
    }

	/**
	 * @param name 
	 * @param specialization 
	 * @return
	 */
	public Course createCourse(String name, String specialization, int id_university) {
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			// Creation of a Statement object
			Statement state = conn.createStatement();

			//The object ResultSet contains the result of the SQL request
			state.executeUpdate("INSERT INTO Course (name, specialization, id_university) VALUES('"+name+"','"+specialization+"','"+id_university+"')");

			// The object ResultSet contains the result of the SQL request
			ResultSet result = state.executeQuery("SELECT * FROM Courses "
					+ "WHERE name='"+name+"' AND id_university="+id_university+");");

			// Get the user in the database if exists and create the user
			if(result.next()) {
				Course course = new Course(result.getInt("id_course"), result.getString("name"), result.getString("specialization"), result.getInt("id_university"));
				return course;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
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
		ArrayList<Course> courses = new ArrayList<Course>();
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();
			// Check if the username already exist

			ResultSet exists = state.executeQuery("SELECT * FROM Courses Where id_university='"+id_university+"';");

			String name, specialization;
			int id_course;
			if(exists.next()) {
				id_course = exists.getInt("id_course");
				name = exists.getString("name");
				specialization = exists.getString("specialization");
				courses.add(new Course(id_course,name,specialization,id_university));
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return courses;
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