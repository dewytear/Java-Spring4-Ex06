<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>[회원 정보 입력]</title>
</head>
<body>

	<div align="center">
		<h2>회원 정보 입력 폼</h2>
		<hr width="500" color="tomato">
		<form:form commandName="member">
		<table border="1" cellpadding="1" cellspacing="0" width="500">
		
			<tr>
				<td width="20%"><form:label path="id">아이디</form:label></td>
				<td><form:input path="id"/><form:errors path="id"/></td>
			</tr>
			<tr>
				<td><form:label path="name">이름</form:label></td>
				<td><form:input path="name"/><form:errors path="name"/></td>
			</tr>
			<tr>
				<td><form:label path="address.address1">주소1</form:label></td>
				<td><form:input path="address.address1"/><form:errors path="address.address1"/></td>
			</tr>
			<tr>
				<td><form:label path="address.address2">주소2</form:label></td>
				<td><form:input path="address.address2"/><form:errors path="address.address2"/></td>
			</tr>
			<tr>
				<td><form:label path="email">이메일</form:label></td>
				<td><form:input path="email"/><form:errors path="email"/></td>
			</tr>
			<tr>
				<td><form:label path="job">직업</form:label></td>
				<td>
					<form:select path="job">
						<option value="">-------- 직업을 선택해세요 --------</option>
						<form:options items="${jobCodes}" itemLable="label" itemValue="code"/>
					</form:select>
					<form:errors path="job"/>
				</td>
			</tr>
			<tr>
				<td><form:label path="hobbys">취미</form:label></td>
				<td>
					<form:checkboxes items="${hobbyNames}" path="hobbys"/>
					<form:errors path="hobbys"/>
				</td>
			</tr>
			<tr>
				<td><form:label path="gender">성별</form:label></td>
				<td colspan="2"><form:radiobuttons path="gender" items="${mw}"/>
			</tr>
			<tr>
				<td><form:label path="etc">기타</form:label></td>
				<td><form:textarea path="etc" cols="20" rows="5"/></td>
			</tr>
			<tr>
				<td colspan="2"><form:checkbox path="contractAgreement" label="약관에 동의합니다."/></td>
			</tr>
			
		</table>
		<input type="submit" value="회원 등록"/>
		</form:form>
	</div>

</body>
</html>