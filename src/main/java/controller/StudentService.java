package controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.Student;

public class StudentService {

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


	// Create Student

	public void createStudent(String fn ,String ln ,String em) {
		Session sess = StudentService.getSession();
		Student st = new Student(fn,ln,em);
		// Life cycle of session
		sess.beginTransaction();
		sess.save(st);
		sess.getTransaction().commit();
		sess.close();


	}

	// Read Student

	public Student getStudentById(int iden) {
		Session sess = StudentService.getSession();
		// Read
		Student myStudent = sess.get(Student.class, iden);
		sess.close();
		return myStudent;


	}

	// update Student

	public void updateStudentEmailById(int Id, String email) {
		Session sess = StudentService.getSession();
		// Read student
		// Life cycle
		Student myStudent = sess.get(Student.class, Id);
		sess.beginTransaction();
		// Update student email
		myStudent.setEmail(email);
		sess.getTransaction().commit();
		sess.close();

	}

	// Delete Student

	public void deleteStudentById(int Id) {
		Session sess = StudentService.getSession();
		// Read student
	    Student myStudent = sess.get(Student.class, Id);
	    // Life cycle
	    sess.beginTransaction();
	    // Delete
	    sess.delete(myStudent);
	    sess.getTransaction().commit();
	    sess.close();

	}

	// Get all Students
	public List<Student> getAllStudents(){
		Session sess = StudentService.getSession();
		List<Student> allStds = new ArrayList<>();
		// To get all students
		// You class name "Student" not table name
		allStds = sess.createQuery("from Student")
				      .getResultList();
		sess.close();

		return allStds;
	}

	// Find Stdent with Last Name
	public List<Student> getStudentByLastName(String LastName){
		Session sess = StudentService.getSession();
		List<Student> allStds = new ArrayList<>();
		// To get student by Last name
		// Not Column name but name of field or Variable in class
		// From Student where lastName='Joe'
		String hqlQuery = "from Student where lastName="+"'"+LastName+"'";
		allStds = sess.createQuery(hqlQuery)
			      .getResultList();
		sess.close();
		return allStds;

	}

	// Search student by lastName
	public List<Student> searchStudentByLastName(String LastName){
		Session sess = StudentService.getSession();
		List<Student> allStds = new ArrayList<>();
		// Search by keyword
		// from Student where lastName like '%<keyWord>Bi%'
		String hqlQuery = "from Student where lastName Like"+"'%"+LastName+"%'";
		allStds = sess.createQuery(hqlQuery)
			      .getResultList();
		return allStds;
	}




}
