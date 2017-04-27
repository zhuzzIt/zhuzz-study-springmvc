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
<title>WorkInfo</title>
</head>
<body>
<form method="post">
    所在城市：<select name="workInfo.city">
    <c:forEach items="${cityList }" var="city">
        <option value="${city }"
                <c:if test="${user.workInfo.city eq city}">selected="selected"</c:if>
        >
                ${city}
        </option>
    </c:forEach>
</select>
    职位：<input type="text" name="workInfo.job" value="${user.workInfo.job}"/>
    工作年限：<input type="text" name="workInfo.year" value="${user.workInfo.year}"/>
    <input type="submit" name="_target1" value="上一步"/>
    <input type="submit" name="_finish" value="完成"/>
    <input type="submit" name="_cancel" value="取消"/>
</form>
</body>
</html>
