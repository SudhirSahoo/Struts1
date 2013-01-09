 
<%@ page language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
 
<html> 
	<head>
		<title>Show Task list</title>
	</head>
	<body>
	
	<table border="1">
	<tbody>
	<%-- set the header --%>
	<tr>
		<td>Task Name</td>
		<td>Task Desc</td>
		<td>Due Date</td>
		<td>Assined ? </td>
		<td>Action</td>
		<td>Action</td>
	</tr>
	<%-- start with an iterate over the collection books --%>
	<logic:iterate name="taskForm" property="tasks" id="task">
	<tr>
		<td><bean:write name="task" property="taskName" /></td>
		<td><bean:write name="task" property="taskDesc" /></td>
		<td><bean:write name="task" property="taskCreatedDate" /></td>
		<td><html:checkbox disabled="true" 
						   name="task" 
						   property="isAssigned"/>
		</td>
		<td><html:link action="TaskAction.do?method=editTask" 
					   paramName="task" 
					   paramProperty="taskId" 
					   paramId="taskId">Edit</html:link>
		</td>
		<td><html:link action="TaskAction.do?method=deleteTask" 
					   paramName="task" 
					   paramProperty="taskId" 
					   paramId="taskId">Delete</html:link>
		</td>
	</tr>
	</logic:iterate> 
	<%-- end interate --%>
	
	<%-- print out the add link --%>
	<tr>
	
		<td colspan="5">
			<html:link action="TaskAction.do?do=addTask" 
					   paramName="task" 
					   paramProperty="taskId" 
					   paramId="taskId">Add a task</html:link>
		</td>
	 
	</tr>
	
	</tbody>
	</table>
	</body>
</html>
