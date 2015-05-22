// module class makes use of components to create modules		***UPDATE COUNTER - CLASS CONTAINS (1) MODULES***
public class quadratic_Module extends quadratic_Components 
{
	//(1) Quadratic equation module - components (1,2,3)
	public void quadratic_Equation_Module(double a, double b, double c)
	{
		// c1 ---> c2 ---> c3 ---> output
		//Parameters are checked for error handling, computed for a result and passed to ouput. 
		output_Component(quadratic_Component(error_Handling_Component(a,b,c)));
		
	}
	
}
