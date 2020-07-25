
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<meta charset=UTF-8></meta>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script1
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
</script> <!-- Latest compiled JavaScript --> <script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="/css/GroceryCss.css">
</head>
<body
	style="background-image: url('/images/Grocery-background.jpg'); background-size: cover;">
	<div class="container">
		<div class="card card-container">
			<form action="/register" method="get" class="form-signin">

				<h1>Sign Up</h1>
				<p><spring:message code="label.Pleasefillinthisformtocreateanaccount" /></p>
				<hr>
				
				<label for="username"><spring:message code="label.username" /></label>
				<input type="text" placeholder="<spring:message code="label.enterUsername" />" name="username" required>
				 <label for="psw"><b><spring:message code="label.password" /></b></label> 
				 <input type="password" placeholder="<spring:message code="label.enterPassword" />" name="psw" required> 
				 <label for="psw-repeat"><b><spring:message code="label.repeatPassword" /></b></label> 
				 <input type="password" placeholder="<spring:message code="label.repeatPassword" />" name="psw-repeat" required> 
				 <label for="email"><b><spring:message code="label.Email" /></b></label>
				<input type="text" placeholder="<spring:message code="label.enterEmail" />" name="email">
				 <label for="mobilenumber"><b><spring:message code="label.mobileNumber" /></b></label> 
				 <input type="text" placeholder="<spring:message code="label.enterMobileNumber" />" name="mobilenumber"> 

				<div class="clearfix">
				<a href="/login" class="btn btn-lg btn-primary btn-block btn-signin">Cancel</a>
					<button type="submit" class="btn btn-lg btn-primary btn-block btn-signin">Sign Up</button>
				</div>
				<div align="right">
				<a href="/signUp?lang=EN" class="text-right"><spring:message code="label.languagEnglish"/></a><br/>
				<a href="/signUp?lang=hi" class="text-right"><spring:message code="label.languageHindi"/></a>
			</div>

			</form>
		</div>
	</div>
	<!-- /container -->
</body>
</html>