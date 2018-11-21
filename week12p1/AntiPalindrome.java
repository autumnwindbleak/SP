import java.util.Arrays;

public class AntiPalindrome {
	
	public static String rearrange(String s){
		char[] str = s.toCharArray();
		Arrays.sort(str);
		if(check(tostring(str))) 
			return tostring(str);
		else{
			int num = 0;
			for(int i = 0; i < str.length; i++)
				if(str[i] == str[(s.length()-1)/2])
					num++;
			if(str.length % 2 == 1) num--;
//			System.out.println(num);
//			System.out.println(str.length);
			if(num > str.length / 2) return "";
			else{
				int right = (s.length()-1) / 2,left = (s.length()-1) / 2, temp;
				
				for(int i = (s.length() -1) / 2; i < s.length(); i++)
					if(str[i] != str[i+1]){
						right = i;
						break;
					}
				for(int i = (s.length() -1) / 2; i >= 0; i--)
					if(str[i] != str[i-1]){
						left = i;
						break;
					}
				temp = (s.length()-1) / 2  - left;
				if(str.length % 2 == 0) temp++;
				String result = "", ss = tostring(str);
				result += ss.substring(0, (s.length()-1) / 2 +1) + ss.substring(right + 1, right + 1 + temp) + ss.substring((s.length()-1) / 2 +1, right +1) + ss.substring(right + 1 + temp);
				
				return result;
			}
			
			
		}
		
	}
	
	public static String tostring(char[] c){
		String result = "";
		for(int i = 0; i < c.length; i++)
			result += c[i];
		return result;
	}
	
	public static boolean check(String s){
		for(int i = 0; i <= (s.length() - 1) / 2; i++)
			if(s.charAt(i) == s.charAt(s.length() - i - 1) && i != s.length() - i - 1)
				return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "test";
//		String s = "aabbcc";
//		String s = "reflectionnoitcelfer";
//		String s = "hello";
//		String s = "www";
//		String s = "aaaaabbbbbccccc";
//		String s = "cdbcfcffcacfcaa";
//		String s = "cccdcacccaadcccccccaca";
		String s = "tttcgtttitrtltttntotqttjtgvtfbtrttfdtcwhttgtjlv"; 
		
		System.out.println(rearrange(s));

	}

}
