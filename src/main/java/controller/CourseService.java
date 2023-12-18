package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Course;
import models.Instructor;

public class CourseService {

	public static Session getSession() {
		// Configuration class
		// Step-1
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// Session Factory
		// Step-2
		SessionFactory factory = cfg.buildSessionFactory();

        //Session
		// Step-3
        Session sess=  factory.openSession();

        return sess;

	}

	// Create
	public void createCoursesForInstructorById(int id ,
			                                 String titleOne,
			                                 String descOne) {

		// Session
		Session sess = StudentService.getSession();
		// Read Instructor
		Instructor insWithDets = sess.get(Instructor.class,id);
		// Create first course
		Course firstCourse = new Course(titleOne,descOne);
		// Assigning or Setting instructor to course
		firstCourse.setIns(insWithDets);
		// Session life cycle
  		sess.beginTransaction();
  		sess.save(firstCourse);
  		sess.getTransaction().commit();
  		sess.close();


	}

	// Read Course
	// Update Course
	// Delete Course


}
