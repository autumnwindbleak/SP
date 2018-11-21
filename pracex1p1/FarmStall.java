public class FarmStall {
	public static int minCartons(int n){
		int min=-1;
		if(n%2==1||n<6)return -1;
		for(int i=0;i<=n/8;i++)
			for(int j=0;j<=n/6;j++){
				if(8*i+6*j==n)
					if(min>i+j||min==-1)min=i+j;
			}
		return min;
		
	}
	public static void main(String[] args){
//		int n=20; //3
//		int n=24; //3
//		int n=15; //-1
//		int n=4; //-1
		int n=10; //-1
		System.out.println(minCartons(n));
	}

}
