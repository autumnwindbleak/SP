
public class AlmostBipartiteMatching {
	public static int maxMatching(int nA, int nB, int[] edgesA, int[] edgesB){
		int n = nA + nB;
		if(nA % 2 == 0 && nB % 2 == 0) return n / 2;
		else
			if(nA % 2 == 0 || nB % 2 == 0)return (n - 1) / 2;
			else {
				for(int i = 0; i < edgesA.length; i++)
					if(edgesA[i] % 2 == 0 && edgesB[i] % 2 == 0) return n / 2;
				return (n - 2)/2;
			}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int nA = 13, nB = 16;
//		int[] edgesA = {5,2,6,2,7,2,7,6,2,6,1,3,0,10,12,11,10}, edgesB = {7,3,10,12,0,0,3,4,7,2,5,2,14,15,1,1,1};
		int nA = 1, nB = 1;
		int[] edgesA = {0}, edgesB = {0};
		System.out.println(maxMatching(nA, nB, edgesA, edgesB));

	}

}
