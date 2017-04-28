<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: h3ilang
  Date: 2017/4/28
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form commandName="dataBinderTest">
    <form:errors path="*" cssStyle="color:red"></form:errors>
    bool:<form:input path="bool"/>
    phoneNumber:<form:input path="phoneNumber"/>
    date:<form:input path="date"/>
    <input type="submit" value="提交"/>
</form:form>
</body>
</html>
