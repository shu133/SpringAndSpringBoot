package com.tnsif.objects;
//program to demonstrate on DI in the form of objects

public class Student {
	//DI in the form of object
		Address address;

		//Achieving DI using constructor
		public Student(Address address) {
			super();
			this.address = address;
		}
		
		public void print()
		{
			//we are calling display() method of Address class here
			address.display();
		}

}
