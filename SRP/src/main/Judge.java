package main;
import anil.RandomBot;
import vidovic.*;
public class Judge {

	static int a1=0;
	static int a2=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomBot r1=new RandomBot();
		RandomBot r2=new RandomBot();
		for(int i=0;i<1000;i++)
		judge(r1.calculateTurn(),r2.calculateTurn());
		System.out.println("RandomBot "a1+" to "+a2+" RandomBot");
	}

	public static void judge(String p1, String p2)
	{
		String result="Draw";
		switch(p1)
		{
		case "s":
			switch(p2)
			{
			case "r":
				result=("P2 Wins");
				a2++;
				break;
			case "p":
				result=("P1 Wins");
				a1++;
				break;
			}
			break;
		case "r":
			switch(p2)
			{
			case "s":
				result=("P1 Wins");
				a1++;
				break;
			case "p":
				result=("P2 Wins");
				a2++;
				break;
			}
			break;
		case "p":
			switch(p2)
			{
			case "s":
				result=("P2 Wins");
				a2++;
				break;
			case "r":
				result=("P1 Wins");
				a1++;
				break;
			}
			break;
		}
		System.out.println(result);
	}
}
