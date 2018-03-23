package controller;
import java.util.*;
import model.*;

/**
 * 
 */
public class DocumentFacade {

    /**
     * Default constructor
     */
    public DocumentFacade() {
    }


    /**
     * @param name 
     * @param url 
     * @param id_user 
     * @return
     */
    public Document createDocument(String name, String url, int id_user) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_document
     */
    public void updateDocument(int id_document) {
        // TODO implement here
    }

    /**
     * @param id_document
     */
    public void deleteDocument(int id_document) {
        // TODO implement here
    }

    /**
     * @param id_user 
     * @return
     */
    public Document viewDocument(int id_user) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_application 
     * @return
     */
    public ArrayList<Document> getAllDocumentsByApplication(int id_application) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_user 
     * @return
     */
    public ArrayList<Document> getAllDocumentsByUser(int id_user) {
        // TODO implement here
        return null;
    }

}