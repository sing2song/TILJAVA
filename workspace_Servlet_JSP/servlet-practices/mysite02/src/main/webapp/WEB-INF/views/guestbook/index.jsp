<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.saltlux.mysite.vo.Guestbook02Vo"%>
<%@page import="com.saltlux.mysite.dao.Guestbook02Dao"%>
<%@page import="java.util.List"%>
<%
List<Guestbook02Vo> list = new Guestbook02Dao().findAll();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="<%=request.getContextPath()%>/assets/css/guestbook.css"
	rel="stylesheet" type="text/css">

</head>
<body>

	<div id="container">
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		<div id="wrapper">
			<div id="content">
				<div id="site-introduction">
					<form
						action="<%=request.getContextPath()%>/GuestbookServlet?a=add"
						method="post">
						<table border=1 width=500>
							<tr>
								<td>이름</td>
								<td><input type="text" name="name" value=""></td>
								<td>비밀번호</td>
								<td><input type="password" name="password" value=""></td>
							</tr>
							<tr>
								<td colspan=4><textarea name="contents" cols=60 rows=5></textarea></td>
							</tr>
							<tr>
								<td colspan=4 align=right><input type="submit" VALUE="확인"></td>
							</tr>
						</table>
					</form>
					<%
					for (Guestbook02Vo vo : list) {
					%>
					<br>
					<table width=510 border=1>
						<tr>
							<td>[<%=vo.getNo()%>]
							</td>
							<td><%=vo.getName()%></td>
							<td><%=vo.getReg_date()%></td>
							<td><a
								href="<%=request.getContextPath()%>/GuestbookServlet?a=deleteform&no=<%=vo.getNo()%>">삭제</a></td>
						</tr>
						<tr>
							<td colspan=4><pre><%=vo.getContents()%></pre></td>
						</tr>
					</table>
					<%
					}
					%>
				</div>
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp" />
		<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
	</div>


</body>
</html>