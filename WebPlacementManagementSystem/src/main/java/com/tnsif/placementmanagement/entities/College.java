package com.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	//private data members
		@Id
		private Integer id;
		private String collegename;
		private String location;
		
		
		//setters and getters 
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getCollegename() {
			return collegename;
		}
		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		//Default constructor
		public College() {
			System.out.println("Demonstration on SpringBoot-REST API");
		}
		//parameterized constructor
		public College(Integer id, String collegename, String location) {
			super();
			this.id = id;
			this.collegename = collegename;
			this.location = location;
		}
		@Override
		public String toString() {
			return "College [id=" + id + ", collegename=" + collegename + ", location=" + location + "]";
		}

}
