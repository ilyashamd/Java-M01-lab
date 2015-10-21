
import java.util.Scanner;

public class part2_nonRecursive{
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
				
		System.out.print("Please, enter an integer number: ");
		int n = input.nextInt();
		
		System.out.println("The factorial of"+n+" is: "+fact(n)+"\n");
		
	}
	
	static int fact(int _n){
		int result=1;
		for (int i=1; i<=_n;i++){
			result*=i;
		}
			
		
		return result;
	}
}