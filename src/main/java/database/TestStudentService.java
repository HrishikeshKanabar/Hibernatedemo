package database;

import java.util.ArrayList;
import java.util.List;

import controller.StudentService;
import models.Student;

public class TestStudentService {

	public static void main(String[] args) {

		StudentService obj = new StudentService();
		obj.createStudent("Kite","Bite","Kite@bite.com");

		//StudentService obj = new StudentService();
		//Student stdSeven=obj.getStudentById(7);

		//System.out.println("Student Object: "+stdSeven);
		//System.out.println("Student ID: "+stdSeven.getId());
		//System.out.println("Student First Name: "+stdSeven.getFirstName());
		//System.out.println("Student LAST Name: "+stdSeven.getLastName());
		//System.out.println("Student Email:"+stdSeven.getEmail());

		//StudentService obj = new StudentService();

		//obj.updateStudentEmailById(7,"kite123@bite.com");

		//StudentService obj = new StudentService();
		//obj.deleteStudentById(2);

		//StudentService obj = new StudentService();
		//List<Student> allStds = new ArrayList<Student>();
		//allStds=obj.getAllStudents();
		//System.out.println(allStds.get(0));

		//StudentService obj = new StudentService();
		//List<Student> allStds = new ArrayList<Student>();
		//allStds=obj.getStudentByLastName("bite5");

		//StudentService obj = new StudentService();
		//List<Student> allStds = new ArrayList<>();
		//allStds=obj.searchStudentByLastName("k");

		/*for (Student std : allStds) {

	System.out.println("FIRST NAME: "+std.getFirstName()
			           +" LAST NAME:  "+std.getLastName());
		}*/

	}

}
