package com.training.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDBConnection {
	public   final static String DB_Driver="org.postgresql.Driver";
	public static String  DB_URL="jdbc:postgresql://localhost:5432/vastpro";
	public static String DB_USER="postgres";
	public static String DB_PASSWORD="postgres";
	public static String Insert="insert into  taskstudent (id,RollNumber,Name,Age,TotalMark,Grade)values(?,?,?,?,?,?);";
	public static String Update="update into taskstudent set TotalMark=?,Grade=? where RollNumber=?;";
	public static String Delete="delete from taskstudent where RollNumber=?;";
	public static String Select="select * from taskstudent;";
	static PreparedStatement ps=null;
	public static  Connection getConnection() throws SQLException
	{
		try
		{
			Class.forName(DB_Driver);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		Connection connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		return connection;
	}
	public static  void insertrow(Connection con,int Id, String RollNumber,String Name,int Age, int TotalMark,String Grade) throws SQLException 
	{
		ps=con.prepareStatement(Insert);
		ps.setInt(1,Id);
		ps.setString(2, RollNumber);
		ps.setString(3,Name);
		ps.setInt(4, Age);
		ps.setInt(5, TotalMark);
		ps.setString(6, Grade);
		ps.executeUpdate();
		ps.close();
	}
	public static void update(Connection con,int TotalMark,String Grade,String RollNumber) throws SQLException
	{
		ps=con.prepareStatement(Update);
		ps.setInt(1,TotalMark);
		ps.setString(2,Grade);
		ps.setString(3, RollNumber);
		ps.executeUpdate();
		ps.close();
	}
	public static void delete(Connection con,String RollNumber) throws SQLException
	{
		ps=con.prepareStatement(Delete);
		ps.setString(1, RollNumber);
		ps.executeUpdate();
		ps.close();
	}
	public static void select(Connection con) throws SQLException 
	{
		ps=con.prepareStatement(Select);
		ResultSet rs=null;
		rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println("Id: "+rs.getInt("Id"));
			System.out.println("RollNumber: "+rs.getString("RollNumber"));
			System.out.println("Name: "+rs.getInt("Name"));
			System.out.println("Age: "+rs.getInt("Age"));
			System.out.println("TotalMark: "+rs.getInt("TotalMark"));
			System.out.println("Grade: "+rs.getString("Grade"));
		}
		
	}
}
