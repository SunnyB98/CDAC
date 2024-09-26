package Que;

public class Q6_SquareRoot {
	
	public static float sqrt(float x) {
		return sqrt(x,0,1);
		
	}
	public static float sqrt(float x,float guess, float step) {
		float square= guess*guess;
		if(x==square) {
			return guess;
		}
		if(square > x) {
			if(step > 0.000001) {
				return sqrt(x,guess-step,step/10);
			}else {
				return guess-step;
			}
		}else {
			return sqrt(x, guess+step,step);
		}
	}

	public static void main(String[] args) {
		
		System.out.println((int)sqrt(27));
	}

}
