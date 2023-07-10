package com.tnsif.autowireannotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Citizen {
	//DI in the form of objects
		private MunicipalCorporation mc;

		//DI using setters
		@Autowired
		@Qualifier("m2")
		public void setMc(MunicipalCorporation mc) {
			this.mc = mc;
		}
		
		public void display()
		{
			mc.coporate();
			System.out.println("Result: "+mc.getMayorName()+" "+mc.getArea());
		}

}
