package anil;

import java.util.Random;

public class RandomBot {
	
	public String calculateTurn()
	{
		String turn="";
		Random r= new Random();
		r.nextInt(3);
		switch (r.nextInt(3)) {
		case 0:
			turn = "s";
			break;
		case 1:
			turn = "r";
			break;
		case 2:
			turn = "p";
			break;
		}
		return turn;
	}

}
