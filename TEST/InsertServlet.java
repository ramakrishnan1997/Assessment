package com.training.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection con =null;
		try
		{
			con=StudentDBConnection.getConnection();
		}
		catch(SQLException e) 
		{
			System.out.println(e);
		}
		try {
			
			PrintWriter out=response.getWriter();
			int id=Integer.parseInt(request.getParameter("Id"));
			String srollnumber=request.getParameter("RollNumber");
			String sname=request.getParameter("Name");
			int age=Integer.parseInt(request.getParameter("Age"));
			int totalmark=Integer.parseInt(request.getParameter("TotalMark"));
			String grade=request.getParameter("Grade");
			StudentDBConnection.insertrow(con, id, srollnumber, sname, age, totalmark, grade);
			System.out.println("success");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
