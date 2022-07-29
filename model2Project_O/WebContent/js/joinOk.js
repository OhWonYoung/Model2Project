"use strict";

const joinOkForm = document.querySelector("#joinOkForm");
const joinOkBtn = document.querySelector("#joinOkBtn");
const idCheckedBtn = document.querySelector("#idCheckedBtn");
const userId = document.querySelector("#userId");
const userPw1 = document.querySelector("#userPw1");
const userPw2 = document.querySelector("#userPw2");
const userName = document.querySelector("#userName");
const pwId = document.querySelector("#pwId");

userPw2.addEventListener('keyup',keyupFnc); //keyup -> 키보드를 누르면 발생됨
function keyupFnc(){
	let rs = false;
	if(userPw1.value!=userPw2.value){ // userPw1과 userPw2의 값을 비교한다. -> .value
		pwId.innerText="비밀번호가 일치하지않습니다.";//	.innerText -> 텍스트를 넣어줌
		pwId.classList.remove('pwId2');//.classList.remove(); -> 클래스를 지워주어야 문제가 발생하지 않는다.
		rs = false;
	}else if(userId==null||userId.value.length<=0){
		return false;
	}else if(userPw1==null||userPw1.value.length<=0){
		return false;
	}else if(userPw2==null||userPw2.value.length<=0){
		return false;
	}else{
		pwId.innerText="비밀번호가 일치합니다.";
		pwId.classList.add('pwId2');//.classList.add(); -> 클래스를 추가해줌
		rs = true;
	}
	return rs;
}
joinOkBtn.addEventListener('click',()=>{
	if(userId==null||userId.value.length<=0){
		alert("아이디를 입력해주세요");
		userId.focus();
		return false;
	}
	if(userPw1==null||userPw1.value.length<=0){
		alert("비밀번호를 입력해주세요");
		userPw1.focus();
		return false;
	}
	if(!keyupFnc()){//!keyupFuc -> keyupFuc이 ture가 아니면
		alert("비밀번호가 일치 하지 않습니다.");
		userPw2.focus();
		return false;
	}
	if(userName==null||userName.value.length<=0){
		alert("이름을 입력해주세요");
		userName.focus();
		return false;
	}
	
	alert("회원가입 실행");
	joinOkForm.submit();
});