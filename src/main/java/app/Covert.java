package app;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/sd")
public class Covert extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name =req.getParameter("name");
		String pass=req.getParameter("pass");
		
		req.setAttribute("username",name);
		req.setAttribute("userpassword",pass);
		
		req.getRequestDispatcher("sd2").forward(req,res);
		
		
	}
	

}
