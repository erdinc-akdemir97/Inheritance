package inheritance;

public class InstructorManager extends UserManager {
	
	public void listAllInstructors(Instructor[] Instructors) {
		for (Instructor instructor : Instructors) {
			System.out.println(instructor.name);
		}
	}
	
	public void addInstructor(Instructor instructor) {
		System.out.println(instructor.name+" added");
	}

}
