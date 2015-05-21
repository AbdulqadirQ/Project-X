//Class holds mathematical formulae and other operations
public class Formula {
	
	//Quadratic equation formula
	double[] quadraticEquation(double a, double b, double c){

		double[] x = {-999, -999}; // changed this and return type to a 1D double array due to 2 outputs
		double d = Math.pow(b, 2) - 4*a*c;
		
		if(d == 0){
			
			x[0] = -b/2*a;
			x[1] = x[0];
			
		}else if(d > 0){
			
			x[0] = (-b + Math.sqrt(d)) / (2*a);
			x[1] = (-b - Math.sqrt(d)) / (2*a);
			
		}

		
		return x;		
	
	}
	
	
}
/*
***** Test Cases - Quadratic Formula: *****

FOR d = 0 - INPUT: a = 1, b = 4, c = 4    OUTPUT: x1 = -2,   x2 = 2     
FOR d > 0 - INPUT: a = 1, b = 0, c = -4   OUTPUT: x1 = -2,   x2 = 2 
FOR d < 0 - INPUT: a = 4, b = 3, c = 1    OUTPUT: x1 = -999, x2 = -999 

*/