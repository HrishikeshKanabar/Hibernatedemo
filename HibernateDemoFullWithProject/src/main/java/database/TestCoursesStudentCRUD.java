package database;

import service.Course_Student;

public class TestCoursesStudentCRUD {

	public static void main(String[] args) {
		
		Course_Student obj = new Course_Student();
		
		obj.createCourseForAnStudent("cors123","Mackcors123","Tackcors123@mack.com","678907765123","Springcors123","Intro123 to Springcors");
	}

}
