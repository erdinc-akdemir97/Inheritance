package inheritance;

public class UserManager {
	
	public void listAllUsers(User[] users) {
		for (User user : users) {
			System.out.println(user.name);
		}
	}
	
	public void addMultiply(User[] users) {
		for (User user : users) {
			System.out.println(user.name+" added");
		}
	}
}
