import java.util.Scanner;

public class part5{
	
	public static void main(String[] args){
		int b,c,d;		//nb=bcd
		int dum;		//a dummy variable
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter an integer number: ");
		int i = input.nextInt();
		
		dum i=i%100;
		b=i/100;
		
		d=dum%10;
		c=dum/10;
		
		System.out.println(b+c+d+"\n");
		
	}
}