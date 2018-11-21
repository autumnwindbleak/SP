import java.util.Arrays;


public class EmoticonsDiv2 {
	
	public static int[] div;
	public static int index;
	
	public static int printSmiles(int smiles){
		
		int even = 0;
		while(smiles % 2 == 0){
			smiles = smiles / 2;
			even++;
		}
		div = new int[smiles];
		index = 0;
		find(smiles);
		
		int result = 0;
		for(int i = 0; i < index; i++)
			result += div[i];
		result += even * 2;
		return result;
	}
	
	public static void find(int n){
		int[] odd = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997};
		for(int i = 0; i < odd.length; i++){
			if(n == odd[i]){
				div[index] = odd[i];
				index++;
				return;
			}
			if(n > odd[i]){
				if(n % odd[i] == 0){
					div[index] = odd[i];
					index++;
					find(n / odd[i]);
					break;
				}
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int smiles = 2; //2
//		int smiles = 6; //5
//		int smiles = 11; //11
//		int smiles = 16; //8
		int smiles = 1000; //21
//		int smiles = 2; //2
		System.out.println(printSmiles(smiles));
		
		
		
		
		
		
//		for(int i = 1; i <= 1000; i++){
//			boolean odd = true;
//			for(int j = 2; j < i; j++){
//				if(i % j == 0){
//					odd = false;
//					break;
//				}
//			}
//			if(odd)System.out.print(i + ",");
//		}		

	}

}
