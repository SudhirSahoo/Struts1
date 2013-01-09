<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<html>
<head>
<title>Struts Custom Validation - Create Task</title>
</head>
<body>
     
    <html:form action="/createTask.do" >
        <table>
            <tr>
                <td>
                    Task Name :
                </td>
                <td>
                    <html:text property="taskName"/>
                </td>
                <td>
                    <html:errors property="taskName"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                   <html:submit value="Create Task" />
                </td>
                <td></td>
            </tr>
        </table> 
        
    </html:form>
      
</body>
</html>