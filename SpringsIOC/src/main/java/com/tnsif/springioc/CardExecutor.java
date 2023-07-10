package com.tnsif.springioc;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CardExecutor {
public static void main(String[] args) {
		
		//hard coding
		/*
		SBICard s=new SBICard();
		HDFCCard h=new HDFCCard();
		s.deposit();
		s.withdraw();
		h.deposit();
		h.withdraw();
		*/
		
		BeanFactory b=new ClassPathXmlApplicationContext("beans.xml");
		
		/*SBICard s=(SBICard) b.getBean("sbi");
		s.deposit();
		s.withdraw();
		
		HDFCCard h=(HDFCCard) b.getBean("hdfc");
		h.deposit();
		h.withdraw();*/
		
		DebitCard s1=(DebitCard) b.getBean("sbi");
		s1.deposit();
		s1.withdraw();
		

	}

}
