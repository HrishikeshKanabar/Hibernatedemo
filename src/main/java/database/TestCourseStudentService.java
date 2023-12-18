package database;
import controller.CourseStudentService;

public class TestCourseStudentService {

	public static void main(String[] args) {
		//StudentService obj = new StudentService();
		//obj.createStudent("Joe","Doe","email");

		CourseStudentService obj= new CourseStudentService();
		obj.createCourseForAnStudent(1,"Hibernate","ORM");
		obj.createCourseForAnStudent(1,"Spring","MVC");


	}

}
