import java.util.Scanner;

public class PartD{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
    LinearEquation eq;
    double a,b,c,d,e,f;
		System.out.println("\nLinear Equations Demo");
    System.out.println("****************************\n");

// first senario
/*
    System.out.println("aX+bY=e \ncX+dY=f\n");
    System.out.print("Enter a, b, c, d, e, and f: ");
    a=input.nextDouble();
    b=input.nextDouble();
    c=input.nextDouble();
    d=input.nextDouble();
    e=input.nextDouble();
    f=input.nextDouble();
*/

// second senario
    System.out.println("The two endpoints for the first line segment are (x1, y1) and (x2, y2)");
    System.out.println("For the second line segment are (x3, y3) and (x4, y4)\n");
    System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, and y4 to displays the intersecting point: ");
    double x1=input.nextDouble();
    double y1=input.nextDouble();
    double x2=input.nextDouble();
    double y2=input.nextDouble();
    double x3=input.nextDouble();
    double y3=input.nextDouble();
    double x4=input.nextDouble();
    double y4=input.nextDouble();
    a=(y2-y1)/(x2-x1);
    b=-1;
    c=(y4-y3)/(x4-x3);
    d=-1;
    e=a*x2-y2;
    f=c*x4-y4;

    eq=new LinearEquation(a,b,c,d,e,f);
    if (eq.isSolvable()){
      System.out.println("\nX= "+eq.getX());
      System.out.println("Y= "+eq.getY());
    }
    else{
      System.out.println("\nThe equation has no solution");
    }

	}

}
//////////////////////////////////////////////
class LinearEquation{
  private double a,b,c,d,e,f;

  LinearEquation(double a, double b, double c, double d, double e, double f){
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;
    this.e=e;
    this.f=f;
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

  public double getD(){
    return d;
  }

  public void setD(double d){
    this.d=d;
  }

  public double getE(){
    return e;
  }

  public void setE(double e){
    this.e=e;
  }
  public double getF(){
    return f;
  }

  public void setF(double f){
    this.f=f;
  }

  public boolean isSolvable(){
    if ((a*d-b*c) == 0)
      return false;
    return true;
  }

  public double getX(){
    return (f-d*e/b)/(c-a*d/b);
  }

  public double getY(){
    return (f-c*e/a)/(d-b*c/a);
  }
}
