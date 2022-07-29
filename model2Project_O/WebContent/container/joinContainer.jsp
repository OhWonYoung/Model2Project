<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="container">
	<div class="inner-container">
		<div class="join">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<div class="join-con">
						<div class="join-form">
						<h1 class="title">회원가입</h1>
						<form action="joinOk.do"method="POST" id="joinOkForm">
							<ul>
								<li>
									<input type="text" name="userId" id="userId" placeholder="아이디 입력"/>
									<input type="button" value="아이디체크" id="idCheckedBtn"/>
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
									<input type="reset" value="취소" />
									<input type="button" value="회원가입" id="joinOkBtn" />
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