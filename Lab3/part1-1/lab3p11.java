import java.util.Scanner;

public class lab3p11{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		String brandName;
		int size;
		//Television tv1, tv2;
		
		/*println("Television Demo");
		println("***************");
		print("Enter the brand name : ");
		brandName=input.nextLine();
		print("Enter the size (inch): ");
		size=input.nextInt();*/
		
		Television tv1=new Television("Thomson", 55);
		Television tv2=new Television("LG", 62);

		tv1.togglePowerOnOff();
		tv1.setChannel(56);
		setVolume(tv1,21);
		showStatus(tv1);

		tv2.togglePowerOnOff();
		tv2.setChannel(7);
		setVolume(tv2,18);
		showStatus(tv2);
		
	}
	
	public static void showStatus(Television tv){
		println("\n Here is the state of your TV now: ");
		println("****************************************************");
		println("manufacturer = "+tv.getManufacturer());
		println("screenSize = "+tv.getScreenSize());
		println("powerOn = "+tv.getPowerOnOff());
		println("muteOn = "+tv.getMuteOnOff());
		println("channel = "+tv.getChannel());
		println("volume = "+tv.getVolume());
		println("****************************************************");
	}

	public static void setVolume(Television tv, int v){
		if(v<0) v=0;
		else if(v>100) v=100;

		if(v>tv.getVolume()){
			while(v!=tv.getVolume())
				tv.increaseVolume();
		}
		else if(v<tv.getVolume()){
			while(v!=tv.getVolume())
				tv.decreaseVolume();
		}
	}

	public static void println(String s){
		System.out.println(s);
	}
	public static void println(int i){
		System.out.println(i);
	}
	
	public static void println(boolean b){
		System.out.println(b);
	}

	public static void print(String s){
		System.out.print(s);
	}
}




//The purpose of this class is to model a television
//Engineer:		Ilyas Hamadouche
//date:			27/10/2015
class Television{
	String manufacturer; 	//the manufacturer name
	int screenSize;			// screen size (inch)
	boolean powerOn;		// 
	boolean muteOn;			//
	int channel;			//
	int volume;				//store the current volume
	int backupVolume;		//used to store the previous volume when muteOn
	
	Television(String brand, int size){
		manufacturer=brand;
		screenSize=size;
		powerOn=false;
		muteOn=false;
		volume=20;
		channel=2;
	}
	
	public void setChannel(int station){
		if(station<=500)
			channel=station;
	}
	
	public void togglePowerOnOff(){
		this.powerOn=!this.powerOn;
	}
	
	public void toggleMuteOnOff(){
		muteOn=!muteOn;
		if (muteOn){
			backupVolume=volume;
			volume=0;
		}else{
			volume=backupVolume;
		}
	}
	
	public void increaseVolume(){
		this.volume++;
		if(this.volume>100)
			volume=100;
	}
	
	public void decreaseVolume(){
		this.volume--;
		if(this.volume<0)
			this.volume=0;
	}
	
	public int getChannel(){
		return this.channel;
	}
	
	public int getVolume(){
		return this.volume;
	}
	
	public String getManufacturer(){
		return this.manufacturer;
	}
	
	public int getScreenSize(){
		return this.screenSize;
	}

	public boolean getPowerOnOff(){
		return powerOn;
	}
	
	public boolean getMuteOnOff(){
		return muteOn;
	}
}





















