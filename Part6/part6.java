public class part6{
	
	public static void main(String[] args){
		int b,c,d;		//nb=bcd
		int dum;		//a dummy variable
		
		int counter=0;
		for(int i=100; i<1000;i++){
			dum i=i%100;
			b=i/100;
		
			d=dum%10;
			c=dum/10;
			
			if(i==b*b*b+c*c*c+d*d*d) {
				System.out.println(i);
				counter++;
			}
		}
		System.out.println("The number of Armstrong numbers is: "+counter);
		
	}
}