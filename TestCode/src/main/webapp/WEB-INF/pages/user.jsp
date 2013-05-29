<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>User</h1>
<table>
    <thead><tr><td>ID</td><td>Name</td></tr></thead>
    <tbody>
        <tr><td>${user.id}</td><td>${user.name}</td></tr>
    </tbody>
</table>
</body>
</html>