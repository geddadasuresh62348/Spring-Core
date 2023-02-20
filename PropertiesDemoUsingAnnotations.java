package propertiesUsingAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesDemoUsingAnnotations {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("propertiesfile.xml");
		
		// get the bean from the spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		// call methods using bean
		System.out.println(theCoach.getDailyWork());
		
		// calling injected bean methods
		System.out.println(theCoach.getDailyFortune());
		
		// calling properties

		//close the context
		context.close();
		
		
	}

}
