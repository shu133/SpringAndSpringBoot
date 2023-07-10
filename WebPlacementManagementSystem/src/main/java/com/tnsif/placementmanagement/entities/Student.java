package com.tnsif.placementmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	// private data members
			@Id
			private Integer id;
			private String name;
			private Integer roll;
			private String qualification;
			private String course;
			private Integer year;
			private Integer hallticketno;
			private String college;
			
			
			public Student(Integer id, String name, Integer roll, String qualification, String course, Integer year,
					Integer hallticketno, String college) {
				super();
				this.id = id;
				this.name = name;
				this.roll = roll;
				this.qualification = qualification;
				this.course = course;
				this.year = year;
				this.hallticketno = hallticketno;
				this.college = college;
			}


			public Student() {
				super();
				// TODO Auto-generated constructor stub
			}

			

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


			public Integer getRoll() {
				return roll;
			}


			public void setRoll(Integer roll) {
				this.roll = roll;
			}


			public String getQualification() {
				return qualification;
			}


			public void setQualification(String qualification) {
				this.qualification = qualification;
			}


			public String getCourse() {
				return course;
			}


			public void setCourse(String course) {
				this.course = course;
			}


			public Integer getYear() {
				return year;
			}


			public void setYear(Integer year) {
				this.year = year;
			}


			public Integer getHallticketno() {
				return hallticketno;
			}


			public void setHallticketno(Integer hallticketno) {
				this.hallticketno = hallticketno;
			}


			public String getCollege() {
				return college;
			}


			public void setCollege(String college) {
				this.college = college;
			}


			@Override
			public String toString() {
				return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", qualification=" + qualification
						+ ", course=" + course + ", year=" + year + ", hallticketno=" + hallticketno + ", college="
						+ college + "]";
			}

}
