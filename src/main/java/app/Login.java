package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Login")
public class Login extends HttpServlet
{
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   String mail=req.getParameter("email");
	   String pass=req.getParameter("pass");
	    
	   if(mail.equals("gow@gmail.com") &&pass.equals("123"))
	   {
		   HttpSession s=req.getSession();
		   s.setAttribute("email",mail);
		   req.getRequestDispatcher("FormFile.html").forward(req, resp);
	   }
		   else
		   {
			   req.getRequestDispatcher("login.html").forward(req, resp);

		   }
	   }
	
}

