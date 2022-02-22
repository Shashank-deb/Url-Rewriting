package com.shashank;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("user_name");
		out.println("<h1 style='color:green;'>Your name is: " + name + "</h1>");
		// this is url rewriting
		// servlet 1 se user ka data servlet2 me jayega
		// cookie me space nhi use kar sakte he name me
		// url rewriting me url ka parameter pass kar sakte he dusre servlet me
		out.println("<a  href='Servlet2?user=" + name + "'> Go to Second Servlet</a>");

	}

}
