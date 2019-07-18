package com.mastek.training.sport.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity 
@Table (name="JPA_VENUE")
@Scope("prototype")
public class Venue implements Serializable{

	private int venueId;
	private String venueName;
	private String venueLocation;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getVenueId() {
		return venueId;
	}
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	
	public String getVenueName() {
		return venueName;
	}
	@Override
	public String toString() {
		return "Venue [venueId=" + venueId + ", venueName=" + venueName + ", venueLocation=" + venueLocation + "]";
	}
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	
	public String getVenueLocation() {
		return venueLocation;
	}
	public void setVenueLocation(String venueLocation) {
		this.venueLocation = venueLocation;
	}
	
	
	
}
