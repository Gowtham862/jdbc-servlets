package app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Jspclass extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("pid"));
		String brand=req.getParameter("brand");
		int price=Integer.parseInt(req.getParameter("price"));
		int discount=Integer.parseInt(req.getParameter("discount"));
		req.setAttribute("id",id);
		req.setAttribute("brand",brand);
		req.setAttribute("price", price);
		req.setAttribute("discount", discount);
		req.getRequestDispatcher("a");
		
	}

}
