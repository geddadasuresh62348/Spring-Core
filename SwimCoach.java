package propertiesUsingAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCoach")
public class SwimCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	@Override
	public String getDailyWork() {
		return "swimcoach";
	}
	
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// getter methods for literal values
	public String getEmail() {
		return email;
	}
	
	public String getName() {
		return name;
	}
	
	

}
