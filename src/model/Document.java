package model;
import java.util.*;

/**
 * 
 */
public class Document {

    /**
     * Default constructor
     */
    public Document() {
    }

    /**
     * 
     */
    public int id_document;

    /**
     * 
     */
    public String name;

    /**
     * 
     */
    public String url;

	public int getId_document() {
		return id_document;
	}

	public void setId_document(int id_document) {
		this.id_document = id_document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}