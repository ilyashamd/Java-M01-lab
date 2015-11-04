import java.util.Scanner;

public class PartE{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args){
    StopWatch watch;
    double a,b,c,d,e,f;
    int [] array= new int[100000];

		System.out.println("\nStopWatch Demo");
    System.out.println("****************************");
    watch=new StopWatch();

    System.out.println("Making array ...");
    makeArray (array);
    System.out.println("Sorting array ...");
    watch.start();
    sortArray(array);
    watch.stop();

    System.out.print("Ellapsed Time (ms): ");
    System.out.println(watch.getEllapsedTime());
	}

  static void makeArray (int []_array){
		int n=_array.length;
		for(int i=0; i<n; i++){
			_array[i]=(int) (Math.random()*100);
		}
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


//////////////////////////////////////////////
class StopWatch{
  private double startTime, endTime;

  StopWatch(){
    startTime=System.currentTimeMillis();
  }

  public double getStartTime(){
    return startTime;
  }

  public double getEndTime(){
    return endTime;
  }

  public void start(){
    startTime=System.currentTimeMillis();
  }

  public void stop(){
    endTime=System.currentTimeMillis();
  }

  public double getEllapsedTime(){
    return (endTime - startTime);
  }
}
