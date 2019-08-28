package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.MyConnectionFactory;

/**
 * Servlet implementation class editServlet
 */
@WebServlet(
		urlPatterns = {"/edit.view" }, 
		initParams = { 
				@WebInitParam(name = "country-list", value = "india,usa,uk,dubai")
		})
public class editServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editServlet() {
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
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		response.setContentType("text/html");
		Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
		PreparedStatement pst=connection.prepareStatement("select name,password,email,country from empservlet where id=(?)");
		pst.setInt(1,id);
		ResultSet rs= pst.executeQuery();
		//pst.executeUpdate();
	
		out.println("<html><body>");
		while(rs.next())
		{
		out.println("<form action=\"edit.do?id="+id+"\" method='post'>");
		out.println("name<input type='text' name='name' value='"+ rs.getString("name")+"'><br/> ");
		out.println("password<input type='password' name='password' value='"+rs.getString("password")+"'><br/>");
		out.println("email<input type='email' name='email' value='"+rs.getString("email")+"'><br/>");
		String sList=getServletConfig().getInitParameter("country-list");
		String arrSList[]=sList.split(",");
		
		out.println("<select name='country'><option value='"+rs.getString("country")+"'>"+rs.getString("country")+"</option>");
		for(String str:arrSList)
		{
			out.println("<option value='"+str+"'"+">"+str+"</option>");
		}
		
		out.println("</select><br/><input type='submit' value='edit employee'></form></body></html>");
		}
		
	
	}
}
