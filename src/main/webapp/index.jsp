<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

     <form action="${ctx}/user/UserAction!toLogin.action"   method="post">
          用户名:<input type="text" name="username" id="username" value=""/>
          密码:<input type="password" name="user.password" id="password" value=""/>
          <input type="submit" value="登录">
      </form>


</body>
</html>