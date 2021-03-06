package facade;
import java.util.*;

import dao.AbstractFactoryDAO;
import dao.DocumentDAO;
import dao.ScholarshipDAO;
import model.*;

/**
 * 
 */
public class DocumentFacade {
	
	private AbstractFactoryDAO factory = AbstractFactoryDAO.getFactory();
	private DocumentDAO documentDAO = factory.getDocumentDAO();

    /**
     * Default constructor
     */
    public DocumentFacade() {
    }


    /**
     * Create a document
     * @param name 
     * @param url 
     * @param id_user 
     * @return the document with the given parameters
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
     * Delete a document
     * @param id_document
     */
    public void deleteDocument(int id_document) {
        // TODO implement here
    }

    /**
     * @param id_user 
     * @return the document with the given id
     */
    public Document viewDocument(int id_user) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_application 
     * @return an array list of all the documents of the given application
     */
    public ArrayList<Document> getAllDocumentsByApplication(int id_application) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_user 
     * @return an array list of all the documents of the given user
     */
    public ArrayList<Document> getAllDocumentsByUser(int id_user) {
        // TODO implement here
        return null;
    }
}