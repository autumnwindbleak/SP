import java.util.*;
 
public class JumpyNum {
  
  final static int oo = 100100100;
  final static double eps = 1e-9;
  int m, n;
  int result;
  int[][] sl;
  int[][][] d;
  String s;
  
  void init() {
    sl = new int[11][10];
    for (int i=0; i<10; i++) sl[1][i] = 1;
    for (int i=2; i<11; i++)
    for (int j=0; j<10; j++) {
      sl[i][j] = 0;
      for (int k=0; k<10; k++)
      if (Math.abs(j-k)>=2) sl[i][j]+=sl[i-1][k];
    }
  }
  
  int dem(int scs) {
    if (scs==1) return 9;
    int r = 0;
    for (int i=1; i<10; i++)
    for (int j=0; j<10; j++)
    if (Math.abs(i-j)>=2) r += sl[scs-1][j];
    return r;
  }
  
  int dp(int p, int last, int less) {
    if (d[p][last][less]!=-1) return d[p][last][less];
    
    int r = 0;
    if (p==s.length()-1) return less;
    for (int i=0; i<10; i++)
    if (Math.abs(i-last)>=2) {
      if (less==0&&i>s.charAt(p+1)-'0') break;
      int less2;
      if (less==1) less2 = 1; else
      if (i<s.charAt(p+1)-'0') less2 = 1; else less2 = 0;
      r += dp(p+1, i, less2);
    }
    return (d[p][last][less] = r);
  }
  
  int count(int ct) {
    s = Integer.toString(ct);
    int r = 0;
    for (int i=1; i<s.length(); i++) r+= dem(i);
    
    d = new int[11][10][2];
    for (int i=0; i<11; i++)
    for (int j=0; j<10; j++) Arrays.fill(d[i][j], -1);
    
    for (int i=1; i<=s.charAt(0)-'0'; i++) {
      if (i<s.charAt(0)-'0') r += dp(0, i, 1);
      else r += dp(0, i, 0);
    }
    return r;
  }
 
  public int howMany(int low, int high) {
    init();
    result = count(high+1) - count(low);
    return result;
  }
  public static void main(String[] args) {
	  	JumpyNum j=new JumpyNum();
		int low=1,high=10; //9
//		int low=9,high=23; //9
//		int low=2000000000,high=2000000000; //0
//		int low=8000,high=20934; //3766
//		int low=1,high=2000000000; //127322182
//	  	int low=1,high=1; //1
		System.out.println(j.howMany(low,high));

	}
 
}
