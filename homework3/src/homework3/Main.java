package homework3;

public class Main {

	public static void main(String[] args) {
		
		User user1 =new User();
		user1.setId(1);
		user1.setFirstName("Muhammet");
		user1.setLastName("Çölmekci");
		user1.setNationalIdenty("123456");
		
		User user2=new User();
		user2.setId(2);
		user2.setFirstName("Engin");
		user2.setLastName("Demiroð");
		user2.setNationalIdenty("654321");
		
		User[] users= {user1,user2};
		
		for(User user:users) {
			
			UserManager userManager=new UserManager();
			userManager.userAdd(user);
			}
		
		
		Instructor instructor1= new Instructor();
		instructor1.setId(user2.getId());
		instructor1.setFirstName(user2.getFirstName());
		instructor1.setLastName(user2.getLastName());
		instructor1.setNationalIdenty(user2.getNationalIdenty());
		instructor1.setEducation("Java");
		instructor1.setInstructorNumber(1);
		
		Student student= new Student();
		student.setId(user1.getId());
		student.setFirstName(user1.getFirstName());
		student.setLastName(user1.getLastName());
		student.setNationalIdenty(user1.getNationalIdenty());
		student.setStudentNumber("1000");
		student.setMyLessonName("Java");
		
		
		
			
		InstructorManager instructorManager= new InstructorManager();
			
		instructorManager.addEducation(instructor1);
		
		
		StudentManager studentManager= new StudentManager();
		
		studentManager.addLesson(student);
		
	}

}
