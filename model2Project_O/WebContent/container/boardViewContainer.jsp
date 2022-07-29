<%@page import="org.model2.dto.Board1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Board1 boardView =(Board1)request.getAttribute("boardView");
String sessionId2 = (String) session.getAttribute("sessionId");
String admin2 = (String) session.getAttribute("admin");
%>
<div class="container">
	<div class="inner-container">
		<div class="boardView">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<div class="boardView-con">
						<div class="boardView-form">
						<h1 class="title2">글 상세보기</h1>
						<form action="boardUpdateOk.do"method="POST" id="boardUpdateOkForm">
							<ul>
								<li>
									<label for="no">글번호</label>
									<input type="hidden" name="no" id="no" value="<%=boardView.getNo() %>"/>
									<span><%=boardView.getNo() %></span>
								</li>
								<li>
									<label for="userId">작성자</label>
									<input type="hidden" name="userId" id="userId" value="<%=boardView.getUserId() %>"/>
									<span><%=boardView.getUserId() %></span>
								</li>
								<li>
									<label for="userPw">글 비밀번호</label>
									<input type="hidden" name="userPw" id="userPw" value="<%=boardView.getUserPw() %>"/>
									<span><%=boardView.getUserPw() %></span>
								</li>
								<li>
									<label for="title">글제목</label>
									<input type="text" name="title" value="<%=boardView.getTitle() %>" />
								</li>
								<li>
									<label for="content">글내용</label>
									<textarea rows="20" cols="30">
										<%=boardView.getContent() %>
									</textarea>
								</li>
								<li>
									<%-- <%if(session.getAttribute("sessionId")==null){%> 이렇게 바로 넣어도 됨 --%>
									<%if(sessionId2==null){%>
									<a href="index.do" class="l1">HOME</a>
									<a href="boardListView.bo" class="l1">글 목록</a>
									<a href="loginView.do" class="l1">로그인</a>
									<%}else{ %>
									<a href="index.do" class="l1">HOME</a>
									<a href="boardListView.bo" class="l1">글 목록</a>
										<%if(admin2!=null){%>
									<input type="button" value="글수정" id="boardUpdateOkBtn" class="l1"/>
									<a href="boardDelete.bo?no=<%=boardView.getNo() %>" class="l1">글 삭제</a>
										<%}else{%>
									<input type="button" value="글수정" id="boardUpdateOkBtn" class="l1"/>

												<%if(session.getAttribute("sessionId").equals(boardView.getUserId())) {%>
									<a href="boardDelete.bo?no=<%=boardView.getNo() %>" class="l1">글 삭제</a>

s									<%}} %>
									<%} %>
								</li>
							</ul>						
						</form>
						</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>