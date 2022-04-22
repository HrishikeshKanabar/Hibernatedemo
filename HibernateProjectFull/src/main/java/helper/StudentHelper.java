package helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Student;

public class StudentHelper {
	
	public static Session getSession() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session sess =factory.openSession();
		return sess;
	}
	
	public void createStudent(String fn,String ln ,String email,String phone) {
		Session sess = StudentHelper.getSession();
		Student st = new Student(fn,ln,email,phone);
		// Session life cycle
		sess.beginTransaction();
		sess.save(st);
		sess.getTransaction().commit();
		sess.close();
	}
	
    public Student readStudent(int id) {
    	Session sess = StudentHelper.getSession();
    	Student myStudent = sess.get(Student.class, id);
    	return myStudent;
	}
    
    public void updateStudentEmail(int id, String email) {
    	Session sess = StudentHelper.getSession();
    	// Session life cycle
		sess.beginTransaction();
		sess.createQuery("update Student set email="+"'"+email+"'"+" where id="+id).executeUpdate();
		sess.getTransaction().commit();
		sess.close();
	}
    
    public void deleteStudent(int id) {
    	Session sess = StudentHelper.getSession();
    	// Session life cycle
        sess.beginTransaction();
    	sess.createQuery("delete from Student where id="+id).executeUpdate();
    	sess.getTransaction().commit();
		sess.close();
	}

    
}
	

	


