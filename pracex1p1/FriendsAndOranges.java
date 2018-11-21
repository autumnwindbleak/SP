import java.util.Arrays;

public class FriendsAndOranges {
	public static int getNumber(int[] bags,int K){
		int[] possiblemin=new int[bags.length-K+1];
		Arrays.sort(bags);
		for(int i=0;i<bags.length-K+1;i++)
			possiblemin[i]=bags[i+K-1]-bags[i];
		Arrays.sort(possiblemin);
		return possiblemin[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] bags={10,20,30};int K=2; //10
//		int[] bags={4,7,4};int K=3; //3
//		int[] bags={4,1,2,3};int K=3; //2
//		int[] bags={5,4,6,1,9,4,2,7,5,6};int K=4; //1
		int[] bags={47,1000000000,1,74};int K=2; //27
		System.out.println(getNumber(bags,K));

	}

}
