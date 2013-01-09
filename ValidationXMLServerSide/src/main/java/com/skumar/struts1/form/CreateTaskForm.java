package com.skumar.struts1.form;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.chain.commands.servlet.ValidateActionForm;
import org.apache.struts.validator.ValidatorForm;

public class CreateTaskForm extends ValidatorForm implements Serializable {

	String taskName;

	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
