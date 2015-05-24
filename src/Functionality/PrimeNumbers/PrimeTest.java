import java.util.ArrayList; 

public class PrimeTest
{	
	//Test Case. 
	public static void main(String[] args)
	{
		//Create a new instance of the PrimeGen Object. 
		PrimeGen gen = new PrimeGen(); 
		//Set the limit of the algorithm. 
		final int LIMIT = 100; 
		//Run the algorithm and store in the array list. 
		ArrayList<Integer> arr = gen.generate(LIMIT);

		//For each value..
		for(int i=0; i<arr.size(); i++)
		{	
			//Print. 
			System.out.println(arr.get(i)); 
		} 
	}
}