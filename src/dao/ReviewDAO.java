package dao;
import java.util.*;
import model.*;

/**
 * 
 */
public interface ReviewDAO {

    /**
     * 
     * @param universityId
     * @param userId
     * @param rating
     * @param description
     * @return
     */
    public Review createReview(int universityId, int userId, int rating, String description);

    /**
     * 
     * @param id_review
     * @return
     */
    public Review viewReview(int id_review);

    /**
     * 
     * @return
     */
    public ArrayList<Review> getAllReviews();

}