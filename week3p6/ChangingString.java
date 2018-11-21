import java.util.Arrays;

public class ChangingString {
	public static int distance(String A,String B,int K){
		int[] dis=new int[A.length()];
		int sum=0;
		for(int i=0;i<A.length();i++)
			dis[i]=Math.abs(A.charAt(i)-B.charAt(i));
		Arrays.sort(dis);
		for(int i=dis.length-1;i>dis.length-K-1;i--){
			if(dis[i]==0)dis[i]=1;
			else dis[i]=0;
		}
		for(int i=0;i<dis.length;i++)sum+=dis[i];
		return sum;
	}
	
	public static void main(String[] args){
//		String A="ab",B="ba";int K=2; //0
//		String A="aa",B="aa";int K=2; //2
//		String A="aaa",B="baz";int K=1; //1
		String A="fdfdfdfdfdsfabasd",B="jhlakfjdklsakdjfk";int K=8; //24
		System.out.println(distance(A,B,K));
	}

}
