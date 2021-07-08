package inheritance;

public class StudentManager extends UserManager {
	
	public void listAllStudents(Student[] students) {
		for (Student student : students) {
			System.out.println(student.name);
		}
	}
	
	public void addStudent(Student student) {
		System.out.println(student.name+" added");
	}
}
