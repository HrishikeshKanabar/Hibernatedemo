package helper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Courses;
import models.Instrcutor;

public class CourseHelper {
	
  public static Session getSession() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session sess =factory.openSession();
		return sess;
	}
     

    public void createCourseForInstructor(int instructorId , String title,String desc) {
    	Session sess =  CourseHelper.getSession();
    	Instrcutor ins = sess.get(Instrcutor.class, instructorId);
    	Courses oneCourse = new Courses(title,desc);
    	oneCourse.setInstructor(ins);
    	// Session life cycle
         sess.beginTransaction();
         sess.save(oneCourse);
         sess.getTransaction().commit();
 		 sess.close();
 		
 	}
   
     
    
    public Instrcutor readallCourseForInstructor(int instructorId) {
    	Session sess =  CourseHelper.getSession();
    	Instrcutor ins = sess.get(Instrcutor.class, instructorId);
    	return ins;
    	
    }
    
    public void updateCourseTitle(int courseId , String title) {
    	Session sess =  CourseHelper.getSession();
    	Courses courseOne = sess.get(Courses.class, courseId);
    	 // Session life cycle
		sess.beginTransaction();
		sess.createQuery("update Courses set title='"+title+"' where id="+courseOne.getId()).executeUpdate();
		sess.getTransaction().commit();
		sess.close();
    }

    public void deleteCourse(int courseId) {
    	Session sess =  CourseHelper.getSession();
    	Courses courseOne = sess.get(Courses.class, courseId);
    	// Session life cycle
		 sess.beginTransaction();
		 sess.delete(courseOne);
		 sess.getTransaction().commit();
		 sess.close();
    		 
    }

}
