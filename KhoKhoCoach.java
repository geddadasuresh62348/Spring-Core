package practice_4;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class KhoKhoCoach implements Coach {

	@Override
	public String getSportsmanStatus() {
		return "He is retired";
	}
}
