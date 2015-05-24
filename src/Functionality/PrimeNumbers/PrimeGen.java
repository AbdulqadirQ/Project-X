import java.util.ArrayList; 

public class PrimeGen
{	
	//Generate prime number up to a limit. 
	public ArrayList<Integer> generate(int n)
	{
		ArrayList<Integer> list = genList(n); 
		for(int i=0; i<list.size(); i++)
		{
			Integer currentVal = list.get(i); 

			for(int j=i+1; j<list.size(); j++)
			{
				if(list.get(j)%currentVal==0)
				{
					list.remove(j); 
				}
			}

			//System.out.println(list.get(i)); 
		}

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


	public static void main(String[] args)
	{
		PrimeGen gen = new PrimeGen(); 
		ArrayList<Integer> arr = gen.generate(100);

		for(int i=0; i<arr.size(); i++)
		{
			System.out.println(arr.get(i)); 
		} 
	}
}