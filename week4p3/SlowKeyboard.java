
public class SlowKeyboard {
	public static int enterTime(String time){
		int[] dt=new int[4];
		int t1,min=10;
		dt[0]=time.charAt(0)-48;
		dt[1]=time.charAt(1)-48;
		dt[2]=time.charAt(3)-48;
		dt[3]=time.charAt(4)-48;
		for(int i=0;i<10;i++){
			dt[3]++;
			if(dt[3]>9){
				dt[3]-=10;
				dt[2]++;
			}
			if(dt[2]>5){
				dt[2]-=6;
				dt[1]++;
			}
			if(dt[1]>9){
				dt[1]-=10;
				dt[0]++;
			}
			if(dt[0]>5)dt[0]-=6;
			
			t1=typetime(dt);
			if(t1<=i+1){
				if(min>i+1)min=i+1;
			}
		}
		return min;
	}
	
	public static int typetime(int[] time){
		int t=4;
		if(time[0]!=time[1])t+=2;
		if(time[1]!=time[2])t+=2;
		if(time[2]!=time[3])t+=2;
		return t;
	}

	public static void main(String[] args) {
//		String time="59:56"; //4	
//		String time="59:59"; //6
//		String time="33:12"; //8
		String time="16:35"; //9
		System.out.println(enterTime(time));
	

	}

}
