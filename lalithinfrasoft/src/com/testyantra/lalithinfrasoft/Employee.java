package com.testyantra.lalithinfrasoft;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private String job;
	private String salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", salary=" + salary + "]";
	}
	
	
	
	
	
	/*
	 * public void readData() { try (Scanner input=new Scanner(new
	 * File("F:\\lalith.txt"))){ while(input.hasNextLine()) { name=""; String line;
	 * line=input.nextLine();
	 * 
	 * //now process the line of the text for each data item try(Scanner data=new
	 * Scanner(line)){ while(!data.hasNext()) { name=data.next(); }
	 * name=name.trim(); //get job if(data.hasNextInt()) { job=data.next(); } //get
	 * salary if(data.hasNextInt()) { salary=data.next(); } }
	 * 
	 * saveData(); }
	 * 
	 * 
	 * } catch(IOException e) { System.out.println(e); } }
	 * 
	 * 
	 * 
	 * private void saveData() { try(Connection con=connect(); PreparedStatement
	 * pstmt=con.prepareStatement("insert into employee_db.employee values(?,?,?)"))
	 * { pstmt.setString(1,name); pstmt.setString(2, job);
	 * pstmt.setString(3,salary); pstmt.executeUpdate();
	 * 
	 * 
	 * }
	 * 
	 * catch(SQLException e) { System.out.println(e); } }
	 * 
	 * private Connection connect() { try { Class.forName("com.mysql.jdbc.Driver");
	 * return
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root",
	 * "root"); } catch(SQLException | ClassNotFoundException e) {
	 * 
	 * System.out.println(e); return null; } }
	 */








}