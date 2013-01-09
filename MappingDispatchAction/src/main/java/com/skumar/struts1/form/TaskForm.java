package com.skumar.struts1.form;

import java.util.Collection;

import org.apache.struts.action.ActionForm;

public class TaskForm extends ActionForm {

	private Collection tasks;

	public Collection getTasks() {
		return tasks;
	}

	public void setTasks(Collection tasks) {
		this.tasks = tasks;
	}

	
}
