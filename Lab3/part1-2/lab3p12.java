import java.util.Scanner;

public class lab3p12{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		Television tv;
		String brandName;
		int size;

		println("Television Demo");
		println("***************");
		print("Enter the brand name : ");
		brandName=input.nextLine();
		print("Enter the size (inch): ");
		size=input.nextInt();
		tv=new Television(brandName, size);

		run(tv);		
	}
	


	public static void showStatus(Television tv){
		println("\nHere is the state of your TV now: ");
		println("****************************************************");
		println("manufacturer \t: "+tv.getManufacturer());
		println("screenSize \t: "+tv.getScreenSize());
		println("powerOn \t: "+tv.getPowerOnOff());
		println("muteOn \t\t: "+tv.getMuteOnOff());
		println("channel \t: "+tv.getChannel());
		println("volume \t\t: "+tv.getVolume());
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

	public static void telephone(Television tv){
		println("\nThe phone is ringing!! I am muting your TV");
		tv.toggleMuteOnOff();
		showStatus(tv);
		println("\nWelcome back, I am resuming your sound level");
		tv.toggleMuteOnOff();
		showStatus(tv);
	}

	public static void run(Television tv){
		print("Your TV is off would you like to turn it on? (Y/N): ");
		String power=input.nextLine();
		if(power.equalsIgnoreCase("y")){
			tv.togglePowerOnOff();
			showStatus(tv);

			volumeSettings(tv);
			telephone(tv);

			power="";
			println("\nWatching time exceeded 2 hours, turn your TV off (Y/N) :");
			power=input.nextLine();
			if(power.equalsIgnoreCase("y")){
				tv.togglePowerOnOff();
				println("Bye!");
			}else{
				println("OK, may be later!");
			}
		}else println("OK, may be later!");
		


	}

	public static void volumeSettings(Television tv){
		int chan,vol;
		print("\nEnter the desired channel number: ");
		chan=input.nextInt();
		tv.setChannel(chan);
		print("Enter the desired volume level: ");
		vol=input.nextInt();
		setVolume(tv, vol);
		showStatus(tv);

		if(tv.getVolume()>21){
			println("Too loud!! I am lowering the volume.");
			setVolume(tv, 21);
			showStatus(tv);
		} else if (tv.getVolume()<11){
			println("Too low!! I am raising the volume.");
			setVolume(tv, 11);
			showStatus(tv);
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





















