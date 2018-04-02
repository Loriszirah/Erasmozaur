package model;

/**
 * 
 */
public class Course {

    /**
     * @param id_course
     * @param name
     * @param specialization
     * @param id_university
     */
    public Course(int id_course, String name, String specialization, int id_university) {
    	
    }

    /**
     * 
     */
    private int id_course;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String specialization;
    
    /**
     * 
     */
    private int id_university;

	public int getId_university() {
		return id_university;
	}

	public void setId_university(int id_university) {
		this.id_university = id_university;
	}

	public int getId_course() {
		return id_course;
	}

	public void setId_course(int id_course) {
		this.id_course = id_course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
}