package controller.concrete.impl;

import java.io.IOException;

import controller.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DoAuth implements Command {

	@Override
	public void execute(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		/*if(logic.checkAuth(login, password)) {
			//response.getWriter().println("<html> <header>");
			//response.getWriter().println("</html>");
			request.setAttribute("invitationMessage", "Hello, user!");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
			dispatcher.forward(request, response);
		}else {
			request.setAttribute("authError", "Неправильный логин или пароль!");
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}*/
		
	}
}
