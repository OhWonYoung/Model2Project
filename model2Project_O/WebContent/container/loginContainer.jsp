<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="container">
	<div class="inner-container">
		<div class="login">
			<div class="sections">
				<div class="section sec1">
					<div class="sec-con">
						<div class="login-con">
						<div class="login-form">
						<h1 class="title">회원가입</h1>
						<form action="loginOk.do"method="POST" id="loginOkForm">
							<ul>
								<li>
									<input type="text" name="userId" id="userId" placeholder="아이디 입력"/>
								</li>
								<li>
									<input type="password" name="userPw" id="userPw1" placeholder="비밀번호 입력"/>
								</li>
								<li>
									<input type="button" value="로그인" id="loginOkBtn" />
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