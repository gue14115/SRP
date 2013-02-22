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
		
		vidovic.Bot vB1=new vidovic.Bot();
		vidovic.Bot vB2=new vidovic.Bot();
		
		dummy.Rock rock=new dummy.Rock();
		dummy.RockSciscors rockSciscors=new dummy.RockSciscors();
		dummy.RockSciscorsPaper rsp=new dummy.RockSciscorsPaper();
		
		for(int i=0;i<1000;i++)
			judge(r1.calculateTurn(),r2.calculateTurn());
		System.out.println("RandomBot "+a1+" to "+a2+" RandomBot");
		
		a1=0; a2=0;
		
		for(int i=0; i<1000; i++)
		{
			String p1=vB1.calculateTurn();
			String p2=rsp.calculateTurn();
			if(i<2)
				System.out.println(p1);
			judge(p1, p2);
			vB1.statistics(p2);
		}
		System.out.println("vidovic.Bot1 "+a1+" to "+a2+" RockSciscorsPaper");
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
		//System.out.println(result);
	}
}
