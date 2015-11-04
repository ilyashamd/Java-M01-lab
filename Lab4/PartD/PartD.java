import java.util.Scanner;

public class PartD{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
    LinearEquation eq;

		System.out.println("\nLinear Equations Demo");
    System.out.println("****************************\n");

    System.out.println("aX+bY=e \ncX+dY=f\n");
    System.out.print("Enter a, b, c, d, e, and f: ");
    double a=input.nextDouble();
    double b=input.nextDouble();
    double c=input.nextDouble();
    double d=input.nextDouble();
    double e=input.nextDouble();
    double f=input.nextDouble();

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
    if (a*d==0 || c*d==0)
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
