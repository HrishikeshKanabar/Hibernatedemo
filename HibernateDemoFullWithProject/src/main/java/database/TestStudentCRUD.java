package database;
import service.StudentService;
import entity.Student;
public class TestStudentCRUD {

	public static void main(String[] args) {
		
		StudentService obj = new StudentService();
		
		//obj.createStudent("Kite","Bite","Kite@bite.com","4389067890");
		
		//Student stdWithIdTwo = obj.readStudent(2);
		//System.out.print(stdWithIdTwo.toString());
		
		obj.deleteStudent(2);
		
		//obj.update(1,"joe@gmail.com");
		
		
        
	}

}
