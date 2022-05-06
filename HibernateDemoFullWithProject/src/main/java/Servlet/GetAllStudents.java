package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Student;
import service.CMPService;


/**
 * Servlet implementation class GetAllStudents
 */
@WebServlet("/GetAllStudents")
public class GetAllStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CMPService obj = new CMPService();
		List<Student> allStudents=obj.getAllStudents();
		request.setAttribute("allStudents",allStudents);
		request.getRequestDispatcher("/displayallstudent.jsp").forward(request, response);
	}

}
