package dao.postgres;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
import model.*;
import dao.*;

/**
 * 
 */
public class DocumentDAOPostgres implements DocumentDAO {
    private static DocumentDAOPostgres instance = new DocumentDAOPostgres();
    protected String url;
    protected String userDB;
    protected String passwdDB;
    protected Connection conn;
	
	
	public static DocumentDAOPostgres getDocumentDAOPostgres() {
		return DocumentDAOPostgres.instance;
	}
    /**
     * Default constructor
     */
    private DocumentDAOPostgres() {
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