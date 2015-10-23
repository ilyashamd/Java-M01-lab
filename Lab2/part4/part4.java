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
