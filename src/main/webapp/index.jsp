<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<html>
<link href="style/style.css" rel="stylesheet" type="text/css">
<body>
<div class="login-form">
    <form method="post" action="${pageContext.request.contextPath}/login">
        <h2  class="text-center">Sign in</h2>
        <div class="form-group">
            <input class="item" type="text" name="login" id="username" placeholder="Login" required>
        </div>
        <div class="form-group">
            <input class="item" type="password" name="password" id="password" placeholder="Password" required>
        </div>
        <div class="form-group">
            <button class="login" type="submit">Login</button>
        </div>
    </form>
</div>
<div class="text-center">
    <c:if test="${incorrect}">
        Bad login or password
    </c:if>
</div>
</body>
</html>
