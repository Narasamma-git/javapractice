package com.testyantra.batchpreparedstatemt;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class BatchUpdatePreaparedStatement {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
		String qry1="insert into student values(15,'Rashmika','rashmis','rs11')";
		String qry2="update studentdb.student set username='keerthireddy', password='keerthir55' where id=3 ";
String qry3="delete from studentdb.student where id='4'";

PreparedStatement pstmt1=con.prepareStatement(qry1);
pstmt1.addBatch();
pstmt1.executeBatch();

PreparedStatement pstmt2=con.prepareStatement(qry2);
pstmt2.addBatch();
pstmt2.executeBatch();

PreparedStatement pstmt3=con.prepareStatement(qry3);
pstmt3.addBatch();
pstmt3.executeBatch();
	}

}
