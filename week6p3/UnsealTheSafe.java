
public class UnsealTheSafe {
	public static long[][] stock;
	public static int[][] connection={{1,7},
									  {2,2,4},
									  {3,1,3,5},
									  {2,2,6},
									  {3,1,5,7},
									  {4,2,4,6,8},
									  {3,3,5,9},
									  {3,4,8,0},
									  {3,5,7,9},
									  {2,6,8}};

	public static long countPasswords(int N){
		long sum=0;
		stock=new long[10][N];
		for(int i=0;i<10;i++)
			for(int j=0;j<N;j++)
				stock[i][j]=0;
		for(int i=0;i<10;i++)
			sum+=count(i,N);
		return sum;
	}
	
	public static long count(int start,int N){
		
		if(N==1)return 1;

		if(stock[start][N-1]!=0)
			return stock[start][N-1];
		else{
			for(int i=1;i<=connection[start][0];i++)
				stock[start][N-1]+=count(connection[start][i],N-1);
			return stock[start][N-1];
		}
	}
	
	
	public static void main(String[] args) {
//		int N=1; //10
//		int N=2; //26
//		int N=3; //74
		int N=25; //768478331222
		
		System.out.println(countPasswords(N));

	}

}
