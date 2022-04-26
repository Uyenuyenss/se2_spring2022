<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2/19/2022
  Time: 8:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- import JSTL -->
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>

</head>
<body>
    <h2> Book List</h2>
<table border="=1">
    <thead>
    <tr>
        <th> Book ID</th>
        <th>Book Title</th>
        <th> Book Author</th>
        <th> Book Price</th>
    </thead>
    <tbody>
        <c:forEach var="book" items="${books}">
        <tr>
            <td> <c:out value="${book.id}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td> <c:out value="${book.author}"/></td>
            <td> <c:out value="${book.title}"/></td>
        <tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
