"use strict";

const searchForm = document.querySelector("#searchForm");
const searchBtnOk = document.querySelector("#searchBtnOk");
const sel = document.querySelector("#sel");
const search = document.querySelector("#search");


searchBtnOk.addEventListener('click',()=>{
	
	if(sel==null||sel.value.length<=0){
		alert("select오류");
		sel.focus();
		return false;
	}
	if(search==null||search.value.length<=0){
		alert("search오류");
		search.focus();
		return false;
	}
	
	alert("검색실행");
	searchForm.submit();
});
