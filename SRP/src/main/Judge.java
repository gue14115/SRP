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
		String result="Draw";
		switch(p1)
		{
		case "s":
			switch(p2)
			{
			case "r":
				result=("P2 Wins");
				break;
			case "p":
				result=("P1 Wins");
				break;
			}
			break;
		case "r":
			switch(p2)
			{
			case "s":
				result=("P1 Wins");
				break;
			case "p":
				result=("P2 Wins");
				break;
			}
			break;
		case "p":
			switch(p2)
			{
			case "s":
				result=("P2 Wins");
				break;
			case "r":
				result=("P1 Wins");
				break;
			}
			break;
		}
		System.out.println(result);
	}
}
