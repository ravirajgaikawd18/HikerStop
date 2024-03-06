package com.app.dto;

import lombok.Data;

@Data
public class CartDTO {

	private int eventid;
	
	
	private String eventcat;
	
	
	private String eventname;
	
	
	private int price;
	
	
	private int qty;


	public int getEventid() {
		return eventid;
	}


	public void setEventid(int eventid) {
		this.eventid = eventid;
	}


	public String getEventcat() {
		return eventcat;
	}


	public void setEventcat(String eventcat) {
		this.eventcat = eventcat;
	}


	public String getEventname() {
		return eventname;
	}


	public void setEventname(String eventname) {
		this.eventname = eventname;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}
	
		
}
