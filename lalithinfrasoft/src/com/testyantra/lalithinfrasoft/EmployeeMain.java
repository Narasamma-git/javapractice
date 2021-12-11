package com.testyantra.lalithinfrasoft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args)  throws Exception{
		Connection con=null;
		PreparedStatement pstmt;
		File file=null;
		FileReader fr=null;
		BufferedReader br=null;
		String qry="insert into employee_db.employee values(?,?,?,?)";
		try {
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","root");
    //  con.setAutoCommit(false);

		 file=new File("F:\\lalith.txt");
		Employee emp=new Employee();
		pstmt=con.prepareStatement(qry);
		 fr=new FileReader(file);
		 br=new BufferedReader(fr);
		String line;
		String[] data=null;
		
		while((line=br.readLine())!=null) {
			data=line.split(",");
			int id=Integer.parseInt(data[0]);
			emp.setId(id);
			emp.setName(data[1]);
			emp.setJob(data[2]);
			emp.setSalary(data[3]);
			
			pstmt.setInt(1,emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3,emp.getJob());
			pstmt.setString(4,emp.getSalary());
			
			
			pstmt.executeUpdate();
		  // con.commit();
			System.out.println(emp); 
		}
		}
		catch(Exception e) {
		//	con.rollback();
			
		}
			
		}		
		
	}


