import java.util.Scanner;

public class PartA{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
		Fan f1=new Fan();
		f1.setSpeed(3);
		f1.setRadius(10.0);
		f1.setColor("yellow");
		f1.setOn(true);

		Fan f2=new Fan();
		f2.setSpeed(2);
		f2.setRadius(5.0);
		f2.setColor("blue");
		f2.setOn(false);

		System.out.println(f1);
		System.out.println(f2);
	}

}
//////////////////////////////////////////////
class Fan{
  final int SLOW=1;
  final int MEDIUM=2;
  final int FAST=3;
  private int speed;
  private boolean on;
  private double radius;
  private String color;

  Fan(){
    speed=SLOW;
    on=false;
    radius=5.0;
    color="blue";
  }

  public int getSpeed(){
    return speed;
  }

  public void setSpeed(int speed){
    this.speed=speed;
  }

  public boolean getOn(){
    return on;
  }

  public void setOn(boolean on){
    this.on=on;
  }

  public double getRadius(){
    return radius;
  }

  public void setRadius(double radius){
    this.radius=radius;
  }

  public String getColor(){
    return color;
  }

  public void setColor(String color){
    this.color=color;
  }

  public String toString(){
    String info="";
    if (on){
      info+="fan Speed: "+speed;
      info+=", color: "+color;
      info+=", radius: "+radius;
    }
    else{
      info+="color: "+color;
      info+=", radius: "+radius;
      info+=", fan is off";
    }
    return info;
  }
}
