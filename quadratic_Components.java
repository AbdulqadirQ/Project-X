// class contains a list of components used by the module class		***UPDATE COUNTER - CLASS CONTAINS (3) COMPONENTS***
class quadratic_Components {
	
	
	/*(1) component 1 accepts input
	 * returns double array of values
	 */
	protected double[] error_Handling_Component(double a, double b, double c){
		
		double[] input = {a,b,c}; // holds the input values	
		return input;
	}
	
	
	
	/*(2) component 2 takes an array of values and applies quadratic formula
	 * returns array containing solution(s)
	 */
	protected double[] quadratic_Component(double[] input){
		
		// apply formula and hold output in new solution array
		double[] solution = Formula.quadraticEquation(input[0], input[1], input[2]);	
		return solution;	
	}
	
	
	
	/*(3) component 3 links to graphical interface
	 * passes solution array to GUI
	 */
	protected double[] output_Component(double[] solution){
		
		// for test purposes print
		Test.print(solution);
		return solution;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
