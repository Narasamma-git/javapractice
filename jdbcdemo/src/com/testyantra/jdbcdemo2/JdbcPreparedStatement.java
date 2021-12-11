package com.testyantra.jdbcdemo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPreparedStatement {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		String qry="insert into studentdb.student values(?,?,?,?)";
       PreparedStatement pstmt1=con.prepareStatement(qry);
       pstmt1.setInt(1, 6);
       pstmt1.setString(2,"Manthan");
       pstmt1.setString(3,"manthanbetageri");
       pstmt1.setString(4,"man13");
       
       PreparedStatement pstmt2=con.prepareStatement(qry);
       pstmt2.setInt(1, 7);
       pstmt2.setString(2,"Rakshith");
       pstmt2.setString(3,"rakshith17");
       pstmt2.setString(4,"rk17");

  //     int a =pstmt2.executeUpdate();
       
     //  String upqry="update studentdb.student set name='Rakshith',password='rk2020'";// it will upadte every record name and password
      // String upqry1="update studentdb.student set name='Aslam',username='aslamarab',password='aslam11' where id=?";
      // PreparedStatement pstmtup=con.prepareStatement(upqry1);
       //pstmtup.setInt(1, 7);
       //pstmtup.executeUpdate();     
       
 /*      
       String delqry="delete from studentdb.student where id=?";
       PreparedStatement pstmtdel=con.prepareStatement(delqry);
       pstmtdel.setInt(1, 1);
       pstmtdel.executeUpdate(); */

    String readall="Select * from studentdb.student";
    PreparedStatement pstmtsel=con.prepareStatement(readall);
    ResultSet rs1=pstmtsel.executeQuery();
    while(rs1.next()) {
    	int id=rs1.getInt(1);
    	String name=rs1.getString(2);
    	String username=rs1.getString(3);
    	String password=rs1.getString(4);
    	System.out.println(id+"  "+name+"  "+username+"  "+password);
    }
    System.out.println(" ");
    System.out.println(" ");
    String rdone="select * from studentdb.student where id=?";
    PreparedStatement pstmtrd1=con.prepareStatement(rdone);
    pstmtrd1.setInt(1, 2);
    ResultSet rsr=pstmtrd1.executeQuery();
    if(rsr.next()) {
    	int id=rsr.getInt(1);
    	String name=rsr.getString(2);
    	String username=rsr.getString(3);
    	String password=rsr.getString(4);
    	System.out.println(id+"  "+name+"  "+username+"  "+password);
    }
       
       
     pstmt1.close();
       pstmt2.close();
       con.close();
	}

}
