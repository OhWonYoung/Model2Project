<%@page import="org.model2.dto.Board1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int maxNo = (int)request.getAttribute("maxNo");
%>
<div class="container">
	<div class="inner-container">
		<div class="boardWrite">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<div class="boardWrite-con">
						<div class="boardWrite-form">
						<h1 class="title2">글 작성</h1>
						<form action="boardwriteOk.do"method="POST" id="boardwriteOkForm">
							<ul>
								<li>
									<label for="no">글번호</label>
									<input type="hidden" name="no" id="no" value="<%=maxNo %>" />
									<span><%=maxNo %></span>
								</li>
								<li>
									<label for="userId">작성자</label>
									<input type="hidden" name="userId" id="userId" value="<%=session.getAttribute("sessionId") %>" />
									<span><%=session.getAttribute("sessionId") %></span>
								</li>
								<li>
									<label for="userPw">글 비밀번호</label>
									<input type="text" name="userPw" id="userPw" />
								</li>
								<li>
									<label for="title">글제목</label>
									<input type="text" name="title" id="title"/>
								</li>
								<li>
									<label for="content" id="content">글내용</label>
									<textarea rows="20" cols="30">
									</textarea>
								</li>
								<li>
									<%if(session.getAttribute("sessionId")==null){%>
									<a href="index.do" class="l1">HOME</a>
									<a href="loginView.do" class="l1">로그인</a>
									<% }else{ %>
									<a href="index.do" class="l1">HOME</a>
									<a href="boardListView.bo" class="l1">글 목록</a>
									<input type="button" value="글등록" id="boardwriteOkBtn" class="l1"/>
									<% } %>
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