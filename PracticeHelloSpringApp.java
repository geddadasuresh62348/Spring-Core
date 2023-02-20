package practice_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from the spring container
		Coach theCoach=context.getBean("volleyballCoach",Coach.class);
		
		// call methods on bean
		System.out.println(theCoach.getDailyWork());
		//close the context
		context.close();
	}

}
