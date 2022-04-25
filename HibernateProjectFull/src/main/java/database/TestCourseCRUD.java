package database;

import helper.CourseHelper;

public class TestCourseCRUD {
	
	public static void main(String[] args) {
		
		CourseHelper obj = new CourseHelper();
		 obj.createCourseForInstructor(10,"HTML","Fundamental of HTML");
		
	}

}
