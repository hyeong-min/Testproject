<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%! 
    String name, id, pw;
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
name = (String)session.getAttribute("name");
id = (String)session.getAttribute("id");
pw = (String)session.getAttribute("pw");


%>
<%= name %> �� Ż��Ǽ̽��ϴ�.<br/>
<a href="login.html"> Ȩȭ������</a>

</body>
</html>