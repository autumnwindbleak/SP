
public class LunarRabbits {
	
	public static int howLong(int D, int K, int T){
		int rabbits = 1;
		int days = 0;
		while(rabbits < T){
			rabbits += rabbits * K;
			days++;
		}
		return days * D;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int D = 4, K = 3, T = 1; //0
//		int D = 4, K = 3, T = 4; //4
//		int D = 4, K = 3, T = 9; //8
//		int D = 4, K = 3, T = 1000000; //40
//		int D = 91, K = 6, T = 10433; //455
		int D = 9, K = 7, T = 17079; //45
		System.out.println(howLong(D, K, T));

	}

}
