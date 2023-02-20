package practice_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("firingCoach")
public class FiringCoach implements Coach {
	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;
	
	public FiringCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "FiringCoach";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
