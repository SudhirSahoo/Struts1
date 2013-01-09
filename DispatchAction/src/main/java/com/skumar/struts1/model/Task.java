package com.skumar.struts1.model;

import java.util.Date;

public class Task implements java.io.Serializable {
	
	private String taskName;
	private String taskDesc;
	private boolean isAssigned;
	private int taskId;
	private String taskCreatedDate;

	// Contructor
	public Task() {
	}

	// Contructor to initial the properties
	public Task(int taskId, String taskName, String taskDesc, boolean isAssigned, String taskCreatedDate) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDesc = taskDesc;
		this.isAssigned = isAssigned;
		this.taskCreatedDate = taskCreatedDate;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public boolean getIsAssigned() {
		return isAssigned;
	}

	public void setAssigned(boolean isAssigned) {
		this.isAssigned = isAssigned;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskCreatedDate() {
		return taskCreatedDate;
	}

	public void setTaskCreatedDate(String taskCreatedDate) {
		this.taskCreatedDate = taskCreatedDate;
	}
	
	
	
}
