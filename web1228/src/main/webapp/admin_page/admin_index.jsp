<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자페이지</title>
</head>
<body>
<div id="wrap">
	<div class="header">
		<div class="nav">
			<h1 class="logo">
				<a href="admin_index.do">
					<img src="" alt="Admin_Home" />
				</a>
			</h1>
			
			<div class="gnb">
				<ul>
					<li><a href="admin_index.do">HOME</a></li>
					<li><a href="admin_boardList.do">BoardList</a></li>
					<li><a href="admin_memberList.do">MemberList</a></li>
					<li><a href="admin_productList.do">ProductList</a></li>
					<li><a href="admin_join.do">JOIN</a></li>
					<li><a href="admin_login.do">LOGIN</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<div class="container">
		<div class="left-con">
			<div class="side-menu">
				<ul>
					<li><h1><a href="#">관리자메인</a></h1></li>
					<li><a href="#">상품목록1</a></li>
					<li><a href="#">상품목록2</a></li>
					<li><a href="#">상품등록</a></li>
					<li><a href="#">주문목록</a></li>
					<li><a href="#">고객목록</a></li>
					<li><a href="#">게시글목록</a></li>
				</ul>
			</div>
			<div class="side-footer">
				<div class="side-footer-con">
					<img src="" alt="메인로고" />
					<p>저작권, 주소, 사업등록</p>
				</div>
			</div>
		</div>
		
		<div class="right-con">
			<div class="right-con-header">
				<h1>right-con Title</h1>
			</div>
			<div class="right-con-content">
				<div class="con">
					<h2>실제 컨텐츠</h2>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>