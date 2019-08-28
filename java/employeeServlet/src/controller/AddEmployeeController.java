package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.MyConnectionFactory;
import model.employee;

/**
 * Servlet implementation class AddEmployeeController
 */
@WebServlet({ "/AddEmployeeController", "/addemployee.do" })
public class AddEmployeeController extends HttpServlet {
	private static int  serialVersionUID = 1;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
			request.setAttribute("SUCCESS", new employee(name,password,email,country));
			Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
			PreparedStatement pst=connection.prepareStatement("insert into empservlet(name,password,email,country,uid) values(?,?,?,?,?)");
			pst.setInt(5, employee.serialVersionUID++);
			pst.setString(1,name);
			pst.setString(2, password);
			pst.setString(3, email);
			pst.setString(4, country);
			pst.executeUpdate();
			RequestDispatcher  view=request.getRequestDispatcher("data.view");
			view.forward(request, response);
		
		
	}


}
