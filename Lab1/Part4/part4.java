import java.util.Scanner;

public class part4{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter an integer number: ");
		int i = input.nextInt();
		
		int d=i%2;
		if(d==1) 	System.out.println("The number is an odd number\n");
		else 		System.out.println("The number is an even number\n");
		
	}
}