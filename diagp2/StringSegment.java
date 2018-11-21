
public class StringSegment {

	/**
	 * @param args
	 */
	public static double average(String s){
		int i,l;
		double ave,sum,n;
		char[] c;
		l=1;
		sum=0;
		n=1;
		c=s.toCharArray();
		for(i=1;i<s.length();i++){
			if(c[i]==c[i-1])l++;
			if(c[i]!=c[i-1]) {
				n++;
				sum +=l;
				l=1;
			}
		}
		sum+=l;
		ave=sum/n;
		return ave;
	}
	public static void main(String[] args) {
//		String s="aaabbaaac";
//		String s="aabbccdd";
		String s="abba";
		System.out.println(average(s));

	}

}
