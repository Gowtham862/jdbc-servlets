package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;
@WebServlet("/home")
public class Home extends HttpServlet {
	protected void doget(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession s1=req.getSession();
		String email=(String)s1.getAttribute("mail");
		if(email!=null)
		{
		     req.getRequestDispatcher("FormFile.html").forward(req, resp);	
		}
		else
		{
			 req.getRequestDispatcher("login.html").forward(req, resp);
		}
	}

}
