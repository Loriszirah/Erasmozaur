package test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dao.postgres.RoleDAOPostgres;
import dao.postgres.UserDAOPostgres;
import model.Role;
import model.User;

class UserTest {
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		String url;
	    String userDB;
	    String passwdDB;
	    Connection conn;
	    
		url = System.getenv("DBurl");
		userDB =System.getenv("DBuser");
		passwdDB = System.getenv("DBpwd");

	    	try {
				DriverManager.getConnection(url, userDB, passwdDB);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Create a user : ")
	void testCreateUser() {
		UserDAOPostgres userDAO = UserDAOPostgres.getUserDAOPostgres();
		
		Date date = null;
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    String date1 = "22/06/1996";
	    try {
	        date = simpleDateFormat.parse(date1);
	      } catch (ParseException e) {
	        e.printStackTrace();
	      }
	    
		// cas de test 1
	    User user;
		try {
			user = userDAO.createUser("Fabien", "Turgut", "pwd", "fabien.turgut@gmail.com", "FabTur", date, "Polytech Montpellier", "Student");
			assertEquals(new User(user.getId(), "Fabien", "Turgut", "pwd", "fabien.turgut@gmail.com", "FabTur", date, "Polytech Montpellier", 2), user);
		} catch (Exception e) {
			fail("Fail to create an user in database");
		}
		
	}

	@Test
	@DisplayName("Get a user : ")
	@Disabled("Not yet implemented")
	void testGetUserDAOPostgres() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Login")
	void testLogin() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Is responsible of university ?")
	void testIsResponsibleOfUniversity() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Leave a university")
	@Disabled("Not yet implemented")
	void testLeaveUniversity() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Update a user")
	@Disabled("Not yet implemented")
	void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Delete a user")
	@Disabled("Not yet implemented")
	void testDeleteUser() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Get a user")
	void testViewUser() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Check a user already exists with this username")
	void testCheckIfExistsWithUsername() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Check a user already exists with this email")
	void testCheckIfExistsWithEmail() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Join a university")
	@Disabled("Not yet implemented")
	void testJoinUniversity() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Get all users")
	void testGetAllUsers() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Check if a user exist")
	void testCheckIfExists() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Get all users by role")
	void testGetAllUsersByRole() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Get all users by university role")
	void testGetAllUsersByUniversityRole() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Get all users by university")
	void testGetAllUsersByUniversity() {
		fail("Not yet implemented");
	}

}
