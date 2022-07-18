package ex4;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex2.Stock;

public class TestStock {
	
	
	public TestStock() {
		ApplicationContext appCtx = new ClassPathXmlApplicationContext("appctx.xml");
		Stock s1 = (Stock) appCtx.getBean("stk");
		Stock s2 = appCtx.getBean(Stock.class, "stk");
		System.out.println(s1 == s2);
		}
	

}
