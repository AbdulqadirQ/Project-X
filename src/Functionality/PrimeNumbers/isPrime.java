import java.util.ArrayList; 

public class isPrime
{
	public boolean checkPrime(int toCheck)
	{
		//Create a new instance of the PrimeGen class. 
		PrimeGen gen = new PrimeGen(); 
		//Run the generate algorithm and pass toCheck + 1 
		//Algorithm will find all prime numbers from 2 to toCheck+1
		ArrayList<Integer> list = gen.generate(toCheck+1); 

		//From the end of the list until the start. 
		for(int i=list.size()-1; i>=0; i--)
		{
			//If the current item is toCheck then return true. 
			if(list.get(i) == toCheck) { return true; }
		}

		//Return false if we get to this point. 
		return false; 
	}
}