public class PartB{


	public static void main(String[] args){
		RegularPolygon p1=new RegularPolygon();
    RegularPolygon p2=new RegularPolygon(6,4);
    RegularPolygon p3=new RegularPolygon(10, 4, 5.6 ,7.8);

    System.out.println("Object nb 1");
    System.out.println(p1.getPerimeter());
    System.out.println(p1.getArea());
    System.out.println("Object nb 2");
    System.out.println(p2.getPerimeter());
    System.out.println(p2.getArea());
    System.out.println("Object nb 3");
    System.out.println(p3.getPerimeter());
    System.out.println(p3.getArea());
	}

}
//////////////////////////////////////////////
class RegularPolygon{
  private int n;
  private double side;
  private double x;
  private double y;

  RegularPolygon(){
    n=3;
    side=1.0;
    x=0.0;
    y=0.0;
  }
  RegularPolygon(int n, double side){
    this.n=n;
    this.side=side;
    x=0.0;
    y=0.0;
  }
  RegularPolygon(int n, double side, double x, double y){
    this.n=n;
    this.side=side;
    this.x=x;
    this.y=y;
  }

  public int getN(){
    return n;
  }

  public void setN(int n){
    this.n=n;
  }

  public double getX(){
    return x;
  }

  public void setX(double x){
    this.x=x;
  }
  public double getY(){
    return y;
  }

  public void setY(double y){
    this.y=y;
  }
  public double getSide(){
    return side;
  }

  public void setSide(double side){
    this.side=side;
  }

  public double getPerimeter(){
    return n*side;
  }

  public double getArea(){
      return ((n*side*side)/(4*Math.tan(Math.PI/n)));
  }
}
