package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class StudentService {

	// Configuration method
	public static Session getSession() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory Factory = cfg.buildSessionFactory();
		Session sess = Factory.openSession();
		
		return sess;
		
	}
	
	// Create student
	
	public void createStudent(String fn ,String ln ,String email, String phone) {
		
		Session sess =StudentService.getSession();
		// Create student
		Student st = new Student (fn,ln,email,phone);
		// Life cycle
		sess.beginTransaction();
		sess.save(st);
		sess.getTransaction().commit();
		sess.close();
		
	}
	
	// read student by id 
	
	public Student readStudent(int id) {
		Session sess =StudentService.getSession();
		                    //Type of object ,id
		Student myStudent = sess.get(Student.class,id);
		return myStudent;
		
	}
	
	// update email
	
	public void update(int id , String newEmail) {
		Session sess =StudentService.getSession();
		// Life cycle
		sess.beginTransaction();
		// update Student set email = 'newemail@test.com' where id =1
		sess.createQuery("update Student set email='"+newEmail+"' where id="+id).executeUpdate();
	    sess.getTransaction().commit();
	    sess.close();
	    
	}
	
	// delete student bu id
	
	public void deleteStudent(int id) {
		Session sess =StudentService.getSession();
		// Life cycle
		sess.beginTransaction();
		sess.createQuery("delete from Student where id ="+id).executeUpdate();
		sess.getTransaction().commit();
		sess.close();
	}
	

}
