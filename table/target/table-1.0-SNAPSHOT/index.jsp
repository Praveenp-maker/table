<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="hi" method="get">
  <input type="submit"  name="VIEW EMPLOYEES">
</form>
<center>
    <h1>Books Management</h1>
    <h2>
        <a href="/add.jsp">Add new book</a>
        &nbsp;&nbsp;&nbsp;
        <a href="/delete.jsp">Delete a book</a>
        &nbsp;&nbsp;&nbsp;
         <a href="/update.jsp">update</a>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Books</h2></caption>
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Operations</th>
          
        </tr>
        <c:forEach var="book" items="${listBook}">
            <tr>
                <td><c:out value="${book.id}" /></td>
                <td><c:out value="${book.title}" /></td>
                <td><c:out value="${book.author}" /></td>
                <td><c:out value="${book.price}" /></td>
                <td><c:out value="${book.qty}" /></td>
                 <td>
                    <a href="/edit?id=<c:out value='${book.id}' />">Edit</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="/poo?id=<c:out value='${book.id}' />">Delete</a>                     
                </td> 
            </tr>
        </c:forEach>
    </table>
</div>   

</body>
</html>
