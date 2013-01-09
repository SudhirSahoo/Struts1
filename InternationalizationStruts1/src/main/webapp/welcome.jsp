<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

<html:link page="/Locale.do?method=chinese">Chinese</html:link>
<html:link page="/Locale.do?method=english">English</html:link>
<html:link page="/Locale.do?method=german">German</html:link>
<html:link page="/Locale.do?method=france">France</html:link>

	<bean:message key="label.common.username" />
	<bean:message key="label.common.password" />
</body>
</html>