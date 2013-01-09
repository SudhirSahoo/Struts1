<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title></title>

<link rel="stylesheet" href="/TilesStruts1/resources/css/master.css" type="text/css" />
</head>
<body>

	<div id="mask">
		<div id="header">
			<tiles:insert attribute="header" />
		</div>
		<div id="content-wrapper">
			<div id="leftcol-wrapper">
				<div id="menu">
					<tiles:insert attribute="menu" />
				</div>
				<div id="content">
					<tiles:insert attribute="body" />
				</div>
			</div>
		</div>
		<div id=clearfooter"></div>
	</div>
	<div id="footer" align="center">
		<tiles:insert attribute="footer" />
	</div>
</body>
</html>