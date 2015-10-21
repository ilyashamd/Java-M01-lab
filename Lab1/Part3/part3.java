/* Writing a Java program which accepts from the user three integer numbers then returns
 the greatest, the smallest and the average of these numbers. */

import java.util.Scanner;

public class part3{
	
	public static void main(String[] args){
		int max, min;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter three integer numbers: ");
		int i1 = input.nextInt();
		int i2 = input.nextInt();
		int i3 = input.nextInt();
		
		int avg=(i1+i2+i3)/3;
		
		if(i1>i2)	max=i1;
		else 		max=i2;
		if(i3>max)	max=i3;
		
		if(i1<i2)	min=i1;
		else		min=i2;
		if(i3<min)	min=i3;
		
		System.out.println("The average is: "+avg+"\n");
		System.out.println("The greatest number is: " +max +"\n");
		System.out.println("The smallest number is: " +min +"\n");
	}
}


}