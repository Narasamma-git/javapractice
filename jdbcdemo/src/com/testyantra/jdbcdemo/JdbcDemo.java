package com.testyantra.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		String username="root";
		String password="root";
//		String qry1="insert into studentdb.student values(4,'narasamma','narsu14','nb14')";
//		String qry2="insert into studentdb.student values(5,'nayana','nayanab','nb142214')";
//		String qry3="insert into studentdb.student values(6,'sujatha','sujathab','sujatha22')";
		String qry4="delete from studentdb.student where id='6'";
		String updt="update studentdb.student set username='nayanabasavaraj',password='nayanab14' where id=5";
		String read="select * from studentdb.student";
		String readById="select * from studentdb.student where id='5'";
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306",username,password);
	Statement stmt=con.createStatement();
	//stmt.executeUpdate(qry1);
	//stmt.executeUpdate(qry2);
	//stmt.executeUpdate(qry3);
	//stmt.execute(qry4);
	int a=stmt.executeUpdate(updt);
	System.out.println(a+" rows affected");

	ResultSet rs2=stmt.executeQuery(readById);
	if(rs2.next()) {
		int id=rs2.getInt(1);
		String name1=rs2.getString(2);
		String uname2=rs2.getString(3);
		String pwd2=rs2.getString(4);
		System.out.println(id+"  "+name1+"   "+uname2+"  "+pwd2+"   ");
	}
	ResultSet rs=stmt.executeQuery(read);
	
while(rs.next()) {
		int id=rs.getInt(1);
		String name=rs.getString(2);
		String uname=rs.getString(3);
		String pwd=rs.getString(4);
		System.out.println(id+"  "+name+"  "+uname+"  "+pwd);
	}
	stmt.close();
	con.close();
	
String qry="{call student.getstudent(?)}";
java.sql.CallableStatement cstmt=con.prepareCall(qry);
cstmt.setInt(1, 4);

	}

}
