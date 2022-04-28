package database;

import service.CourseService;

public class TestCourseCRUD {
	
	public static void main(String[] args) {
	
		CourseService obj = new CourseService();
		
		obj.createCourseForInstructor(4, "Hibernate","ORM basics");
	}

}
