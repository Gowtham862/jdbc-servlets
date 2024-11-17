package app;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/sd2")
public class Covert_two  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=(String)req.getAttribute("username");
		String pass=(String)req.getAttribute("userpassword");
		
		
		res.getWriter().println("name is:"+name+"password :"+pass);
		
	}

}
