package com.tnsif.autowiremodes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*program to demonstrate on autoWiring modes*/
//driver class

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		TextEditor t=(TextEditor) a.getBean("text");
		t.display();

	}

}
