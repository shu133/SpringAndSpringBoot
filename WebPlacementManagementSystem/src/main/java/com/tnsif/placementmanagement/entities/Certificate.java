package com.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certificate {
	//Private database
		@Id
		private Integer id;
		private Integer year;
		
		//default constructor
		public Certificate() {
			System.out.println("Demonstration on SpringBoot - Rest API");
		}

		//Parameterized Constructor
		public Certificate(Integer id, Integer year) {
			super();
			this.id = id;
			this.year = year;
		}

		//getters and setters
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		//toString method
		@Override
		public String toString() {
			return "Certificate [id=" + id + ", year=" + year + "]";
		}

}
