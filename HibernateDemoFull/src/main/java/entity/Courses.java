package entity;

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
@Table(name="my_courses")
public class Courses {
	
	// PK
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="course_id")
	private int id;
	@Column(name="course_title")
	private String title;
	@Column(name="course_desc")
	private String desc;
	
    // FK
	@ManyToOne(cascade=  {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="id")
	private Instructor instruc;
	
	@ManyToMany(cascade= CascadeType.ALL /*{CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH}*/)
	@JoinTable(
			    name="course_student",
			    joinColumns=@JoinColumn(name="course_id"),   // PK in Join table
			    inverseJoinColumns= @JoinColumn(name="student_id")  // FK in Join table
			)
	private List<Student> students;
	 
	
	// Default constructor
	
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	// Fields  constructor


	

	public Courses(String title, String desc) {
		super();
		this.title = title;
		this.desc = desc;
	}

	
	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	// Getters and setters for instructor

	public Instructor getInstruc() {
		return instruc;
	}

	public void setInstruc(Instructor instruc) {
		this.instruc = instruc;
	}
	
	// Getters and setters for students
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", desc=" + desc + ", instruc=" + instruc + "]";
	}

	
	
	
	
	
	

}
