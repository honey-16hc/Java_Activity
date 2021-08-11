package activity3.Problem3;

public class TestMatch extends Match {

	public TestMatch(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
		
	}

	@Override
	float calculateRunRate() {
		float run = (getTarget()-getCurrentscore())/(90-getCurrentover());
		return run;
	}

	@Override
	int calculateBalls() {
		int ball = (int) ((90-getCurrentover()) * 6);
		return ball;
	}

	@Override
	void display(double reqRunrate, int balls) {
	
		System.out.println("Requirements: " + "\n" + " Need " + (getTarget()-getCurrentscore()) +" runs in " +  balls + " balls"+ "\n" + "Required Runrate: " + reqRunrate );

	}

}
