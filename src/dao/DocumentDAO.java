package dao;
import java.util.*;
import model.*;

/**
 * 
 */
public interface DocumentDAO {

    /**
     * @param name 
     * @param url 
     * @param id_user 
     * @return
     */
    public Document createDocument(String name, String url, int id_user);

    /**
     * @param id_document
     */
    public void updateDocument(int id_document);

    /**
     * @param id_document
     */
    public void deleteDocument(int id_document);

    /**
     * @param id_user 
     * @return
     */
    public Document viewDocument(int id_user);

    /**
     * @param id_application 
     * @return
     */
    public ArrayList<Document> getAllDocumentsByApplication(int id_application);

    /**
     * @param id_user 
     * @return
     */
    public ArrayList<Document> getAllDocumentsByUser(int id_user);

    /**
     * @param id_document 
     * @return
     */
    public boolean checkIfExists(int id_document);

}