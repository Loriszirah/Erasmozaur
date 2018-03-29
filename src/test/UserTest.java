package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {

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
	void testCreateUser() {
		MaClasse2 mc = new MaClasse2(1,1);

		// cas de test 1
		assertEquals(2,mc.sommer());

		// cas de test 2
		try {
			mc.setA(0);
			mc.setB(0);
			mc.sommer();    
			fail("Une exception de type IllegalStateException aurait du etre levee");
		} catch (IllegalStateException ise) {
		}
		fail("Not yet implemented");
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
