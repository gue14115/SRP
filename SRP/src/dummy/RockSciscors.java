package dummy;

public class RockSciscors {

	int count=5;
	int i=0;
	
	public String calculateTurn()
	{
		if(i<=count)
		{
			i++;
			return "r";
		}
		else
		{
			i++;
			if(i==count*2)
				i=0;
			return "s";
		}
		
	}

}
