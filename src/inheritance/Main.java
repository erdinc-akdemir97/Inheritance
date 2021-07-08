package inheritance;

import java.awt.desktop.UserSessionEvent;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1=new Instructor();
		instructor1.id=601;
		instructor1.name="Erdinç Akdemir";
		instructor1.languages="Java,C++";
		instructor1.salary=7500;
		
		Instructor instructor2=new Instructor();
		instructor2.id=602;
		instructor2.name="Hüseyin Yancý";
		
		Student student1=new Student();
		student1.id=101;
		student1.name="Ali Güler";
		
		Student student2=new Student();
		student2.id=102;
		student2.name="Buket Yalçýnkaya";
		
		User[] kullanicilar= {instructor1,instructor2,student1,student2};
		
		UserManager userManager=new UserManager();
		userManager.addMultiply(kullanicilar);
		userManager.listAllUsers(kullanicilar);
		
		

	}

}
