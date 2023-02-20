package practice_4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("practice4.xml");
		
		// retrieve the bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		// call a method from the bean
		System.out.println(theCoach.getSportsmanStatus());
		
		// close the bean 
		context.close();
	}

}
