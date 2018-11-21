
public class HandsShaking {
 
	public static long countPerfect(int n){
		long[] storage=new long[51];
		long result;
		for(int i=0;i<51;i++)storage[i]=-1;
		storage[0]=1;
		storage[2]=1;
		result=find(n,storage);
		return result;
	}
	public static long find(int n,long[] storage){
		int part1,part2;
		long result=0;
		if(storage[n]==-1){
			for(int i=1;i<=n/2;i++){
				part1=i*2;
				part2=n-part1;
				result+=find(part1-2,storage)*find(part2,storage);
			}
			storage[n]=result;
		}
		else return storage[n];
		return result;
	}

	public static void main(String[] args) {
//		int n=4; //2
//		int n=6; //5
//		int n=8; //14
//		int n=46; //343059613650
		int n=50; //4861946401452
		System.out.println(countPerfect(n));
	}
}
