<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="a" method ="post">
</form>
<% int id=(Integer) request.getAttribute("id");
  String brand= (String)request.getAttribute("brand");
  int price=(Integer)request.getAttribute("price");
  int discount=(Integer)request.getAttribute("discount");
  response.getWriter().println(id);
  
   
   
   %>

</body>
</html>