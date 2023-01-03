// 함수 생성

// 매개변수가 없고 반환값이 없다
function joinOkFn(){
	alert('joinOkFn');
	//return;
}

// 매개변수가 있고 반환값이 없다
function fn2(num1, num2){
	let sum = num1+num2;
	alert(sum);
}

// 매개변수가 없고 반환값이 있다
function fn3(){
	let sum=100;
	return sum;
}

// 매개변수가 있고 반환값이 있다
function fn4(num1,num2){
	let sum = num1+num2;
	console.log("함수실행 -> " + sum);
	
	let rs ="반환값 : " + sum;
	return rs;
}

// 1.함수생성 2.선택자 3.이벤트실행 4.함수실행
const btn1 = document.querySelector('#btn1');
// btn1을 클릭하면 -> fn4함수를 호출
btn1.addEventListener('click',function(){
	fn4(100,123);
});

// #loginOkBtn 클릭하면 loginOkFn함수를 호출
// loginOk함수는 #userId, #userPw 값이 없거나,
// 길이가 4글자 미만이면 "입력오류" 팝업 띄우고 해당 input에
// 포커스가 이동하고 유효성 검사를 통과하면 전체 폼이
// 실행 하도록 프로그래밍 해보세요

const loginForm = document.querySelector('#loginForm');
const userId = document.querySelector('#userId');
const userPw = document.querySelector('#userPw');
const loginOkBtn = document.querySelector('#loginOkBtn');

loginOkBtn.addEventListener('click', loginOkFn);
function loginOkFn() {
	if(userId.value==null || userId.value.length<4){
		alert("입력오류");
		userId.focus();
		return false;	// 함수를 종료(아래 실행X)
	}
	
	if(userPw.value==null || userPw.value.length<4){
		alert("입력오류");
		userPw.focus();
		return false;
	}
	
	alert("로그인 성공");
	loginForm.submit();	// form 데이터 전송
};

// 함수 표현식 -> 익명(무명) 함수에 주로 사용 **forEach에 적용
const fn51=function(){
	console.log('fn5');
}

const fn52=function(num1, num2){
	console.log(num1 + num2);
}

const fn53=function(num1, num2){
	console.log(num1 + num2);
	let sum = num1 + num2;
	console.log("반환값 ->" + sum)
	return sum;
}

// arrow function(화살표 함수) ES6 추가 -> 반복적인 함수 구문을 단축, 매개변수 -> 자바의 Ramda
// 익명 함수 구문 단축
const fn011 = function(){
	console.log('fn011');
}

const fn012 = ()=>console.log('fn012');



