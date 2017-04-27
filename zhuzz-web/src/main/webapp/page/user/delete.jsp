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
<title>User delete</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/delete" method="post">
    用户名： <input type="text" name="username" value="${command.username}"/>
    真实姓名：<input type="text" name="realname" value="${command.realname}"/>
    <input type="submit" value="更新"/>
</form>
</body>
</html>
