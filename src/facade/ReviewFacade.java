package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.ReviewDAO;
import dao.ScholarshipDAO;
import model.*;

/**
 * 
 */
public class ReviewFacade {
	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private ReviewDAO reviewDAO = factory.getReviewDAO();
	
    /**
     * Default constructor
     */
    public ReviewFacade() {
    }


    /**
     * Create a review
     * @param universityId 
     * @param userId 
     * @param rating 
     * @param description 
     * @return a review with the given parameters
     */
    public Review createReview(int universityId, int userId, int rating, String description) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_review 
     * @return the review corresponding to the given id
     */
    public Review viewReview(int id_review) {
        // TODO implement here
        return null;
    }

    /**
     * @return an array list of all the reviews
     */
    public ArrayList<Review> getAllReviews() {
        // TODO implement here
        return null;
    }

}