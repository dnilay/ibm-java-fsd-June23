package org.example.model;

public class BasketBallCoach implements Coach{
	
	private FortuneService fortuneService;

	
	


	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice nack volley today";
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
