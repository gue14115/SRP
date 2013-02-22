package main;
import vidovic.*;
public class Judge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void judge(String p1, String p2)
	{
		switch(p1)
		{
		case "s":
			switch(p2)
			{
			case "s":
				System.out.println("Draw");
				break;
			case "r":
				System.out.println("P2 Wins");
				break;
			case "p":
				System.out.println("P1 Wins");
				break;
			}
			break;
		case "r":
			switch(p2)
			{
			case "s":
				System.out.println("P1 Wins");
				break;
			case "r":
				System.out.println("Draw");
				break;
			case "p":
				System.out.println("P2 Wins");
				break;
			}
			break;
		case "p":
			switch(p2)
			{
			case "s":
				System.out.println("P2 Wins");
				break;
			case "r":
				System.out.println("P1 Wins");
				break;
			case "p":
				System.out.println("Draw");
				break;
			}
			break;
		}
	}
}
