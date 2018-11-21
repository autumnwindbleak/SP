
public class InsertionSortCount {
	
	public static int countMoves(int[] A){
		int[] N=new int[50];
		int endnum=1,count=0,temp;
		N[0]=A[0];
		while(endnum!=A.length){
			temp=find(A[endnum],N,endnum);
			count=count+temp;
			insert(A[endnum],N,temp,endnum);
			endnum++;
		}
		return count;
	}
	
	public static int find(int a,int[] N,int endnum){
		int count=0;
		if(a<N[endnum-1]){
			count++;
			if(endnum-1>0)count+=+find(a,N,endnum-1);
			return count;
		}
			
		else 
			return count;
			
	}
	
	public static void insert(int a,int[] N,int num,int endnum){
		for(int i=endnum;i>endnum-num;i--)
			N[i]=N[i-1];
		N[endnum-num]=a;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] A={20,40,30,10}; //4
//		int[] A={-1,1,0}; //1
		int[] A={-1000,0,1000}; //0
		System.out.println(countMoves(A));
	

	}

}
