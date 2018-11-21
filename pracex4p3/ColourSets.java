import java.util.Arrays;


public class ColourSets {
	
	public static int maxPoints(String[] points){
		String stock = "";
		for(int i = 0; i < points.length; i++)
			stock += points[i];
		String[] temp = stock.split(" ");
		if(temp.length <= 1) return 0;
		int[] ipoints = new int[temp.length];
		for(int i = 0; i < temp.length; i++)
			ipoints[i] = Integer.parseInt(temp[i]);
		Arrays.sort(ipoints);
		int max = 2, tempmax;
		for(int i = 0; i < ipoints.length; i++)
			for(int j = i+1; j < ipoints.length; j++){
				tempmax = check(i, j, ipoints);
				if(tempmax > max) max = tempmax;
			}
				
		return max;
	}
	
	public static int check(int i, int j, int[] ipoints){
		int dis = ipoints[j] - ipoints[i];
		int result = 2;
		int k = 1;
		boolean[] available = new boolean[ipoints.length];
		Arrays.fill(available, true);
		available[i] = false;
		available[j] = false;
		while (j + k < ipoints.length){
			if(!available[i + k]) k++;
			else
				if(ipoints[j + k] - ipoints[i + k] == dis){
					available[j + k] = false;
					available[i + k] = false;
					result += 2;
					k ++;
				}
				else k++;
		}
		return result;
	}

	public static void main(String[] args){
		String[] points = {"0 10 15 25 40 50 60"}; //6
		System.out.println(maxPoints(points));
	}
}
