import java.util.Arrays;

public class ChickensAndCows {
	public static int[] howMany(int heads,int legs){
		int[] num = new int[2];
		int[] error={};
		if(legs%2!=0)return error;
		num[0]=(heads*4-legs)/2;
		num[1]=heads-num[0];
		if(num[0]<0||num[1]<0)return error;
		else return num;
	}

	public static void main(String[] args) {
//		int heads=3,legs=8; //2.1
//		int heads=10,legs=40; //0,10
//		int heads=10,legs=42; //{}
		int heads=1,legs=3; //{}
//		int heads=0,legs=0; //0.0
		System.out.println(Arrays.toString(howMany(heads,legs)));

	}

}
