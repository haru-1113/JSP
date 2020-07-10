/**
 * 
 */

function check(){
	if(document.frm.name.value==""){
		alert("이름을 입력해주세요.");
		document.frm.name.focus();
		return false;
	}else if(document.frm.rrn.value==""||document.frm.rrn2.value==""){
		alert("주민번호를 입력해주세요.");
		document.frm.rrn.focus();
		return false;
	}else if(document.frm.id.value==""){
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false;
	}else if(document.frm.pwd.value==""){
		alert("비밀번호를입력해주세요.");
		document.frm.pwd.focus();
		return false;
	}else if(document.frm.pwd.value!=document.frm.che_pwd.value){
		alert("비밀번호와 비밀번호 확인에 입력된 값이 다릅니다.");
		document.frm.pwd.focus();
		return false;
	}else if(document.frm.e_mail.value==""){
		alert("이메일을 입력해주세요.");
		document.frm.e_mail.focus();
		return false;
	}else if(document.frm.addnum.value==""){
		alert("우편번호를 입력해주세요.");
		document.frm.addnum.focus();
		return false;
	}else if(document.frm.addr.value==""){
		alert("주소를 입력해주세요.");
		document.frm.addr.focus();
		return false;
	}else if(document.frm.pnum.value==""){
		alert("핸드폰 번호를 입력해주세요");
		document.frm.pnum.focus();
		return false;}else{
		return true;
	}
}