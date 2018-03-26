package dao.postgres;
import java.util.*;
import model.*;
import dao.*;

/**
 * 
 */
public class DocumentDAOPostgres implements DocumentDAO {
    private static DocumentDAOPostgres instance = new DocumentDAOPostgres();
	
	
	
	public static DocumentDAOPostgres getDocumentDAOPostgres() {
		return DocumentDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    public DocumentDAOPostgres() {
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
    public ArrayList<Document> getAllDocumentsByDocument(int id_user) {
        // TODO implement here
        return null;
    }

    /**
     * @param id_document 
     * @return
     */
    public boolean checkIfExists(int id_document) {
        // TODO implement here
        return false;
    }
    
	@Override
	public ArrayList<Document> getAllDocumentsByUser(int id_user) {
		// TODO Auto-generated method stub
		return null;
	}

}