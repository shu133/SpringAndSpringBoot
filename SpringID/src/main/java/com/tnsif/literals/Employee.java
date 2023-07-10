package com.tnsif.literals;
/*program to demonstrate on the dependency Injection in the form of literals
*
*/

public class Employee {
	//private data members
		//DI in the form of literals
		private int empid;
		private String empname;
		private String address;
		private float salary;
		
		/*if we are achieving DI using setters then use <property tag 
		 * in literals file*/
		
		//getters and setters
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		
		//using constructor
		public Employee(int empid, String empname, String address, float salary) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.address = address;
			this.salary = salary;
		}
		public void print() {
			System.out.println("emp ID:"+empid+" Emp Name: "+empname+" Emp Address: "
					+address+" Salary: "+salary);
			
		}

}
