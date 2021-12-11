package com.testyantra.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
//@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyFirstServlet() {
        super();
       
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	String sid=request.getParameter("id");
	int id=Integer.parseInt(sid);
	String name=request.getParameter("nm");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.println("<html><body>"+"<h1>welcome "+name+" "+password+"</h1>"+"</body></html>");
      out.close();
      
      Connection con=null;
      PreparedStatement pstmt=null;
      String qry="insert into studentdb.student values(?,?,?,?)";
      try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
      try {

      con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
      pstmt=con.prepareStatement(qry);
      pstmt.setInt(1, id);
      pstmt.setString(2, name);
      pstmt.setString(3, username);
      pstmt.setString(4,password);
      int a=pstmt.executeUpdate();
      
      }
      catch(SQLException e) {
    	  e.printStackTrace();
      }
      
      finally {
    	  if(pstmt!=null) {
    		  try {
    			  pstmt.close();
    		  }
    		  catch(SQLException e) {
    			  e.printStackTrace();
    			  }
    	  }
    	  if(con!=null) {
    		  try {
    			  con.clearWarnings();
    		  }
    		  catch(SQLException e) {
    			  e.printStackTrace();
    		  }
    	  }
      }
      
	
	}

}
