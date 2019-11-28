package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDAOManager;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		EmployeeInfo info = new EmployeeInfo();
		System.out.println(info);
		info.setId(id);
		info.setName(name);
		info.setEmail(email);
		info.setPassword(password);

		EmployeeDAO dao = EmployeeDAOManager.getEmployeeDAO();
		boolean check = dao.registerEmployee(info);
		System.out.println(check);

		PrintWriter out = resp.getWriter();

		if (check) {
			out.println("<html>");
			out.println("<h4>Registration Completed");
			out.println("</h4>");
			out.println("</html>");
		} else {
			out.println("<html>");
			out.println("<h4>ID cannot be repeated</h4>");
			out.println("</html>");
		}

		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
		dispatcher.include(req, resp);

	}
}