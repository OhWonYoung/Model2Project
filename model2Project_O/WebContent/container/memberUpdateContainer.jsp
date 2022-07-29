<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="container">
	<div class="inner-container">
		<div class="memberUpdate">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<div class="memberUpdate-con">
						<div class="memberUpdate-form">
						<h1 class="title">회원수정</h1>
						<form action="memberUpdateOk.do"method="POST" id="memberUpdateOkForm">
							<ul>
								<li>
									<input type="hidden" name="userId" id="userId" placeholder="아이디 입력" value="<%=session.getAttribute("sessionId")%>"/>
									<span><%=session.getAttribute("sessionId")%></span>
								</li>
								<li>
									<input type="password" name="userPw" id="userPw1" placeholder="비밀번호 입력"/>
								</li>
								<li>
									<input type="password" name="userPw" id="userPw2" placeholder="비밀번호 확인"/>
								</li>
								<li>
									<span id="pwId"></span>
								</li>
								<li>
									<input type="text" name="userName" id="userName" placeholder="이름 입력"/>
								</li>
								<li>
									<input type="button" value="회원탈퇴" id="" />
									<input type="button" value="회원수정" id="memberUpdateOkBtn" />
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