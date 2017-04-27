<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: h3ilang
  Date: 2017/4/18
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reguster</title>
</head>
<body>
<form method="post">
    username:<input type="text" name="username" value="${user.username}">
    password:<input type="password" name="username">
    city:<select>
    <c:forEach items="${cityList }" var="city">
        <option>${city}</option>
    </c:forEach>
</select>
    <input type="submit" value="注册"/>
    <input type="submit" name="_cancel" value="取消"/>
</form>
</body>
</html>
