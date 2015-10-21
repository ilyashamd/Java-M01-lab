/*
Writing a Java program that calculates and displays the circumference
and the area of a circle of a given diameter.

*/

import java.util.Scanner;

public class part2 {
	public static void main(String[] args){
        double diameter, circum, area;
        
        System.out.print("Enter the circel diameter: ");
        Scanner number = new Scanner(System.in);
        
		diameter = number.nextDouble();
        circum = 2*diameter*Math.PI;
        area = Math.pow(diameter, 2)*Math.PI;
		
        System.out.println("the area is:"+ area);
        System.out.println("the circumeference is:"+ circum);
	}	
}
