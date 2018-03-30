package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dao.AbstractFactoryDAO;
import dao.postgres.UserDAOPostgres;
import model.User;

class UserTest {
	AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	UserDAOPostgres userDAO = UserDAOPostgres.getUserDAOPostgres();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

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
	@Disabled
	void testCreateUser() {
		//Cas de test 1
		try {
			User user = userDAO.createUser("Fabien", "Turgut", "pwd", "fabien@gmail.com", "Fab", null, "Polytech Montpellier", "Student");
			User userToVerify = new User(user.getId(), "Fabien", "Turgut", "pwd", "fabien@gmail.com", "Fab", null, "Polytech Montpellier", 2);
			assertTrue("Both objects are equals.", user.equals(userToVerify));
		} catch (Exception e) {
			fail("Fail to create an user in database");
		}
	}

	@Test
	@DisplayName("Login")
	void testLogin() {
		//Cas de test 1
		User user = userDAO.viewUser(1);
		User userConnected = userDAO.login("Melvil", "pwd");
		assertTrue("The login was good", user.equals(userConnected));

		//Cas de test2
		User userConnected2 = userDAO.login("Melvil", "nothing");
		assertTrue("The login failed", userConnected2 == null);

	}

	@Test
	@DisplayName("Is responsible of university ?")
	void testIsResponsibleOfUniversity() {
		//Cas de test 1
		User user = userDAO.viewUser(3);
		assertTrue("The user is responsible", userDAO.isResponsibleOfUniversity(user.getId()));

		//Cas de test 2
		User user2 = userDAO.viewUser(1);
		assertFalse("The user isn't responsible", userDAO.isResponsibleOfUniversity(user2.getId()));
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
		//Cas de test 1
		User user = userDAO.viewUser(1);
		User userToVerify = new User(1, "Melvil", "Donnart", "pwd", "melvil.donnart@gmail.com", "Melvil", null, null, 1); 
		assertTrue("The user is well retrieve from the database", user.equals(userToVerify));

		//Cas de test 2
		User user2 = userDAO.viewUser(1500);
		assertTrue("The user doesn't exist", user2 == null);
	}

	@Test
	@DisplayName("Check a user already exists with this username")
	void testCheckIfExistsWithUsername() {
		//Cas de test 1
		assertTrue("The username 'Melvil' already exists in the database", userDAO.checkIfExistsWithUsername("Melvil"));

		//Cas de test 2
		assertFalse("The username 'Clément' doesn't exists in the database", userDAO.checkIfExistsWithUsername("Clément"));
	}

	@Test
	@DisplayName("Check a user already exists with this email")
	void testCheckIfExistsWithEmail() {
		//Cas de test 1
		assertTrue("The email 'melvil.donnart@gmail.com' already exists in the database", userDAO.checkIfExistsWithEmail("melvil.donnart@gmail.com"));

		//Cas de test 2
		assertFalse("The username 'clement@gmail.com' doesn't exists in the database", userDAO.checkIfExistsWithEmail("clement@gmail.com"));
	}

	@Test
	@DisplayName("Join a university")
	@Disabled("Not yet implemented")
	void testJoinUniversity() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Get all users")
	@Disabled("Not yet implemented")
	void testGetAllUsers() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Check if a user exist")
	@Disabled("Not yet implemented")
	void testCheckIfExists() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Get all users by role")
	@Disabled("Not yet implemented")
	void testGetAllUsersByRole() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Get all users by university role")
	@Disabled("Not yet implemented")
	void testGetAllUsersByUniversityRole() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Get all users by university")
	@Disabled("Not yet implemented")
	void testGetAllUsersByUniversity() {
		fail("Not yet implemented");
	}

}
