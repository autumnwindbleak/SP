//https://version-control.adelaide.edu.au/svn/a1690260/2014/s1/sp/week6p2/QuickSums.java
public class QuickSums {
  
  public static int min = Integer.MAX_VALUE;
  QuickSums(){
	  min=Integer.MAX_VALUE;
  }
  public static int minSums(String numbers, int sum) {
    count (numbers,"",sum,0);
    if (min == Integer.MAX_VALUE) return -1;
    return min-1;
  }
 
  public static void count (String numbers, String plus, int sum, int i) {
    if (i >= numbers.length()) {
      long result = 0;
      String[] st = plus.split("\\+");
      for(int j = 0;j<st.length;j++){
    	  result += Long.parseLong(st[j]);
      }
      if (result == sum) min = Math.min(min,st.length);
    } else {
      if (i == 0) count(numbers,""+numbers.charAt(i), sum, i+1);
      else {
        count(numbers,plus+"+"+numbers.charAt(i),sum,i+1);
        count(numbers,plus+numbers.charAt(i),sum,i+1);
      }
    }
  }


	
	public static void main(String[] args){
//		String numbers="99999"; int sum=45; //4
//		String numbers="1110"; int sum=3; //3
//		String numbers="1110"; int sum=12; //2
		String numbers="0123456789"; int sum=45; //8
//		String numbers="0123";int sum=6; //2
//		String numbers="000123"; int sum=6; //2
//		String numbers="99999"; int sum=100; //-1
//		String numbers="382834"; int sum=100; //2
//		String numbers="9230560001"; int sum=71; //4
//		String numbers="0123456789"; int sum=81; //6
//		String numbers="0000123456789"; int sum=81; //6
		System.out.println(minSums(numbers,sum));
	}
}
