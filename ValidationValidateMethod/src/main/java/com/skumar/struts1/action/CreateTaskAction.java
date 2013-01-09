package com.skumar.struts1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.skumar.struts1.form.CreateTaskForm;
 
public class CreateTaskAction extends Action{
 
	public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
        throws Exception {
 
		CreateTaskForm taskForm = (CreateTaskForm) form;
 
		return mapping.findForward("success");
	}
 
}
