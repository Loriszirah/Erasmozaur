package dao.postgres;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import dao.ScholarshipDAO;
import model.Scholarship;
import presenters.ScholarshipPresenter;

/**
 * 
 */
public class ScholarshipDAOPostgres extends AbstractDAOPostgres implements ScholarshipDAO {
    private static ScholarshipDAOPostgres instance = new ScholarshipDAOPostgres();
	
	public static ScholarshipDAOPostgres getScholarshipDAOPostgres() {
		return ScholarshipDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private ScholarshipDAOPostgres() {
    	super();
    	this.openConnection();
    }

    /**
     * @param description 
     * @param duration 
     * @param startDate 
     * @param endDate 
     * @return
     */
    public Scholarship createScholarship(String description, int duration, Date startDate, Date endDate, String domain, int id_receiving_university) {
    	try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			// Creation of a Statement object
			Statement state = conn.createStatement();

			//The object ResultSet contains the result of the SQL request
			state.executeUpdate("INSERT INTO Scholarships (description, duration, startDate, endDate, domain, id_receiving_university) VALUES('"+description+"','"+duration+"','"+startDate+"','"+endDate+"','"+domain+"','"+id_receiving_university+"')");

			// The object ResultSet contains the result of the SQL request
			ResultSet result = state.executeQuery("SELECT * FROM Scholarships WHERE id_receiving_university = "+id_receiving_university+" AND startdate='"+startDate+"'");

			// Get the user in the database if exists and create the user
			if(result.next()) {
				Scholarship scholarship = new Scholarship(result.getInt("id_scholarship"), result.getString("description"), result.getInt("duration"), result.getDate("startdate"), result.getDate("enddate"), result.getString("domain"), result.getInt(id_receiving_university));
				return scholarship;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
    }

    /**
     * @param id_scholarship
     */
    public void updateScholarship(Scholarship scholarship) {
        // TODO implement here
    }

    /**
     * @param id_scholarship
     */
    public void deleteScholarship(int id_scholarship) {
    	try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			// Creation of a Statement object
			Statement state = conn.createStatement();
			state.executeUpdate("DELETE FROM Scholarships WHERE id_scholarship = "+id_scholarship);

		}catch(SQLException e) {
			e.printStackTrace();
		}
    }

    /**
     * @param id_scholarship 
     * @return
     */
    public Scholarship viewScholarship(int id_scholarship) {
    	Scholarship scholarship = null;
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();
			// Check if the username already exist

			ResultSet exists = state.executeQuery("SELECT id_scholarship, description, duration, startdate, enddate, domain, Universities.name universityName "
					+ "FROM Scholarships, Universities, Users "
					+ "WHERE Scholarships.id_receiving_university = Universities.id_university"
					+ "AND "
					+ " AND Universities.id_university =" +id_scholarship);

			String nameUniversity, descriptionScholarship, domainScholarship;
			java.sql.Date enddateScholarship;
			java.sql.Date startdateScholarship;
			int durationScholarship;
			if(exists.next()) {
				nameUniversity = exists.getString("nameUniversity");
				descriptionScholarship = exists.getString("description");
				durationScholarship = exists.getInt("duration");
				startdateScholarship = exists.getDate("startdate");
				enddateScholarship = exists.getDate("enddate");
				domainScholarship = exists.getString("domain");

				scholarship = new Scholarship(id_scholarship, descriptionScholarship,durationScholarship, startdateScholarship, enddateScholarship, domainScholarship,id_scholarship);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return scholarship;
    }

    /**
     * @return
     */
    public ArrayList<Scholarship> getAllScholarships() {
    	ArrayList<Scholarship> scholarships = new ArrayList<Scholarship>();
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();

			ResultSet exists = state.executeQuery("SELECT * FROM Scholarships");
//			System.out.println("Size wtf - "+exists.getFetchSize());
//
			if(exists.next()){
				while(exists.next()) {
					scholarships.add(new Scholarship(exists.getInt("id_scholarship"),exists.getString("description"),exists.getInt("duration"),exists.getDate("startdate"),exists.getDate("enddate"),exists.getString("domain"),exists.getInt("id_receiving_university")));
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return scholarships;
    }
    
    /**
     * @return
     */
    public ArrayList<ScholarshipPresenter> getAllScholarshipPresenters() {
    	ArrayList<ScholarshipPresenter> scholarships = new ArrayList<ScholarshipPresenter>();
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();
			
			ResultSet exists = state.executeQuery("SELECT id_scholarship, description, duration, startdate, enddate, domain, Universities.name universityName "
					+ "FROM Scholarships, Universities "
					+ "WHERE Scholarships.id_receiving_university = Universities.id_university ;");

			int id_scholarship, duration;
			Date startdate, enddate;
			String description, domain, universityName;
			
			while(exists.next()) {
				id_scholarship = exists.getInt("id_scholarship");
				description = exists.getString("description");
				duration = exists.getInt("duration");
				startdate = exists.getDate("startdate");
				enddate = exists.getDate("enddate");
				domain = exists.getString("domain");
				universityName = exists.getString("universityName");
				scholarships.add(new ScholarshipPresenter(id_scholarship, description, duration, startdate, enddate, domain, universityName));
			}
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return scholarships;
    }

    public ArrayList<Scholarship> getAllScholarshipsByUniversity(int id_sending_university) {
    	ArrayList<Scholarship> scholarships = new ArrayList<Scholarship>();
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();
			// Check if the username already exist

			ResultSet exists = state.executeQuery("SELECT * FROM Scholarships WHERE id_sending_university = "+id_sending_university+";");

			while(exists.next()) {
				scholarships.add(new Scholarship(exists.getInt("id_scholarship"),exists.getString("description"),exists.getInt("duration"),exists.getDate("startdate"),exists.getDate("enddate"),exists.getString("domain"),exists.getInt("id_receiving_university") ));
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return scholarships;
    }
    /**
	 * @param id_university 
	 * @return
	 */
	public ScholarshipPresenter viewScholarshipPresenter(int id_university) {
		ScholarshipPresenter scholarshipPresenter = null;
		try {
			if(!this.conn.isValid(1)) {
				openConnection();
			}
			//Creation of a Statement object
			Statement state = conn.createStatement();
			// Check if the username already exist

			ResultSet exists = state.executeQuery("SELECT id_scholarship, description, duration, startdate, enddate, domain, Universities.name universityName "
					+ "FROM Scholarships, Universities, Users "
					+ "WHERE Scholarships.id_receiving_university = Universities.id_university"
					+ " AND Scholarships.id_scholarship =" +id_university);

			String nameUniversity, descriptionScholarship, domainScholarship;
			java.sql.Date enddateScholarship;
			java.sql.Date startdateScholarship;
			int id_scholarship, durationScholarship;
			if(exists.next()) {
				nameUniversity = exists.getString("universityname");
				descriptionScholarship = exists.getString("description");
				durationScholarship = exists.getInt("duration");
				startdateScholarship = exists.getDate("startdate");
				enddateScholarship = exists.getDate("enddate");
				domainScholarship = exists.getString("domain");

				scholarshipPresenter = new ScholarshipPresenter(1,descriptionScholarship,durationScholarship, startdateScholarship, enddateScholarship, domainScholarship, nameUniversity);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return scholarshipPresenter;
	}

    /**
     * @param id_user 
     * @return
     */
    public boolean checkIfExists(int id_user) {
        // TODO implement here
        return false;
    }

}