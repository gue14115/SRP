package vidovic;

import java.util.Random;

public class Bot {
	public static int r=1;
	public static int s=1;
	public static int p=1;
	
	public String calculateTurn()
	{
		String turn="";
		int sum=r+s+p;
		Random rnd=new Random();
		int num=rnd.nextInt(sum);
		if(num<=r)
			turn="p";
		if(num>r && num<=r+s)
			turn="r";
		if(num>r+s)
			turn="s";
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
