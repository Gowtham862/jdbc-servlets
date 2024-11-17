package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



class Data {

	Connection getconnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","root");
	}

	int insert(Product p) throws Exception {
		Connection con = getconnection();
		PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?,?)");
		ps.setInt(1, p.getid());
		ps.setString(2, p.getbrand());
		ps.setDouble(3, p.getprice());
		ps.setDouble(4, p.getdiscount());
		return ps.executeUpdate();
	}
	int delete(int id) throws Exception {
		Connection con = getconnection();
		PreparedStatement ps = con.prepareStatement("delete from product where id=?");
		ps.setInt(1, id);
		return ps.executeUpdate();
	}
	 Product fetch(int id) throws Exception {
			Connection con = getconnection();
			PreparedStatement ps = con.prepareStatement("select * from product where id=?");
			ps.setInt(1, id);
			ResultSet g = ps.executeQuery();
			Product p=null;
			while(g.next())
			{
				 p = new Product(g.getInt(1),g.getString(2),g.getDouble(3),g.getDouble(4));
			}
			return p;
	 }
	 Set<Product> fetchall() throws Exception{
			Connection con = getconnection();
			Statement ps = con.createStatement();
			String query="select * from product";
			ResultSet p = ps.executeQuery(query);
			Set<Product> set = new LinkedHashSet<>();
			while(p.next()) {
				Product p1 = new Product(p.getInt(1),p.getString(2),p.getDouble(3),p.getDouble(4));
				set.add(p1);
			}
		return set;
	 }
}

class Product{
	private int id;
	private String brand;
	private double price;
	private double discount;
	 Product(int id, String brand,double price,double discount) {
		 this.id=id;
		 this.brand=brand;
		 this.price=price;
		 this.discount=discount;
	}

	public int getid(){
		return id;
	}

	public String getbrand(){
		return brand;
	}
	public double getprice(){
		return price;
	}

	public double getdiscount(){
		return discount;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", brand=" + brand + ", price=" + price + ", discount=" + discount + "]";
	}

}

public class Product_servelet {
public static void main(String[] args) throws Exception {
		
//		Data d = new Data();
//		Product p1=new Product(1,"puma", 99.0, 90.0);
//		Product p2=new Product(2,"gowtham",80.0,67.0);
//        Product p3=new  Product(3,"kishore",76.0,87.0);
//        int a=d.insert(p1);
//        a=a+d.insert(p2);
//        a=a+d.insert(p3);
//        System.out.println(a+" rows inserted");
//        System.out.println("---------------------");
//		int b=d.delete(2);
//		System.out.println(b+" rows deleted");
//		Product p= d.fetch(p1.getid());
//		System.out.println(p);
//		Set<Product> list= d.fetchall();
//		Iterator<Product> it=list.iterator();
//			while(it.hasNext())
//			{
//			System.out.println(it.next());	
//			}
//			System.out.println("Data Fetched ");
	}


}
