
public class FracCount {

	public static int position(int numerator,int denominator){
		int count=0;
		for(int i=2;i<=denominator;i++)
			if(i!=denominator){		
				for(int j=1;j<=denominator-1&&j<i;j++)
					if(!frac(j,i))count++;
			}
			else
				for(int j=1;j<=numerator;j++)
					if(!frac(j,i))count++;
		
		return count;
	}
	
	public static boolean frac(int x,int y){
		for(int i=2;i<=y;i++)
			if(x%i==0&&y%i==0)return true;
		return false;
	}
	
	public static void main(String[] args) {
//		int n=1,d=2; //1
//		int n=3,d=4; //5
//		int n=5,d=6; //11
//		int n=999,d=1000; //304191
		int n=12,d=625; //118493
		System.out.println(position(n,d));

	}

}
