package dao;
import java.util.*;
import model.*;

/**
 * 
 */
public interface ReviewDAO {

    /**
     * 
     */
    public Review createReview(int universityId, int userId, int rating, String description);

    /**
     * 
     */
    public Review viewReview(int id_review);

    /**
     * 
     */
    public ArrayList<Review> getAllReviews();

}