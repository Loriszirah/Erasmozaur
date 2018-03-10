
public class User {
	private Integer id_user;
	private String name;
	private String password;
	private Integer id_type_user;
	
	public User(Integer id_user, String name, String password, Integer id_type_user) {
		this.id_user = id_user;
		this.name = name;
		this.password = password;
		this.id_type_user = id_type_user;
	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

	public Integer getId_type_user() {
		return id_type_user;
	}

	public void setId_type_user(Integer id_type_user) {
		this.id_type_user = id_type_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
