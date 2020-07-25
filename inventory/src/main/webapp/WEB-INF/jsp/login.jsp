 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page contentType="text/html; charset=UTF-8"%>
	<meta charset =UTF-8></meta>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script1
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="/css/GroceryCss.css">

</head>
<body style="background-image: url('/images/Grocery-background.jpg');background-size: cover;">
	<div class="container">
		<div class="myheader text-center"><h2 style="color:white;"><spring:message code="label.header"/></h2></div>
		<div class="card card-container">
			<img id="profile-img" class="profile-img-card"
				src="/images/avatar_2x.png" />
			<p id="profile-name" class="profile-name-card"></p>
			<form action="/login" method="post" class="form-signin">
				
				<input type="text" id="username" name="username" class="form-control" placeholder="<spring:message code="label.userid"/>" required autofocus> 
				<input type="password" id="password" name="password" class="form-control" placeholder="<spring:message code="label.password"/>" required>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				<!-- <div id="remember" class="checkbox">
					<label> 
						<input type="checkbox" value="remember-me"> Remember me
					</label>
				</div> -->
				<button class="btn btn-lg btn-primary btn-block btn-signin" type="submit"><spring:message code="label.signin"/></button>
				<div>
			</form>
			<!-- /form -->
			<div class= "col-md-12 control">
			<div border-top: 1px solid#888; padding-top:15px; font-size:85%><spring:message code="label.Don'tHaveAnAccount"/></div> <a href="/signUp" class="si">Sign Up <spring:message code="label.here"/></a>
			</div>
			<div align="right">
				<a href="/login?lang=EN" class="text-right"><spring:message code="label.languagEnglish"/></a><br/>
				<a href="/login?lang=hi" class="text-right"><spring:message code="label.languageHindi"/></a>
			</div>
		</div>
		<!-- /card-container -->
	</div>
	<!-- /container -->
</body>
</html>