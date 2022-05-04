package service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Courses;
import entity.Student;

public class Course_Student {
	
	// Configuration method
		public static Session getSession() {
					
					Configuration cfg = new Configuration();
					cfg.configure("hibernate.cfg.xml");
					SessionFactory Factory = cfg.buildSessionFactory();
					Session sess = Factory.openSession();
					return sess;
					
		}
		
   
		
   // Create Course  for an Student
		
		public void createCourseForAnStudent(String firstName, String lastName, String email, String phone,
				                      String title, String desc) {
			
			
			// Session 
			Session sess = Course_Student.getSession();
			// Create student
			Student std = new Student(firstName,lastName,email,phone);
			
			// Create  course
			Courses cors = new Courses(title,desc);
			
			// set student to course
			List<Student> studentslist = new ArrayList<Student>();
			studentslist.add(std);
			
			// set course for student
			//List<Courses> courselist = new ArrayList<Courses>();
			//courselist.add(cors);
			
			cors.setStudents(studentslist);
			//std.setCourse(courselist);
			// Session life cycle
		    sess.beginTransaction();
		    //sess.save(std);
		    sess.save(cors);
		    sess.getTransaction().commit();
		    sess.close();
			
			
		}
		
		

}
