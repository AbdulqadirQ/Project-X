import java.util.ArrayList; 

//Class is only for testing purposes. 
public class PrimeTest
{	
	//Test Case. 
	public static void main(String[] args)
	{
		//testPrimeGen(); 
		testisPrime();
	}

	//Tests the PrimeGen Module. 
	private static void testPrimeGen()
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

	//Tests the isPrime Module. 
	private static void testisPrime()
	{
		//Create a new instance of the isPrime object. 
		isPrime is = new isPrime(); 
		//Store the value we want to test. 
		final int TOCHECK = 7; 
		//Run the algorithm and store the result. 
		boolean result = is.checkPrime(TOCHECK); 

		//True indicates the value is prime, false otherwise. 
		if(result)
		{
			System.out.println(TOCHECK + " is prime."); 
		}
		else
		{
			System.out.println(TOCHECK + " is not prime."); 
		}
	}
}