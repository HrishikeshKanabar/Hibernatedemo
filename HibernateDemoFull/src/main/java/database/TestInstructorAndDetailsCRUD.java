package database;

import service.InstructorAndDetailService;

public class TestInstructorAndDetailsCRUD {

	public static void main(String[] args) {
		
		InstructorAndDetailService  obj = new InstructorAndDetailService();
		
		obj.createInstructorWithDetails("Prof. Joe","Doe","joe@doe.com","3267890987","www.mcit.com","Hiking");

	}

}
