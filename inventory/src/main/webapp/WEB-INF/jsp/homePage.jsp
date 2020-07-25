
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html>
<html>
    <head>
        <title><spring:message code="label.grocery"/></title>
    </head>
    <body>
        <h1><spring:message code="label.welcome"/></h1>
        <div align="right">
				<a href="/grocery/home/?lang=EN" class="text-right"><spring:message code="label.languagEnglish"/></a><br/>
				<a href="/grocery/home/?lang=hi" class="text-right"><spring:message code="label.languageHindi"/></a>
			</div>
    </body>
</html>