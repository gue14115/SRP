package vidovic;

import java.util.Random;

public class Bot {
	public static int r=0;
	public static int s=0;
	public static int p=0;
	
	public String calculateTurn()
	{
		String turn="";
		int sum=r+s+p;
		Random rnd=new Random();
		int num=rnd.nextInt(sum);
		if(num>10)
		{
			if(num<=r)
				turn="r";
			if(num>r && num<=r+s)
				turn="s";
			if(num>r+s)
				turn="p";
		}
		else
		{
			int num2=rnd.nextInt(100);
			if(num2<=33)
				turn="r";
			if(num2<=67)
				turn="s";
			if(num2<=100)
				turn="p";
		}
		return turn;
	}
	
	public void statistics(String a)
	{
		if(a.equals("r"))
			r++;
		if(a.equals("s"))
			s++;
		if(a.equals("p"))
			p++;
	}
	
}
