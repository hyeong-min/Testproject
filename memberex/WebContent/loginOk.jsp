<%@page import="com.javalec.daodto.MemberDto"%>
<%@page import="com.javalec.daodto.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("EUC-KR");

String id = request.getParameter("id");
String pw = request.getParameter("pw");

MemberDao dao = MemberDao.getInstance();
int checkNum = dao.userCheck(id, pw);
if(checkNum == -1) {
%>
<!--@ histroy.go()
이전 또는 이후 페이지의 이동이 가능합니다. 
사용방법은 전달할 인자에 숫자를 넣어 이동하게 됩니다. 1 또는 -1 등을 사용하여 이전 또는 이후로 이동할 수 있습니다.  
-->
<script language="javascript">
alert("아이디가 존재하지않습니다.");
history.go(-1);


</script>
<%
} else if (checkNum ==0) {
%>
<script language="javascript">
alert("비밀번호가 틀립니다.");
history.go(-1);
</script>
<%
} else if(checkNum == 1){
	MemberDto dto = dao.getMember(id);
	if(dto == null){
	
%>
<script language="javascript">
alert("존재하지않는회원");
history.go(-1);
</script>
<%
	} else {
		String name = dto.getName();
		session.setAttribute("id", id);
		session.setAttribute("name", name);
		session.setAttribute("ValidMem", "yes");
		response.sendRedirect("main.jsp");
	}
}
%>




















<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>