package myproject.helloapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myproject.helloapp.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/myproject/helloapp/resources/applicationContext.xml");
		HelloBean bean = (HelloBean)context.getBean("helloBean");
		System.out.println(bean.sayHello());
	}
}
