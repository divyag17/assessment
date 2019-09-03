package emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;


/**
 * Servlet implementation class check
 */
@WebServlet({ "/check", "/check.do" })
public class check extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public check() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubetContextPath());
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private MyConnectionFactory MyConnectionFactory=null;
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
		PrintWriter out = response.getWriter();
		Statement pst=(Statement) connection.createStatement();
		ResultSet rs= ((java.sql.Statement) pst).executeQuery("select username,password from login");
		
		
		
		while(rs.next())
		{
			if(rs.getString(1)==request.getParameter("user") && rs.getString(2)== request.getParameter("pass"))
			{String s="SUCCESS";
				request.setAttribute("SUCCESS", s);
			}
			else
			{
				String e="ERROR";
				request.setAttribute("ERROR", e);
			}
		}
	}

}
