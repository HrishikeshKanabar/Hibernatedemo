package database;
import helper.StudentHelper;
import models.Student;
public class TestStudentCRUD {

	public static void main(String[] args) {
		
		StudentHelper object = new StudentHelper();
		
		//object.createStudent("Joe","Doe","Joe@Doe.com","678908675");
		//object.createStudent("Nancy","Fancy","Nancy@Doe.com","6567890");
		//object.deleteStudent(1);
		//object.updateStudentEmail(2,"nancy@fanc.com");
		Student myStudent=object.readStudent(2);
		
		System.out.println(myStudent.toString());
	}
	
	

}
