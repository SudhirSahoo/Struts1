package com.skumar.struts1.form;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.chain.commands.servlet.ValidateActionForm;

public class CreateTaskForm extends ActionForm implements Serializable {

	String taskName;

	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		System.out.println("Task Name:        " + getTaskName());
		if (getTaskName() == null || "".equals(getTaskName().trim())) {
			errors.add("taskName", new ActionMessage("error.taskName", "Task Name"));
		}
		return errors;
	}
}
