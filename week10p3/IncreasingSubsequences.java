import java.util.ArrayList;

public class IncreasingSubsequences {
	public static int result;
	public static long count(int[] a){
		ArrayList<Integer> aa = new ArrayList<Integer>();
		result = 0;
		for(int i = 0; i < a.length; i++)
			aa.add(a[i]);
		calculate(aa);
		return result;
	}
	
	public static void calculate(ArrayList<Integer> a){
		if(a.size() == 1)	
			result++;
		else{
			int index = a.size()-1;
			int max =a.get(index);
			boolean flag = false;
			for(int i = 0; i < index; i++)
				if(a.get(i)>max){
					flag = true;
					break;
				}
			
			if(flag){
				ArrayList<Integer> aa = new ArrayList<Integer>();
				while(index >= 0 && flag == true){
					aa.clear();
					for(int i = 0; i <= index; i++)
						if(a.get(i) <= max)	aa.add(a.get(i));
					calculate(aa);
					index--;
					flag = false;
					for(int i = index; i >= 0; i--)
						if(a.get(i) > max){
							index = i;
							max = a.get(index);
							flag = true;
							break;
						}
				}
			}else{
				ArrayList<Integer> aa = new ArrayList<Integer>();
				for(int i = 0; i < index; i++)
					aa.add(a.get(i));
				calculate(aa);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] a = {1,3,2,6,4,5}; //4
		int[] a = {1000000000,100000000,10000000,1000000,100000,10000,1000,100,10,1}; //10
//		int[] a = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000}; //1
//		int[] a = {564,234,34,4365,424,2234,306,21,934,592,195,2395,2396,29345,13295423,23945,2}; //41
		System.out.println(count(a));

	}

}
