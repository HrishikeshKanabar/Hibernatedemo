package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Courses;
import entity.Instructor;

public class CourseService {
	
	// Configuration method
	public static Session getSession() {
				
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				SessionFactory Factory = cfg.buildSessionFactory();
				Session sess = Factory.openSession();
				
				return sess;
				
	}
	
	// Create course for an Instructor
	
	public void createCourseForInstructor(int instructorId ,String title,String desc) {
		    // Session 
			Session sess = CourseService.getSession();
			// Get instructor
			Instructor ins = sess.get(Instructor.class,instructorId);
			// Create a course
			Courses oneCourse = new Courses(title,desc);
			// For this course set instructor
			 oneCourse.setInstruc(ins);
			// Session life cycle
			 sess.beginTransaction();
		     sess.save(oneCourse);
		     sess.getTransaction().commit();
		     sess.close();
		
	}

}
