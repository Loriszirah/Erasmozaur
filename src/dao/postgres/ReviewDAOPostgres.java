package dao.postgres;
import java.util.*;
import dao.*;
import model.Review;

/**
 * 
 */
public class ReviewDAOPostgres implements ReviewDAO {
 
 	private static ReviewDAOPostgres instance = new ReviewDAOPostgres();
	
	public static ReviewDAOPostgres getReviewDAOPostgres() {
		return ReviewDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    public ReviewDAOPostgres() {
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