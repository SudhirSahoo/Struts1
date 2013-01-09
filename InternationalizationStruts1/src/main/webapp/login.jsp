<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h1><bean:message key="label.common.message" /></h1>

<html:messages id="err_name" property="common.username.err">
<div style="color:red">
	<bean:write name="err_name" />
</div>
</html:messages>

<html:messages id="err_password" property="common.password.err">
<div style="color:red">
	<bean:write name="err_password" />
</div>
</html:messages>
<br />
<br />
<html:link page="/Locale.do?method=chinese">Chinese</html:link>
<html:link page="/Locale.do?method=english">English</html:link>
<html:link page="/Locale.do?method=german">German</html:link>
<html:link page="/Locale.do?method=france">France</html:link>

<html:form action="/Submit?method=submit">
<br />
<bean:message key="label.common.username" /> : <html:text property="username" />
<br />
<br />
<bean:message key="label.common.password" /> : <html:text property="password" />
<br />
<br />

<html:submit><bean:message key="label.common.button.submit" /></html:submit>
</html:form>


</body>
</html>