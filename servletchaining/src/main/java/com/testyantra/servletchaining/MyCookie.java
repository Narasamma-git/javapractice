package com.testyantra.servletchaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class MyCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
    



	public MyCookie() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("nm");
		
		Cookie ck=new Cookie("nm",name);
		ck.setMaxAge(500);
		response.addCookie(ck);
		PrintWriter out=response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<form action='ss'>");
		out.print("<h1>");
		out.print("<input type='submit' value='nextservlet'>");
		out.print("</form>");
		out.print("</body>");
		out.print("<html>");
	out.flush();
	out.close();
	}

}
