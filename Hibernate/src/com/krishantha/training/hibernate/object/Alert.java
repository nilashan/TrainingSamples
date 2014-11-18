package com.krishantha.training.hibernate.object;

public class Alert {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private int id;
	private String message;

	public Alert(String message) {
		super();
		this.message = message;
	}
public Alert() {

}
}
