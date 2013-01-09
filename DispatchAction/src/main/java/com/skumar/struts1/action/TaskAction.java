package com.skumar.struts1.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.skumar.struts1.form.TaskForm;
import com.skumar.struts1.model.Task;

 
public class TaskAction extends DispatchAction {
 
	public ActionForward showTaskList(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
        throws Exception {
 
		TaskForm taskForm = (TaskForm) form;
		Collection tasks = new ArrayList();
		tasks.add(new Task(1, "Go Home", "Why Work", true, new Date().toString()));
		taskForm.setTasks(tasks);
		return mapping.findForward("showTaskList");
	}
	
	public ActionForward editTask(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	        throws Exception {
		int taskId = new Integer(request.getParameter("taskId"));
		System.out.println("E D I T      Task Id:      " + taskId);
		return mapping.findForward("showTaskList");
	}

	public ActionForward deleteTask(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
	        throws Exception {
		int taskId = new Integer(request.getParameter("taskId"));
		System.out.println("D E L E T E      Task Id:      " + taskId);
		return mapping.findForward("showTaskList");
	}

}
