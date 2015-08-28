<%-- 
    Document   : index
    Created on : Aug 24, 2015, 6:42:00 PM
    Author     : Anuz
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
        <h1>Available Course</h1>
        </div>
        
        <table class="table tab-content">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
            <tr>
                
                <c:forEach var="course" items="${courses}">
                <td>${course.id}</td>
                <td>${course.name}</td>
                <td>${course.price}</td>
               <td>${course.status}</td>
                <td>Action</td>
                </c:forEach>
            </tr>
        </table>
    </body>
</html>
