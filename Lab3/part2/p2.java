import java.util.Scanner;

public class p2{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){	
		Complex c1,c2;	
		println("Complex Arithmetic");
		println("******************");
		print("Enter the first complex number (RelPart, ImgPart): ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		print("Enter the second complex number (RelPart, ImgPart): ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();

		c1=new Complex(x1,y1);
		c2=new Complex(x2,y2);

		println("\nSelect one Operation");
		println("******************");
		println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Magnitude and phase");
		print("\nYour choice : ");	
		int choice=input.nextInt();

		if(choice==1){
			Complex c=Complex.add(c1,c2);
			print("\nAnswer : "+c.x+" + j "+c.y+"\n");
		}
		else if(choice==2){
			Complex c=Complex.sub(c1,c2);
			print("Answer : "+c.x+" + j "+c.y+"\n");
		}
		else if(choice==3){
			Complex c=Complex.mult(c1,c2);
			print("Answer : "+c.x+" + j "+c.y+"\n");
		}
		else if(choice==4){
			Complex c=Complex.div(c1,c2);
			print("Answer : "+c.x+" + j "+c.y+"\n");
		}
		else if(choice==5){
			double d1=Complex.mag(c1);
			double d2=Complex.phase(c1);
			print("Answer : Mag = "+d1+"\t  Phase = "+d2+"\n");

			double dd1=Complex.mag(c2);
			double dd2=Complex.phase(c2);
			print("Answer : Mag = "+dd1+"\t  Phase = "+dd2+"\n");
		}

	}

	public static void println(String s){
		System.out.println(s);
	}
	public static void println(double i){
		System.out.println(i);
	}
	
	public static void println(boolean b){
		System.out.println(b);
	}

	public static void print(String s){
		System.out.print(s);
	}
}


class Complex{
	double x,y;

	Complex(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public static Complex conj (Complex c){
		return new Complex(c.x, -c.y);
	}
	
	public static Complex add (Complex c1, Complex c2){
		return new Complex(c1.x+c2.x, c1.y+c2.y);
	}

	public static Complex sub (Complex c1, Complex c2){
		return new Complex(c1.x-c2.x, c1.y-c2.y);
	}

	public static Complex mult (Complex c1, Complex c2){
		return new Complex((c1.x*c2.x)-(c1.y*c2.y), (c1.x*c2.y)+(c1.y*c2.x));
	}

	public static Complex div (Complex c1, Complex c2){
		Complex dum1= mult(c1, conj(c2));
		Complex dum2= mult(c2, conj(c2));
				
		return new Complex(dum1.x/dum2.x, dum1.y/dum2.x);
	}

/*	public static void div (double i){
		this.x/=i;
		this.y/=i;
	}
*/
	public static double mag (Complex c){
		return c.x*c.x + c.y*c.y;
	}
	
	public static double phase (Complex c){
		return Math.tan(c.y/c.x);
	}
	
}



















