import java.util.Scanner;

public class part2{
	
	public static void main(String[] args){
		int max=-50000;
		int min=50000;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter three integer numbers: ");
		int i1 = input.nextInt();
		int i2 = input.nextInt();
		int i3 = input.nextInt();
		
		int avg=(i1+i2+i3)/3;
		
		if(i1>max)	max=i1;
		if(i2>max)	max=i2;
		if(i3>max)	max=i3;
		
		if(i1<min)	min=i1;
		if(i2<min)	min=i2;
		if(i3<min)	min=i3;
		
		System.out.println("The average is: "+avg"\n");
		System.out.println("The greatest number is: "+max"\n");
		System.out.println("The smallest number is: "+min"\n");
	}
}