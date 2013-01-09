<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>
		Tiles Example
	</h1>

	<html:errors/>
	<html:form action="/login.do">
		<br />
			User Name : <html:text property="userName" />
		<br />
		<br />
			Password : <html:text property="password" />
		<br />
		<br />

		<html:submit value="Login" />
	</html:form>


</body>
</html>