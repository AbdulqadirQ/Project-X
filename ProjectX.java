
public class ProjectX {

	public static void main(String[] args)
	{

		Formula form = new Formula();
		
		double[] arr = new double[1];
		arr = form.quadraticEquation(4, 3, 1);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
