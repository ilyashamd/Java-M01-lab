
import java.util.Scanner;

public class part2_exp{
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
				
		System.out.print("Please, enter an integer number: ");
		int n = input.nextInt();
		
		System.out.println("The exponential of"+n+" is: "+exp(n)+"\n");
		
	}
	
	static double exp (int x){
		double result=1;
		for(int i=1; i<=15; i++){
			double _x=x;
			result+=(Math.pow(_x,i)/fact(i));
		}
		return result;
	}
	
	static int fact(int x){
		if (x<=1)
			return 1;
		else 
			return x*fact(x-1);

	}
}