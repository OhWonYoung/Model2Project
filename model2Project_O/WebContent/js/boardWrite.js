"use strict";

const boardwriteOkForm = document.querySelector("#boardwriteOkForm");
const boardwriteOkBtn = document.querySelector("#boardwriteOkBtn");
const no = document.querySelector("#no");
const userId = document.querySelector("#userId");
const userPw = document.querySelector("#userPw");
const title = document.querySelector("#title");
const content = document.querySelector("#content");


boardwriteOkBtn.addEventListener('click',()=>{
	if(no==null||userId.value.length<=0){
		alert("글번호를 입력해주세요");
		no.focus();
		return false;
	}
	if(userId==null||userId.value.length<=0){
		alert("아이디를 입력해주세요");
		userId.focus();
		return false;
	}
	if(userPw==null||userPw.value.length<=0){
		alert("글비밀번호 입력해주세요");
		userPw.focus();
		return false;
	}
	if(title==null||title.value.length<=0){
		alert("글 제목을 입력해주세요");
		title.focus();
		return false;
	}
	/*if(content==null||content.value.length==0){
		alert("글 내용을 입력해주세요");
		content.focus();
		return false;
	}
	*/
	alert("글작성 실행");
	boardwriteOkForm.submit();
});