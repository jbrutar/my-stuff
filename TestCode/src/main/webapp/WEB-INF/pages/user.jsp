<%@ include file="include.jsp" %>
<html>
<body>
<h1>User</h1>
<table>
    <thead><tr><td>ID</td><td>Name</td></tr></thead>
    <tbody>
        <tr><td>${user.id}</td><td>${user.name}</td></tr>
    </tbody>
</table>
<form:form method="post" action="/user/${user.id}/update" commandName="user">
    <table>
    	<tr>
    		<td><form:hidden /></td>
    	</tr>
    	<tr>
        	<td>Username : </td>
  			<td><form:input path="name" /></td>
  			<td><form:errors path="name" /></td>
 		</tr>
     	<tr>
        	<td colspan="3">
            <input type="submit" value="Update"/>
        	</td>
    	</tr>
	</table> 
</form:form>
</body>
</html>