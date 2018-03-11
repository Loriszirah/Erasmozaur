
public class LoginUI {
	private LoginFacade lf;
	
	public LoginUI() {
		this.lf = new LoginFacade();
	}
	
	public void register(String username, String password, String typeUser) {
		if(this.lf.register(username, password, typeUser)) {
			System.out.println("You have been registered !");
		}
		else {
			System.out.println("The username '"+username+"' already exists");
		}
	}
	
	public void login(String username, String password) {
		if(this.lf.login(username,password)) {
			System.out.println("Connection succeed !");
		}
	}
	
	public String getName() {
		return this.lf.getName();
	}
	
	public static void main(String[] args) {
		LoginUI test = new LoginUI();
		test.register("Stefan", "pwd", "Tutor");
		//test.register("Stefan", "pwd", "Tutor");
		test.login("Stefan", "pwd");
		System.out.println(test.getName());
	}
}
