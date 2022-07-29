<%@page import="org.model2.dto.Board1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Board1 boardWrite =(Board1)request.getAttribute("boardWrite");
String sessionId2 = (String) session.getAttribute("sessionId");
String admin2 = (String) session.getAttribute("admin");
%>
<div class="container">
	<div class="inner-container">
		<div class="boardWrite">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<div class="boardWrite-con">
						<div class="boardWrite-form">
						<h1 class="title2">글 상세보기</h1>
						<form action="boardUpdateOk.do"method="POST" id="boardUpdateOkForm">
							<ul>
								<li>
									<label for="no">글번호</label>
									<input type="hidden" name="no" id="no" value="<%=boardWrite.getNo() %>"/>
									<span><%=boardWrite.getNo() %></span>
								</li>
								<li>
									<label for="userId">작성자</label>
									<input type="hidden" name="userId" id="userId" value="<%=boardWrite.getUserId() %>"/>
									<span><%=boardWrite.getUserId() %></span>
								</li>
								<li>
									<label for="userPw">글 비밀번호</label>
									<input type="hidden" name="userPw" id="userPw" value="<%=boardWrite.getUserPw() %>"/>
									<span><%=boardWrite.getUserPw() %></span>
								</li>
								<li>
									<label for="title">글제목</label>
									<input type="text" name="title" value="<%=boardWrite.getTitle() %>" />
								</li>
								<li>
									<label for="content">글내용</label>
									<textarea rows="20" cols="30">
										<%=boardWrite.getContent() %>
									</textarea>
								</li>
								<li>
									<%-- <%if(session.getAttribute("sessionId")==null){%> 이렇게 바로 넣어도 됨 --%>
									<a href="index.do" class="l1">HOME</a>
									<a href="boardListView.bo" class="l1">글 목록</a>
									<input type="button" value="글등록" id="boardUpdateOkBtn" class="l1"/>
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