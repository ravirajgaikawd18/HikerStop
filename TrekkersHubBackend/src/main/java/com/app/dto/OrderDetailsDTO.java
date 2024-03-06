package com.app.dto;

import org.springframework.beans.BeanUtils;

import com.app.pojos.Event;
import com.app.pojos.OrderDetails;

import lombok.Data;


@Data
public class OrderDetailsDTO {
	
	
	private int id;
	
	
	private Event event;
	
	
	private int qty;
	

	public static OrderDetailsDTO fromEntity(OrderDetails entity) {
		OrderDetailsDTO dto = new OrderDetailsDTO();
		BeanUtils.copyProperties(entity, dto);		
		return dto;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Event getEvent() {
		return event;
	}


	public void setEvent(Event event) {
		this.event = event;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}
}
