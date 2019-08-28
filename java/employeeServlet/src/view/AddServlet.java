package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.MyConnectionFactory;

/**
 * Servlet implementation class AddServlet
 */

@WebServlet(
		urlPatterns = { "/add.view" }, 
		initParams = { 
				@WebInitParam(name = "country-list", value = "india,usa,uk,dubai")
		})
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
out.println("<html><body>");
		
		@SuppressWarnings("unchecked")
		List<String> err=(List<String>) request.getAttribute("ERROR");
		if(err!=null)
		{
			for(String s:err)
			{
				out.println("<font color='red'>"+s+"</font><br/>");
			}
		}
		
		out.println("<form action='addemployee.do' method='post'>");
		out.println("name<input type='text' name='name'><br/>");
		out.println("password<input type='password' name='password'><br/>");
		out.println("email<input type='email' name='email'><br/>");
		String sList=getServletConfig().getInitParameter("country-list");
		String arrSList[]=sList.split(",");
		out.println("<select name='country'><option value='Unknown'>Unknown</option>");
		for(String str:arrSList)
		{
			out.println("<option value='"+str+"'"+">"+str+"</option>");
		}
		
		out.println("</select><br/><input type='submit' value='add employee'></form></body></html>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}


}
