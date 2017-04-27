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
<title>User List</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/userDelegate?action=create">用户新增</a>
<table border="1" width="50%">
    <tr>
        <th>用户名</th>
        <th>真实姓名</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.username }</td>
            <td>${user.realname }</td>
            <td>
                <a href="${pageContext.request.contextPath}/userDelegate?action=update&username=${user.username}">更新</a>
                |
                <a href="${pageContext.request.contextPath}/userDelegate?action=delete&username=${user.username}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
