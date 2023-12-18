package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Student;

import java.io.IOException;
import java.util.List;

import controller.StudentService;

/**
 * Servlet implementation class CreateStudent
 */
@WebServlet("/createStudent")
public class CreateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String fn= request.getParameter("firstname");
		String ls= request.getParameter("lastname");
		String email= request.getParameter("studentemail");
		
		System.out.println("First Name:"+fn);
		System.out.println("Last Name:"+ls);
		System.out.println("Email:"+email);
		
		StudentService obj = new StudentService();
		obj.createStudent(fn, ls, email);
		
		
		List<Student> allStudents=obj.getAllStudents();
		request.setAttribute("allStudents",allStudents);
		request.getRequestDispatcher("/getallstudents.jsp").forward(request, response);
		request.getRequestDispatcher("/getallstudents.jsp").forward(request, response);


		
		
	}

	

}
