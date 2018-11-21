
public class Multifactorial {
	
	public static String calcMultiFact(int n, int k){
		long result = 1;
		while(n <= (double) 1000000000000000000l/(double) result && n > 0){
			result = n * result;
			n = n - k;
			if(n > (double) 1000000000000000000l/(double) result) return "overflow";
		}                
		return "" + result;
		
	}
	
	
	
	public static void main(String[] args){
//		int n = 14, k = 3; 	//	12320
//		int n = 5, k = 4; 	// 5
//		int n = 1000, k = 2; //overflow
//		int n = 2000000000, k = 1900000000; //200000000000000000
//		int n = 1000, k = 256; //84232704000
//		int n = 2000000000, k = 1; //overflow
//		int n = 20, k = 1; //overflow   
//		int n = 5740, k = 1053; //overflow
//		int n = 423332300, k = 165035639; //overflow
//		int n = 999999998, k = 499999998; //999999998000000000
		int n = 2000000000, k = 1500000000; //1000000000000000000
		System.out.println(calcMultiFact(n,k));
	
	}

}
