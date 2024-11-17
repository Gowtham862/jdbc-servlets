package app;
import java.sql.*;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/gow")
public class Form extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("pid"));
		String brand=req.getParameter("brand");
		Double price=Double.parseDouble(req.getParameter("price"));
		Double discount=Double.parseDouble(req.getParameter("discount"));
		
		
		
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");
			PreparedStatement pst=c.prepareCall("insert into product values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, brand);
			pst.setDouble(3, price);
			pst.setDouble(4, discount);
			int a=pst.executeUpdate();
			res.getWriter().print("one row has been inserted"+a);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
