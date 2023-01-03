const loginForm = document.querySelector('#loginForm');
const userId = document.querySelector('#userId');
const userPw = document.querySelector('#userPw');
const loginOk = document.querySelector('#loginOk');

loginOk.addEventListener('click', function(event){
	
	if(userId.value == null || userId.value.length<1){
		alert("아이디를 다시 입력하세요");
		userId.focus();
		return false;
	}
	
	if(userPw.value == null || userPw.value.length<1){
		alert("비밀번호를 다시 입력하세요");
		userPw.focus();
		return false;
	}
	
	event.preventDefault();
	
	alert("로그인성공");
	loginForm.submit;
});

	
	
	
