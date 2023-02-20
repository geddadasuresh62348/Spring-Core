package practice_5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("practice_5.xml");
		
		// retrieve the bean from the spring container
		Coach theCoach=context.getBean("firingCoach",Coach.class);
		
		// call the methods from bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
