/* Problem: Write a method which sorts in increasing order the elements of an integer array of length N */

import java.util.Scanner;

public class part4{
	static Scanner input= new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.print("Pleas, Enter the length of the array: ");
		int d = input.nextInt();
		int []array= new int [d];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<d; i++){
			array[i]=input.nextInt();
		}
		sortArray(array);
		showArray(array);	
	}
	
	static void showArray(int []_array){
		int n=_array.length;
		System.out.print("[ ");
		for(int i=0; i<n; i++){
			System.out.print(_array[i]+"  ");
		}
		System.out.println("]");
	}
	
	static void sortArray(int[]_array){
		int n=_array.length;
		boolean flag=false;
		while(!flag){
			flag=true;
			for(int i=0; i<n-1; i++){
				if(_array[i]>_array[i+1]){
					flag=false;
					int dummy=_array[i+1];
					_array[i+1]=_array[i];
					_array[i]=dummy;
				}
			}
		}
	}
}
