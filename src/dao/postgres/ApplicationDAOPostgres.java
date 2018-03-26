package dao.postgres;
import java.util.*;
import dao.*;
import model.Application;

/**
 * 
 */
public class ApplicationDAOPostgres implements ApplicationDAO {
 	private static ApplicationDAOPostgres instance = new ApplicationDAOPostgres();
	
	
	
	public static ApplicationDAOPostgres getApplicationDAOPostgres() {
		return ApplicationDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    public ApplicationDAOPostgres() {
    }

	@Override
	public Application createApplication(int userId, Date startDate, int duration, String comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Application viewApplication(int id_application) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateApplication(int id_application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteApplication(int id_application) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Application> getAllApplications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStatusApplication(int id_application, boolean status) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDocumentToApplication(int id_application, int id_document) {
		// TODO Auto-generated method stub
		
	}

}