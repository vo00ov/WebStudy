const joinForm = document.querySelector('#joinForm');
const joinOkBtn = document.querySelector('#joinOkBtn')
const userId = document.querySelector('#userId');
const userPw = document.querySelector('#userPw');
const userName = document.querySelector('#userName');

joinOkBtn.addEventListener("click", joinOkFn);

function joinOkFn(){
	if(userId.value==null || userId.value.length<1){
		alert("아이디를 입력해주세요");
		userId.focus();
		return false;
	}
	
	if(userPw.value==null || userPw.value.length<1){
		alert("비밀번호를 입력해주세요");
		userPw.focus();
		return false;
	}
	
	if(userName.value==null || userName.value.length<1){
		alert("이름을 입력해주세요");
		userName.focus();
		return false;
	}
	
	alert("회원가입 성공");
	joinForm.submit;
}