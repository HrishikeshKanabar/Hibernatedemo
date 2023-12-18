package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity                       // Java class as persistant object
@Table(name="student_table")  // Give name of Database
public class Student {

	// Fields
	@Id   // This is primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")   // Give name of table column
	int id;
	@Column(name="first_name")
	String firstName;
	@Column(name="last_name")
	String lastName;
	@Column(name="email")
	String email;

	// Many student have many courses
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			 name="course_student",
		     joinColumns=@JoinColumn(name="student_id"),   // Student Id
		     inverseJoinColumns=@JoinColumn(name="course_id")  // Course Id
			)
	private List<Course> courses;

	// Default constructor
	public Student() {

	}

	// Constructor

	public Student( String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	// Getters and setters
	// ALT+SHIFT+S
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}







}
