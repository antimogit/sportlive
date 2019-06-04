package it.contrader.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet extends HttpServlet {

	private final UserService usersService = new UserService();

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final HttpSession session = request.getSession();
		session.setAttribute("utente", null);

		if (request != null) {
			final String nomeUtente = request.getParameter("username").toString();
			final String usertype = request.getParameter("user_type").toString();
			final String password = request.getParameter("password").toString();
			final String name = request.getParameter("name").toString();
			final String surname = request.getParameter("surname").toString();
			final String cf = request.getParameter("cf").toString();
			// recuperiamo l'utente
			usersService.register(nomeUtente,, password);

			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
		}
	}

}
