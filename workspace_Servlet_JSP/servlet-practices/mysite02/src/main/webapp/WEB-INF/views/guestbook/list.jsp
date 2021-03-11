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
<link href="<%=request.getContextPath()%>/assets/css/guestbook.css"
	rel="stylesheet" type="text/css">

</head>
<body>

	<div id="container">
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		<div id="wrapper">
			<div id="content">
				<div id="site-introduction">					
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
								href="<%=request.getContextPath()%>/guestbook?a=deleteform&no=<%=vo.getNo()%>">삭제</a></td>
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