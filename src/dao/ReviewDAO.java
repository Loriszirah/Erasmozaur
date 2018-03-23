package dao;
import java.util.*;

/**
 * 
 */
public interface ReviewDAO {

    /**
     * 
     */
    public void createReview(universityId: int, userId: int, rating: int, description: String): Review;

    /**
     * 
     */
    public void viewReview(id_review: int): Review;

    /**
     * 
     */
    public void getAllReviews(): ArrayList<Review>;

}