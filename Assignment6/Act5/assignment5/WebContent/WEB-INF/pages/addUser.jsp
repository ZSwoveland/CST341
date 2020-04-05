<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<body>

	<form:form method="POST" action="adduser" modelAttribute ="user">
	<table>
          <tr>
			<td><form:label path="firstName">First Name</form:label></td>
			<td><from:errors path="firstName" cssClass ="error"></from:errors></td>
			<td><form:input path="firstName"></form:input></td>
			<td><form:label path="lastName">Last Name</form:label></td>
			<td><from:errors path="lastName" cssClass ="error"></from:errors></td>
			<td><form:input path="lastName"></form:input></td>
			<td><form:radiobutton path="gender" value="1">Male</form:radiobutton></td>
			<td><form:radiobutton path="gender" value="2">Female</form:radiobutton></td>
		<td><input type="submit" value="Submit"/></td>
		</tr>
	</table>
	
	
	</form:form>
	
</body>
