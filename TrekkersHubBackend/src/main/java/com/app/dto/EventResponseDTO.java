package com.app.dto;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.app.pojos.Event;

import lombok.Data;

@Data
public class EventResponseDTO {
	

	private String location;
	
	
	private int eventid;
	
	
	private String eventname;
	
	
	private String eventcat;
	
	
	private int price;
	
	
	private String description;
	
	
	private String noofdays;
	
	
	
	private String dailywiseschedule;
	
	
	private String thingstocarry;
	
	
	private String pickupanddroplocation;
	
	
	private int guideId;
	
	
	private String guideName;
	
	
	private String photo1;
	
	
	private String photo2;
	
	
	private String photo3;
	
	private Date date;
	
		
	public static EventResponseDTO fromEntity(Event entity) {
		EventResponseDTO dto = new EventResponseDTO();
		dto.setGuideId(entity.getGuide().getId());
		dto.setGuideName(entity.getGuide().getName());
		BeanUtils.copyProperties(entity, dto);
		
		return dto;
		
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getEventid() {
		return eventid;
	}


	public void setEventid(int eventid) {
		this.eventid = eventid;
	}


	public String getEventname() {
		return eventname;
	}


	public void setEventname(String eventname) {
		this.eventname = eventname;
	}


	public String getEventcat() {
		return eventcat;
	}


	public void setEventcat(String eventcat) {
		this.eventcat = eventcat;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getNoofdays() {
		return noofdays;
	}


	public void setNoofdays(String noofdays) {
		this.noofdays = noofdays;
	}


	public String getDailywiseschedule() {
		return dailywiseschedule;
	}


	public void setDailywiseschedule(String dailywiseschedule) {
		this.dailywiseschedule = dailywiseschedule;
	}


	public String getThingstocarry() {
		return thingstocarry;
	}


	public void setThingstocarry(String thingstocarry) {
		this.thingstocarry = thingstocarry;
	}


	public String getPickupanddroplocation() {
		return pickupanddroplocation;
	}


	public void setPickupanddroplocation(String pickupanddroplocation) {
		this.pickupanddroplocation = pickupanddroplocation;
	}


	public int getGuideId() {
		return guideId;
	}


	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}


	public String getGuideName() {
		return guideName;
	}


	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}


	public String getPhoto1() {
		return photo1;
	}


	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}


	public String getPhoto2() {
		return photo2;
	}


	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}


	public String getPhoto3() {
		return photo3;
	}


	public void setPhoto3(String photo3) {
		this.photo3 = photo3;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}
}
