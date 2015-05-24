// Class holds mathematical formulae and other operations
class Formula 
{
	// Quadratic equation formula
	public static double[] quadraticEquation(double a, double b, double c)
	{ //Take in three variables as parameters

		double[] solution = {-999, -999}; // changed this and return type to a 1D double array due to 2 outputs
		double d = Math.pow(b, 2) - 4*a*c;
		
		if(d == 0)
		{
			solution[0] = -b/2*a;
			solution[1] = solution[0];			
		}
		else if(d > 0)
		{
			solution[0] = (-b + Math.sqrt(d)) / (2*a);
			solution[1] = (-b - Math.sqrt(d)) / (2*a);
		}
		// output values in array solution
		return solution;		
	}
	// CREATE BREAK EACH FORMULA -------------------------------------------------------------------------------
}