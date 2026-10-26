<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Counter</title>
</head>
<body>
<h1><%= "Counter Servlet" %></h1>
<a href="CounterServlet?inc=1">CounterServlet GET increment by 1</a>
<br>
<a href="CounterServlet?dec=1">CounterServlet GET decrement by 1</a>
<br>
<form action="CounterServlet" method="POST">
    <br>inc: <input type="text" name="inc" value="1">
    <br>dec: <input type="text" name="dec" value="0">
    <br>
    <input type="submit" value="CounterServlet POST with value">
    <input type="submit" formmethod="GET" value="CounterServlet GET with value">
</form>
</body>
</html>