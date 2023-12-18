package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Instructor_Table")
public class Instructor {

	// fields
	// Primary Key
	@Id
	// AUTO-INCREMENT
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="First_Name")
	private String firstName;
	@Column(name="Last_Name")
	private String lastName;
	@Column(name="Email")
	private String email;
	@Column(name="Phone")
	private String phone;

	// Relation ship to Instructor Details class
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Instructor_Details_Id")
	private InstructorDetails ObjInstructorDetails;

	// Relation ship with Course
	@OneToMany(mappedBy="ins",cascade=CascadeType.ALL)
	private List<Course> courses;



	// Getters and setters of object

	public List<Course> getCourses() {
		return courses;
	}



	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}



	public InstructorDetails getObjInstructorDetails() {
		return ObjInstructorDetails;
	}



	public void setObjInstructorDetails(InstructorDetails objInstructorDetails) {
		ObjInstructorDetails = objInstructorDetails;
	}




	// Constructor





	public Instructor() {

	}



	// Constructor with fields
	public Instructor(String firstName, String lastName, String email, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}


	// getters and setters

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



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}




}
