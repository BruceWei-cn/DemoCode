<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    <title>${name}</title>
  </head>
  <body>
  <%=basePath%>
  换个姿势，再来一次
  <img src="image/guidao.jpg">
  </body>
</html>