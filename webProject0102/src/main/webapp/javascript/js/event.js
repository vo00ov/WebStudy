// 이벤트

const btn1 = document.querySelector('#btn1');
const btn2 = document.querySelector('#btn2');
const btn3 = document.querySelector('#btn3');
const btn4 = document.querySelector('#btn4');
const btn5 = document.querySelector('#btn5');
const searchForm = document.querySelector('#searchForm');
const search = document.querySelector('#search');
const searchOk = document.querySelector('#searchOk');
const searchBtnOk = document.querySelector('#searchBtnOk');

btn1.addEventListener('click',function(){
	console.log("이벤트 실행");
})

btn2.addEventListener('click', f1);
function f1(){
	console.log("f1() 실행");
}

btn3.addEventListener('mouseover',function(){
	console.log("이벤트 mouseover");
})

btn3.addEventListener('mouseout',function(){
	console.log("이벤트 mouseout");
})

const header = document.querySelector('#header');

window.addEventListener("scroll", function(e){
	let cVal = document.documentElement.scrollTop;
	
	if(cVal >= 60){
		header.classList.add("hon");
	}else{
		header.classList.remove("hon");
	}
});

search.addEventListener('keyup', function(event){
	console.log(event.target.value);
});

searchOk.addEventListener('click', function(event){
	
	event.preventDefault();	// 기본이벤트 중지	// submit 이벤트
	
	if(search.value==null || search.value.length<1){
		alert("입력오류");
		search.focus();
		return false;
	}
	
	alert("검색 실행");
	searchForm.submit();
});

searchBtnOk.addEventListener('click', function(event){
	
	if(search.value==null || search.value.length<1){
		alert("입력오류");
		search.focus();
		return false;
	}
	
	alert("검색 실행");
	searchForm.submit();
});


////////////////////

/*let i=1;
function f1(){
	console.log(i++);
}

// f1 함수를 1초후 마다 실행 -> 윈도우 존재 할 때 까지
let setIn = setInterval(f1, 1000);	// 1초 1000
// btn4 마우스 오버시 setInterval중지
btn4.addEventListener('mouseover', function(){	
	clearInterval(setIn);
})
btn4.addEventListener('mouseout', function(){	
	setIn = setInterval(f1, 1000);	// 마우스 아웃시 다시 시작
})*/

// 배열

const arr1 = new Array();
const arr2 = ['a1','a2','a3']

const galleryLi = document.querySelectorAll('.gallery ul li');
const bgArr=['#ff00ff', '#ffddff', '#ddddff', '#dfdfaa', '#abcdef']
/*galleryLi[0].style.backgroundColor='#ff00ff';
galleryLi[1].style.backgroundColor='#ffddff';
galleryLi[2].style.backgroundColor='#ddddff';
galleryLi[3].style.backgroundColor='#dfdfaa';
galleryLi[4].style.backgroundColor='#abcdef';*/

for(let i=0;i<galleryLi.length;i++){

	bgArr.push("url(img/bg"+i+".jpg) no-repeat 50%/cover");
	galleryLi[i].style.background=bgArr[i];
	//console.log(galleryLi[i]);
}

let i = -1;
function fadeGallery(){
	if(i>=galleryLi.length -1) i=-1;
	i++;
	
	galleryLi.forEach((element, index)=>{
		if(i===index){
			element.classList.add('fadeLi');
		}else{
			element.classList.remove('fadeLi');
		}
	});
	
	if(i>=galleryLi.length-1) i=-1;
}

let setIn=setInterval(fadeGallery, 3000);

(()=>{
	fadeGallery();
})();


