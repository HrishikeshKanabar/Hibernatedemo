package database;
import controller.CourseService;
import controller.Instrustructor_Detail_Service;
public class TestCourseService {

	public static void main(String[] args) {

		Instrustructor_Detail_Service objId = new Instrustructor_Detail_Service();
		CourseService objCS=new CourseService();

		/*objId.createInstructorWithDetails("Snap","Serverous","snap@gmail.com",
				                             "51414","www.snap.com","Music");*/


		//objCS.createCoursesForInstructorById(2, "HTML","FrontEnd");

		objCS.createCoursesForInstructorById(2, "Python","AI");


	}

}
