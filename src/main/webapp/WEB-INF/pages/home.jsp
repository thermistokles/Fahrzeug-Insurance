<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
   
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>users Management Screen</title>
</head>
<body>
    <div align="center">
        <h1>users List</h1>
        <h3>
            <a href="newUser">New User</a>
        </h3>
        <table border="1">
 
            <th>Name</th>
            <th>Email</th>
            <th>Date of birth</th>
            <th>Contact</th>
            <th>Address</th>
            <th>Password</th>
            <th>Action</th>
 
            <c:forEach var="users" items="${listUsers}">
                <tr>
 
                    <td>${users.name}</td>
                    <td>${users.email}</td>
                    <td>${users.dob}</td>
                    <td>${users.contact_no}</td>
                    <td>${users.address}</td>
                    <td>${users.password}</td>
                    <td><a href="editusers?id=${users.id}">Edit</a>
                             <a
                        href="deleteusers?id=${users.id}">Delete</a></td>
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>