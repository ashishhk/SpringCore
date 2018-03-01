package com.epam.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

public class Event {
	private int id;
	private String msg;
	private Date date;
	private DateFormat df;
	
	public int getId() {
		return id;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getDate() {
		return date;
	}

	public Event(Date date, DateFormat df) {
		super();
		this.id = new Random().nextInt();
		this.date = date;
		this.df=df;
	}

	public String toString() {
		return "Id: "+id+" Message: "+msg+" Date: "+df.format(date);
	}
}
