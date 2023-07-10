package com.tnsif.objects;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingObjectsExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a=new ClassPathXmlApplicationContext("object.xml");
		Student s=(Student) a.getBean("s1");
		s.print();

	}

}
