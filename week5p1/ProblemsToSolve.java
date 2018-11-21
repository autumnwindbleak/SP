//https://version-control.adelaide.edu.au/svn/a1690260/2014/s1/sp/week5p1/ProblemsToSolve.java

public class ProblemsToSolve {
	public static int minNumber(int[] pleasantness, int variety) { 
        int result = pleasantness.length; 
      for( int i=0; i<pleasantness.length; i++) { 
        for( int j=i+1; j<pleasantness.length; j++ ) { 
          int different = Math.abs( pleasantness[i] - pleasantness[j] ); 
          if( different < variety ) { 
            continue; 
          } 
          int count = (i+1+2) / 2; 
          int k = (j-i); 
          count += (k+1)/2;  
          if(result>count) result=count;
        } 
      } 
        return result; 
    } 



	public static void main(String[] args) {
//		int[] pleasantness={1,2,3};int variety=2; //2
		int[] pleasantness={1,2,3,4,5}; int variety=4; //3
//		int[] pleasantness={10,1,12,101}; int variety=100; //3
//		int[] pleasantness={10,1}; int variety=9; //2
//		int[] pleasantness={6,2,6,2,6,3,3,3,7}; int variety=4; //2
//		int[] pleasantness={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};int variety=51;
//		int[] pleasantness={1}; int variety=1; //1
		System.out.println(minNumber(pleasantness,variety));

	}

}
