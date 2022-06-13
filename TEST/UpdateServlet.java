package com.training.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Connection con=null;
		try
		{
			PrintWriter out=response.getWriter();
			out.print("RollNumber:<input type=\"text\" name=\"RollNumber\"/><br>\n"
					+ "TotalMark:<input type=\"text\" name=\"TotalMark\"/><br>\n"
					+ "Grade:<input type=\"text\" name=\"Grade\"/><br>\n"
					+ "<input type=\"submit\" value=\"save\" formaction=\"UpdateServlet\"/>");
			int totalmark=Integer.parseInt(request.getParameter("TotalMark"));
			String grade=request.getParameter("Grade");
			String srollnumber=request.getParameter("RollNumber");
			StudentDBConnection.update(con, totalmark, grade,srollnumber );
			System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println(e);
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
