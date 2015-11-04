import java.util.Scanner;

public class PartC{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
    QuadraticEquation eq;

		System.out.println("\nQuadratic Equations Demo");
    System.out.println("****************************\n");

    System.out.println("aX^2+bX+c=0");
    System.out.print("Enter a, b and c: ");
    double a=input.nextDouble();
    double b=input.nextDouble();
    double c=input.nextDouble();

    eq=new QuadraticEquation(a,b,c);
    if (eq.getDiscriminant()>0){
      System.out.println("\nRoot1: "+eq.getRoot1());
      System.out.println("Root2: "+eq.getRoot2());
    }
    else if (eq.getDiscriminant()==0) {
      System.out.println("\nRoot: "+eq.getRoot1());
    }
    else{
      System.out.println("\nThe equation has no roots");
    }

	}

}
//////////////////////////////////////////////
class QuadraticEquation{
  private double a,b,c;

  QuadraticEquation(double a, double b, double c){
    this.a=a;
    this.b=b;
    this.c=c;
  }

  public double getA(){
    return a;
  }

  public void setA(double a){
    this.a=a;
  }

  public double getB(){
    return b;
  }

  public void setB(double b){
    this.b=b;
  }
  public double getC(){
    return c;
  }

  public void setC(double c){
    this.c=c;
  }

  public double getDiscriminant(){
    return (b*b-(4.0*a*c)) ;
  }

  public double getRoot1(){
    if (getDiscriminant()<0)
      return 0;
    return (-b-Math.sqrt(getDiscriminant()))/(2.0*a);
  }
  public double getRoot2(){
    if (getDiscriminant()<0)
      return 0;
    return (-b+Math.sqrt(getDiscriminant()))/(2.0*a);
  }
}
