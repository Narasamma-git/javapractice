package com.testyantra.batchupdatewithstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class BatchUpdateStatement {

	public static void main(String[] args) throws Exception{
		//step1 Load and register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step2 Establish connection between java application and DB
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		//step3 create a statemet 
		String qry1="insert into  studentdb.student values(11,'Monika','monikamoni','mmnn')";
		String qry2="update  studentdb.student set name='keerthiSuresh' where id='3'";
		String qry3="delete from   studentdb.student where id='5'";
		
		Statement stmt=con.createStatement();
		//step4 execute the query
		stmt.addBatch(qry1);
		stmt.addBatch(qry2);
		stmt.addBatch(qry3);
	int[] i=	stmt.executeBatch();
	for(int j=0;j<i.length;j++) {
		System.out.println(i[j]);
	}
		

	}

}
