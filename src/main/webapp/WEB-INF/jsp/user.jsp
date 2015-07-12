<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring 3 MVC Series - Contact Manager | viralpatel.net</title>
</head>
<body>
 
<h2>Contact Manager</h2>
 
<form:form method="post" action="add.html" commandName="user">
 
    <table>
    <tr>
        <td> FIRSTNAME</td>
        <td><form:input path="id" /></td> 
    </tr>
    <tr>
        <td> LASTNAME</td>
        <td><form:input path="nickame" /></td>
    </tr>
    <tr>
        <td> Email</td>
        <td><form:input path="lastname" /></td>
    </tr>
    <tr>
        <td> telephone</td>
        <td><form:input path="telephone" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Contact"/>
        </td>
    </tr>
</table>  
</form:form>
 
     
<h3>user</h3>
<c:if  test="${!empty usersList}">
<table class="data">
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Telephone</th>
    <th>&amp;nbsp;</th>
</tr>
<c:forEach items="${usersList}" var="user">
    <tr>
        <td>${user.lastname}, ${user.nickame} </td>
        <td>${user.email}</td>
        <td>${user.telephone}</td>
        <td><a href="delete/${user.id}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>