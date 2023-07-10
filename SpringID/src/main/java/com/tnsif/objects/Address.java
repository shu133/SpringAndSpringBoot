package com.tnsif.objects;
//program to demonstrate on DI in the form of objects

public class Address {
	//private data members
		String city="Pune";
		String area="Kothrud road";
		long pincode=423457;
		
		
		
		public void display()
		{
			System.out.println(city+ " "+area+" "+pincode);
		}

}
