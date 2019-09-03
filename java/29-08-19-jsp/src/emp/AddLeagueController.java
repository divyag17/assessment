package emp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/AddLeagueController", "/add_league.do" })
public class AddLeagueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private List<String> errMsgs;   
	    
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
			errMsgs=new LinkedList<String>();
			String season,title=null;
			season=request.getParameter("season");
			System.out.println(season);
		if(season.equals("unknown"))
			{
				errMsgs.add("please select a valid season.");
		}
			
			
			
			
			title=request.getParameter("title");
			if(title.toString().length()<5)
			{
				errMsgs.add("title is too short.");
			}
			
			if(errMsgs.isEmpty())
			{	request.setAttribute("SUCCESS",null);
				RequestDispatcher  view=request.getRequestDispatcher("addjsp.jsp");
				view.forward(request, response);
			}
			else {
				request.setAttribute("ERROR", errMsgs);
				RequestDispatcher view=request.getRequestDispatcher("addjsp.jsp");
				view.forward(request, response);
			}
			
		}



}
