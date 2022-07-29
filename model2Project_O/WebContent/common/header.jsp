<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String sessionId = (String) session.getAttribute("sessionId");
String admin = (String) session.getAttribute("admin");
String user = (String) session.getAttribute("user");
%>
<div class="header">
	<div class="inner-header">
		<div class="nav">
			<div class="top-nav">
				<h1>WEB PROJECT 2022</h1>
			</div>
			<div class="bottom-nav">
				<div class="gnb">
					<ul>
						<li><a href="index.do">HOME</a></li>
						<li><a href="boardListView.bo">게시글목록보기</a></li>
					<%if(sessionId==null){%>
						<li><a href="joinView.do">회원가입</a></li>
						<li><a href="loginView.do">로그인</a></li>
					<%}else{%>
						<li><a href="updateView.do">회원수정</a></li>						
						<li><a href="logoutOk.do">로그아웃</a></li>
						<li><span class="se"><%=sessionId %> 님</span> </li>
						<%if(admin!=null){%>
						<!-- if(sessionId.equals("admin")){%> -->
						<li><span class="se"><%=admin %> 권한</span> </li>
						<%}else{%>
						<li><span class="se"><%=user %> 권한</span> </li>
							
						<%}%>
						<%
					}
						%>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>