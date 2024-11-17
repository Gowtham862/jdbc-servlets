package app;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/tt")
public class Fetchall extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Data d= new Data();
		
		try {
			Set<Product> list = d.fetchall();
			Iterator<Product> it=list.iterator();
			while(it.hasNext())
			{
				res.getWriter().println(it.next());	
			}
			res.getWriter().println("sd");
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
