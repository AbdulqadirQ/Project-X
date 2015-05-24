// test components and/or modules here.
// do not change code, change input
import java.util.Scanner;
public class Test { 
	

	// main method for tests
	public static void main(String[]args){
		System.out.println("Running Test...");
		get_Input_Data();

	}

	
	// print an array
	public static void print(double[] arr){
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);	
		}	
	}


	// get input for quadratic equation tests
	public static double a, b, c;
	public static void get_Input_Data(){
			Scanner scan = new Scanner(System.in);
			System.out.println("a=");
			a = scan.nextDouble();

			System.out.println("b=");
			b = scan.nextDouble();

			System.out.println("c=");
			c = scan.nextDouble();

			// run formula
			quadratic_Module.quadratic_Equation_Module(a, b, c);
	}




}
/* DELETE LATER
***** Test Cases - Quadratic Formula: *****

FOR d = 0 - INPUT: a = 1, b = 4, c = 4    OUTPUT: x1 = -2,   x2 = 2     
FOR d > 0 - INPUT: a = 1, b = 0, c = -4   OUTPUT: x1 = -2,   x2 = 2 
FOR d < 0 - INPUT: a = 4, b = 3, c = 1    OUTPUT: x1 = -999, x2 = -999 

*/