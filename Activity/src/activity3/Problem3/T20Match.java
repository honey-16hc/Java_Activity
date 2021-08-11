package activity3.Problem3;

public class T20Match extends Match {

	
	public T20Match(int currentscore, float currentover, int target) {
		super(currentscore, currentover, target);
		
	}

	@Override
	float calculateRunRate() {
		float run = (getTarget()-getCurrentscore())/(20-getCurrentover());
		return run;
		
	}

	@Override
	int calculateBalls() {
		int ball = (int) ((20-getCurrentover()) * 6);
		return ball;
		
	}

	@Override
	void display(double reqRunrate, int balls) {
		System.out.println("Requirements: " + "\n" + " Need " + (getTarget()-getCurrentscore()) +" runs in " +  balls + " balls"+ "\n" + "Required Runrate: " + reqRunrate );

		
	}

}
