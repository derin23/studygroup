package com.todoapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MainModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String task;
	private Enum status;
	private String note;

	public MainModel(String task) {
		this.task = task;
		// this.status = status;
		// this.note = note;
	}

//empty const
	public MainModel() {
	}

//getters and setters
	public Long getId() {
		return id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public Enum getStatus() {
		return status;
	}

	public void setStatus(Enum status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

//tostring
	@Override
	public String toString() {
		return "MainModel [id=" + id + ", task=" + task + ", status=" + status + ", note=" + note + "]";
	}

}
