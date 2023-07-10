package com.tnsif.literals;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*program to demonstrate on the dependency Injection in the form of literals
 * Driver class
 */

public class DIUsingLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a = new ClassPathXmlApplicationContext("literals.xml");
		Employee e =(Employee) a.getBean("e2");
		e.print();

	}

}
