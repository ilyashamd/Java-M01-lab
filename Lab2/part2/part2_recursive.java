
import java.util.Scanner;

public class part2_recursive{
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
				
		System.out.print("Please, enter an integer number: ");
		int n = input.nextInt();
		
		System.out.println("The factorial of"+n+" is: "+fact(n)+"\n");
		
	}
	
	static int fact(int _n){
		if (_n<=1)
			return 1;
		else 
			return _n*fact(_n-1);

	}
}