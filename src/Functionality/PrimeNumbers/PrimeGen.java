
public class PrimeGen
{	
	//Generate prime number up to a limit. 
	public ArrayList<Integer> generate(int n)
	{
		ArrayList<Integer> list = genList(n); 
		
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