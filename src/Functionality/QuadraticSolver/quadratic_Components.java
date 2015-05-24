/*
	Class provides the application with a way to compute a solutions to a quadratic equation. 
	Error Handling, Computation and output are all handled here. 
*/
class quadratic_Components extends Quadratic_Error_Handling 
{
	/* Error Handling Component 
	 * Checks parameters for invalid values. 
	 * returns double array of values
	 */
	protected static double[] input_Component(double a, double b, double c)
	{
		//Holds the input values ready for validation. 
		double[] input = {a,b,c}; 
		
		// check valid is input, returns boolean value
		boolean is_valid = input_Component_Error_Handling(input);
		
		//Return the array if is_valid is true 
		return input;
	}
	
	
	/* Quadratic component computes a solution to the parameters. 
	 * returns array containing solutions
	 */
	protected static double[] quadratic_Component(double[] input)
	{
		//Find a solution to the quadratic equation parameters. 
		double[] solution = Formula.quadraticEquation(input[0], input[1], input[2]);	
		//Return array 
		return solution;	
	}
	
	/* Output Component 
	 * links to graphical interface
	 * passes solution array to GUI
	 */
	protected static double[] output_Component(double[] solution)
	{
		// or test purposes print
		Test.print(solution);
		return solution;
	}
}
