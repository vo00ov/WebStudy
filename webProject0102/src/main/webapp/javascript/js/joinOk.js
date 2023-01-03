// joinOkBtn을 클릭 하면
// input의 value를 체크 해서
// 값이 없으면 "값이 없습니다" 팝업을 띄우고
// 다시 작성하도록

const joinForm = document.querySelector('#joinForm')
const joinOkBtn = document.querySelector('#joinOkBtn');
const userId = document.querySelector('#userId');
const userPw = document.querySelector('#userPw');
const userName = document.querySelector('#userName');
const city = document.querySelector('#city');
const hobbys = document.querySelectorAll('.hobbys');
// joinOkBtn에 이벤트
// click -> 마우스를 눌렀다 땠을 때 발생 하는 이벤트
// addEventListener ->				// 이벤트 핸들러(함수)
joinOkBtn.addEventListener("click", joinOkFn);
function joinOkFn() {




	console.log('joinOkFn함수 호출');
	// 아이디 value가 null, value.length<1, ""
	// 값이 없으면 "값이 없습니다" 팝업을 띄우고
	if (userId.value == null || userId.value.length < 1) {
		alert("아이디값이 없습니다");
		userId.focus();
		return false;
	}
	if (userPw.value == null || userPw.value.length < 1) {
		alert("비밀번호값이 없습니다");
		userPw.focus();
		return false;
	}
	if (userName.value == null || userName.value.length < 1) {
		alert("이름값이 없습니다");
		userName.focus();
		return false;
	}



	// 체크 갯수가 1보다 작으면 체크가 안된 것 -> 체크 갯수를 먼저 조회
	let i = 0;
	// hobbys의 모든 요소를 검사하여 체크가 되어 있으면
	// i를 1증가
	hobbys.forEach((el, index) => {
		if (el.checked) {
			console.log(el)
			i++;
		}
	});

	/*	
	hobbys.forEach(function(el){
		if(el.checked){
			console.log(el)
			i++;
		}
	})
*/
	if (i < 1) {
		alert('1개 이상 선택해주세요');
		hobbys[0].focus();
		return false;
	}


	if (city.value == null || userName.value.length < 1 || city.value == "") {
		alert("출신지를 선택");
		city.focus();
		return false;
	}

	alert("회원가입 실행");
	joinForm.submit();




}