<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link href="style/style.css" rel="stylesheet" type="text/css">
<body>

<div class="login-form">
    <h1>Hello, ${name}<br></h1>
<form action="/logout" method="post">
    <div class="form-group">
        <a href="/users">
            <input class="item" type="button" formaction="/users" name="users" value="Users">
        </a>
    </div>
    <div class="form-group">
        <input class="item" type="submit" name="logout" value="Logout">
    </div>
</form>
</div>
</body>
</html>
