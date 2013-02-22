package dummy;

public class RockSciscorsPaper {

	int count=5;
	int i=0;
	public String calculateTurn()
	{
		if(i<count)
		{
			i++;
			return "r";
		}
		if(i<count*2)
		{
			i++;
			return "s";
		}
		else
		{
			i++;
			if(i==count*3)
				i=0;
			return "p";
		}
			
	}

}
