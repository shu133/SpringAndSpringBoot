package com.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Placement {
	//private data members
		@Id
		private Integer id;
		private String name;
		private Integer date;
		private String qualification;
		private Integer year;
		
		//getters and setters
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getDate() {
			return date;
		}

		public void setDate(Integer date) {
			this.date = date;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}
		
		//Default Constructor
		public Placement() {
			System.out.println("Demonstration on SpringBoot-REST API");
		}

		//parameterized constructor
		public Placement(Integer id, String name, Integer date, String qualification, Integer year) {
			super();
			this.id = id;
			this.name = name;
			this.date = date;
			this.qualification = qualification;
			this.year = year;
		}

		@Override
		public String toString() {
			return "placement [id=" + id + ", name=" + name + ", date=" + date + ", qualification=" + qualification
					+ ", year=" + year + "]";
		}
		

}
