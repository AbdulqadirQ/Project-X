import java.util.ArrayList; 

//Class implements the sieve of erathones algorithm to find prime numbers up to a certain limit. 
public class PrimeGen
{	
	//Generate prime number up to a limit. 
	public ArrayList<Integer> generate(int n)
	{
		//Call the genList function to population the list with all numbers up to n. 
		ArrayList<Integer> list = genList(n); 

		//For each value in the list. 
		for(int i=0; i<list.size(); i++)
		{	
			//Store the current value 
			Integer currentVal = list.get(i); 

			//For the rest of the lists. 
			for(int j=i+1; j<list.size(); j++)
			{
				//If the current list value is fully divisible from the currrent value
				if(list.get(j)%currentVal==0)
				{
					//Remove the value from the list as it is a composite number. 
					list.remove(j); 
				}
			}
		}
		//Return the list. 
		return list; 
	}

	//Generate a list from 2 to n. 
	private ArrayList<Integer> genList(int n)
	{
		//Create a array list of integer. 
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		//For each number from 2 to n add to list. 
		for(int currentNumber=2; currentNumber<n; currentNumber++)
		{
			//Add to array list. 
			list.add(currentNumber); 
		}
		//Return list. 
		return list; 
	}
}