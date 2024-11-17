package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/two")
public class Servletsave extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
//		String brand=req.getParameter("brand");
//		Double price=Double.parseDouble(req.getParameter("price"));
//		Double discount=Double.parseDouble(req.getParameter("discount"));
//		
//		
//		Product p=new Product(id,brand,price,discount);
//		Data d=new Data();
//		try {
//			int a= d.insert(p);
//			
//			res.getWriter().println(a);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Data d=new Data();
		try {
			int b=d.delete(id);
			res.getWriter().println(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
	}



