package generic;



public class Utility {

	
	public static int getRandomNumber(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	
	
	

}
