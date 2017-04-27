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
<title>SchoolInfo</title>
</head>
<body>
<form method="post">
    学校类型：<select name="schoolInfo.schoolType">
    <c:forEach items="${schoolTypeList }" var="schoolType">
        <option value="${schoolType }"
                <c:if test="${user.schoolInfo.schoolType eq schoolType}">
                    selected="selected"
                </c:if>
        >
                ${schoolType}
        </option>
    </c:forEach>
</select>
    学校名称：<input type="text" name="schoolInfo.schoolName" value="${user.schoolInfo.schoolName}"/>
    专业：<input type="text" name="schoolInfo.specialty" value="${user.schoolInfo.specialty}"/>
    <input type="submit" name="_target0" value="上一步"/>
    <input type="submit" name="_target2" value="下一步"/>
</form>
</body>
</html>
