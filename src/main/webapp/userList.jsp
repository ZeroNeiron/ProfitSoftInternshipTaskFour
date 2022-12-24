<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<html>
<link href="style/table.css" rel="stylesheet" type="text/css">
<body>
<div>
    <table>
        <thead>
        <td>Name</td>
        <td>Login</td>
        </thead>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.name}</td>
                <td>${user.login}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<div>
    <form action="/logout" method="post">
        <div>
            <input type="submit" name="logout" value="Logout"/>
        </div>
    </form>
</div>
</body>
</html>
