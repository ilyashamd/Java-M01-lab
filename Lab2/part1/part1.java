
import java.util.Scanner;

public class part1{
	
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args){
		
		int max,min;
		
		System.out.print("Please, enter three integer numbers: ");
		int i1 = input.nextInt();
		int i2 = input.nextInt();
		int i3 = input.nextInt();
		
		max=maxInt(i1,i2);
		max=maxInt(max, i3);

		System.out.println("The greatest number is: " +max +"\n");
	}
	
	static int maxInt(int x, int y){
	if (x>y)	return x;
	else 		return y;
	}
}