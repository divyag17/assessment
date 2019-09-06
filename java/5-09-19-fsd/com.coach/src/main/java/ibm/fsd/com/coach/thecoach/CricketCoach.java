package ibm.fsd.com.coach.thecoach;

import ibm.fsd.com.thecoachInterface.Coach;
import ibm.fsd.com.thecoachInterface.FortuneService;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	private String email;
	private String teamName;
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return " workout";
	}
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
}
