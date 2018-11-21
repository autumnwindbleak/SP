import java.util.Arrays;


public class ToborWalk {
	public static long getdist(int t, int[] a){
		long[] status = new long[3];
		Arrays.fill(status, 0);
		run(a, status);
		if(status[2] == 0) return Math.abs(status[1]) * t+Math.abs(status[0]) * t;
		if(status[2] == 2){
			if(t % 2 == 0) return 0;
			else return Math.abs(status[1])+Math.abs(status[0]);
		}
//		long[] result = run(status, t);
		long[] result = run(status, 4);
		result[0] = result[0] * t /4;
		result[1] = result[1] * t /4;
		long[] rest = run(status, t % 4);
		result[0] = result[0] + rest[0];
		result[1] = result[1] + rest[1];
		
		return Math.abs(result[1])+Math.abs(result[0]);
	}
	
	public static long[] run(long[] status, int t){
		long[] result = {0, 0, 0};
		for(int i = 0; i < t; i++){
			switch(Integer.parseInt(""+result[2])){
			case 0:
				result[2] += status[2];
				result[2] = result[2] % 4;
				result[0] += status[0];
				result[1] += status[1];
				break;
			case 1:
				result[2] += status[2];
				result[2] = result[2] % 4;
				result[1] -= status[0];
				result[0] += status[1];
				break;
			case 2:
				result[2] += status[2];
				result[2] = result[2] % 4;
				result[0] -= status[0];
				result[1] -= status[1];
				break;
			case 3:
				result[2] += status[2];
				result[2] = result[2] % 4;
				result[1] += status[0];
				result[0] -= status[1];
				break;
				
		}
		}
		return result;
	}
	
	public static void run(int[] a, long[] status){
		for(int i = 0; i < a.length; i++){
			switch(Integer.parseInt(""+status[2])){
			case 0:
				status[1] += a[i];
				status[2] += a[i];
				status[2] = status[2] % 4;
				break;
			case 1:
				status[0] += a[i];
				status[2] += a[i];
				status[2] = status[2] % 4;
				break;
			case 2:
				status[1] -= a[i];
				status[2] += a[i];
				status[2] = status[2] % 4;
				break;
			case 3:
				status[0] -= a[i];
				status[2] += a[i];
				status[2] = status[2] % 4;
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 1; int[] a = {1, 2, 3}; //2
//		int t = 4; int[] a = {1}; //0
//		int t = 5; int[] a = {1, 1, 2}; //10
//		int t = 1000000000; int[] a = {100}; //100000000000
		
		System.out.println(getdist(t, a));

	}

}
