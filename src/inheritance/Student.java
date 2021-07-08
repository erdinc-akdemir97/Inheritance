package inheritance;

public class Student extends User {
	
	int countOfCourses;
	double gpa;
	String email;
	
	
	public int getCountOfCourses() {
		return countOfCourses;
	}
	public void setCountOfCourses(int countOfCourses) {
		this.countOfCourses = countOfCourses;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getGpa() {
		return gpa;
	}
	
	
	
}
