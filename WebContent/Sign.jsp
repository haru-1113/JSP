<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript" src="Sign.js"></script>
</head>
<body>
	<form method="post" action="SignServlet" name="frm">
		이름 : <input type="text" name="name"><br> 주민번호 : <input
			type="text" name="rrn"> - <input type="password" name="rrn2"><br>
		아이디 : <input type="text" name="id"><br> 비밀번호 : <input
			type="password" name="pwd"><br> 비밀번호확인 : <input
			type="password" name="che_pwd"><br> 이메일 : <input
			type="text" name="e_mail"> @ <input type="text" name="dotcom">
		<select name="dotcomlist" size="1">
			<option value="naver.com">naver.com</option>
			<option value="nate.com">nate.com</option>
			<option value="daum.net">daum.net</option>
			<option value="google.com">google.com</option>
			<option value="직접입력">직접입력</option>
		</select><br> 우편번호 : <input type="text" name="addnum"><br> 주소
		: <input type="text" name="addr"><br> 핸드폰번호 : <input
			type="text" name="pnum"><br> <label for="job"
			style="float: left;">직 업 :</label> <select name="job" size='4'>
			<option value="학생">학생</option>
			<option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
			<option value="언론">언론</option>
			<option value="공무원">공무원</option>
			<option value="군인">군인</option>
			<option value="서비스업">서비스업</option>
			<option value="교육">교육</option>
		</select><br> 메일/SMS정보수신<input type="radio" name="sms" value="yes" checked>수신
		<input type="radio" name="sms" value="no">수신거부<br> 관심분야 <input
			type="checkbox" name="item" value="생두">생두 <input
			type="checkbox" name="item" value="원두">원두<input
			type="checkbox" name="item" value="로스팅">로스팅 <input
			type="checkbox" name="item" value="핸드드립">핸드드립 <input
			type="checkbox" name="item" value="에스프레소">에스프레소<input
			type="checkbox" name="item" value="창업">창업<br> <input
			type="submit" value="회원가입" onclick="return check()"> <input
			type="reset" value="취소">
	</form>
</body>
</html>