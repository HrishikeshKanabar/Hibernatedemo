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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Course_Table")
public class Course {

	// fields
	// Primary Key
	@Id
	// AUTO-INCREMENT
	@Column(name="course_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	@Column(name="Title")
	private String title;
	@Column(name="Description")
	private String description;

	// FK
	@ManyToOne(cascade = {CascadeType.PERSIST,
			               CascadeType.MERGE,
			               CascadeType.DETACH,
			               CascadeType.REFRESH})
	// FK
	@JoinColumn(name="Instructor_Id")
	private Instructor ins;

	// Many course have many student
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			     name="course_student",
			     joinColumns=@JoinColumn(name="course_id"),   // Course Id
			     inverseJoinColumns=@JoinColumn(name="student_id")  // Student Id

			)


	public List<Student> students;
	// getters and setter

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public Instructor getIns() {
		return ins;
	}



	public void setIns(Instructor ins) {
		this.ins = ins;
	}

	// Default constructor
	public Course() {
    }


	// constructor - fields
	public Course(String title, String description) {
			this.title = title;
			this.description = description;
	}


	// getter and setter

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
