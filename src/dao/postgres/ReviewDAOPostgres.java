package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import dao.*;
import model.Review;

/**
 * 
 */
public class ReviewDAOPostgres implements ReviewDAO {
 
 	private static ReviewDAOPostgres instance = new ReviewDAOPostgres();
 	protected String url;
    protected String userDB;
    protected String passwdDB;
    protected Connection conn;
 	
	public static ReviewDAOPostgres getReviewDAOPostgres() {
		return ReviewDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private ReviewDAOPostgres() {
    	this.url = System.getenv("DBurl");
		this.userDB =System.getenv("DBuser");
		this.passwdDB = System.getenv("DBpwd");
		this.openConnection();
    }
    
    /**
     *  This function connect you to the Database
     */
    public void openConnection() {
    	try {
			this.conn = DriverManager.getConnection(url, userDB, passwdDB);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

	public Review createReview(int universityId, int userId, int rating, String description) {
		// TODO Auto-generated method stub
		return null;
	}

	public Review viewReview(int id_review) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Review> getAllReviews() {
		// TODO Auto-generated method stub
		return null;
	}

}