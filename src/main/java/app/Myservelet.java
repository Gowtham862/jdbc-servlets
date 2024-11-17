package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/url1")

public class Myservelet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		
		PrintWriter pw=res.getWriter();
		pw.println("welcome user");
		
		
		RequestDispatcher rd=req.getRequestDispatcher("url2");
		rd.include(req,res);
		//rd.forward(req, res);
		
	}
		
	}


