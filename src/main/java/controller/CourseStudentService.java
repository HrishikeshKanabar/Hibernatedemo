package controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Course;
import models.Student;

public class CourseStudentService {

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


	// Create Courses For an Student
	public void createCourseForAnStudent(int id, String title, String desc) {

		// Session
	   Session sess = CourseStudentService.getSession();
	   // Read student
	   Student mystd= sess.get(Student.class,id);
	   // Create course
	   Course crs = new Course(title,desc);
	   // Add student to list
	   List<Student> studentsTobeAddedToCourse = new ArrayList<>();
	   studentsTobeAddedToCourse.add(mystd);
	   // Added student to course
	   crs.setStudents(studentsTobeAddedToCourse);
	   // Session life cycle
	   sess.beginTransaction();
 	   sess.save(crs);
 	   sess.getTransaction().commit();
 	   sess.close();



	}

	// Find all course for a student
	//Update a course for a student
	// Delete a course and student

}
