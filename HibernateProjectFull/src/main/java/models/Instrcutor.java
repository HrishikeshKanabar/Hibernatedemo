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

@Entity
public class Instrcutor {
	
  

@Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="instructor_id")
   private int id;
   @Column(name="instructor_fn")
   private String firstName;
   @Column(name="instructor_ln")
   private String lastName;
   @Column(name="instructor_email")
   private String email;
   @Column(name="instructor_phone")
   private String phone;
   
   // Relation ship / Fk with instruction details
   // Object as relation ship
   @OneToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="instructor_detail_id")
   private InstructorDetails insDetails;
   
   @OneToMany(mappedBy="instructor",cascade= {CascadeType.PERSIST, CascadeType.MERGE,
			 CascadeType.DETACH, CascadeType.REFRESH})
   private List<Courses> courses;
   
   
   // Default Constructor
   
	public Instrcutor() {
		super();
		// TODO Auto-generated constructor stub
	}

	
  // Field Constructor
	
	public Instrcutor(String firstName, String lastName, String email, String phone) {
		
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
	
	// FK getters and setters
	
	 public InstructorDetails getInsDetails() {
			return insDetails;
		}


	public void setInsDetails(InstructorDetails insDetails) {
			this.insDetails = insDetails;
	}

	


	public List<Courses> getCourses() {
		return courses;
	}


	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
	
	@Override
		public String toString() {
			return "Instrcutor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", phone=" + phone + ", insDetails=" + insDetails.toString() + ", courses=" + courses.toString() + "]";
		}
	
	
	
			
			
	
	
	
	
	


	

	
	
	
   
   
   
}
