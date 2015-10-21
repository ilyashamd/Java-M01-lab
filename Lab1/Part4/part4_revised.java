/*
Writing a Java program that read an integer number and find whether it is odd or even.

*/
import javax.swing.JOptionPane;

public class part4_revised{
	
	public static void main(String[] args){
		String s;
		s=JOptionPane.showInputDialog("Please, enter an integer: ");
		int i = Integer.parseInt(s);
		
		int d=i%2;
		if(d==1) 	JOptionPane.showMessageDialog(null,"The number is an odd number\n", "part4_revised",JOptionPane.INFORMATION_MESSAGE);
		else 		JOptionPane.showMessageDialog(null,"The number is an even number\n", "part4_revised",JOptionPane.INFORMATION_MESSAGE);
		
	}
}