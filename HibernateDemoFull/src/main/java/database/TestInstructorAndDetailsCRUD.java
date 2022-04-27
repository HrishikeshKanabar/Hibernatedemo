package database;

import entity.Instructor;
import service.InstructorAndDetailService;

public class TestInstructorAndDetailsCRUD {

	public static void main(String[] args) {
		
		InstructorAndDetailService  obj = new InstructorAndDetailService();
		
		//obj.createInstructorWithDetails("Prof. Dell","Bell","dell@bell.com","676866875","www.dellbell.com","Biking");
        //Instructor insObj=obj.readInstructorAndDetails(1);
        //System.out.println(insObj.toString());
		
		//obj.updateInstructorEmailandHobby(1,"joe@gmail.com","music");
		
		//obj.deleteInstructorByQuery(1);
		
		obj.deleteInstructorByHibernateEntity(2);
	}

}
