// 연산자
// 1.단항연산자
console.log("===단항연산자===")
let i = 10;
console.log(i++);
console.log(i);
console.log(++i);
console.log(i);

console.log(i--);
console.log(i);
console.log(--i);
console.log(i);

console.log("===이항연산자===")
console.log("===산술연산자===")
let num1 = 10;
let num2 = 20;
console.log(num1+num2);
console.log(num1-num2);
console.log(num1*num2);
console.log(num1/num2);
console.log(num1%num2);
console.log(1+5+'5');

console.log("===대입연산자===");
const num21 = 100;
const num22 = 100 + 50 * (5 + 3);

console.log("===복합대입연산자(+=, -=, *=, /=, %-)===");
let num11 = 10;
num11 = num11+20;
console.log(num11);
num11+=20;
console.log(num11);
num11-=20;
console.log(num11);
num11*=20;
console.log(num11);
num11/=20;
console.log(num11);
num11%=20;
console.log(num11);

console.log("===비교연산자===");
let num31 = 10;
let num32 = 20;
console.log(num31>num32);
console.log(num31>=num32);
console.log(num31<num32);
console.log(num31<=num32);
console.log(num31==num32);
console.log(num31!=num32);
console.log("===, !==");
console.log('11'==11);
console.log('11'===11);
console.log('11'!=11);
console.log('11'!==11);

if(10>5){
	console.log("5보다 크다");
}else{
	console.log("5보다 크지않다");	
}

console.log("===논리연산자===");
const userId = 'm1';
const userPw = '11';

console.log(userId=='m1' && userPw=='11');
console.log(userId=='m1' && userPw=='21');
console.log(userId=='m2' && userPw=='11');
console.log(userId=='m2' && userPw=='21');

if(userId=='m1' && userPw=='11'){
	console.log("로그인성공");
}else{
	console.log("로그인실패");
}

console.log("===조건문 if===");

const id = 'm1';
const pw = '11';
// 조건이 true일 때만 실행
if(id=='m1'){
	console.log("아이디 : " + id);
}
if(id=='m1' && pw=='11'){
	console.log("로그인성공");
}else{	
	console.log("로그인실패");
}

