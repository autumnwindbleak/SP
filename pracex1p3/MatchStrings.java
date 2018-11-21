
public class MatchStrings {
	
	public static String shortestMatch(String s1,String s2){
	
		String result,temp;
		int p1=0,p2=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)=='*'){
				p1=i;
				break;
			}
		}
		for(int i=0;i<s2.length();i++){
			if(s2.charAt(i)=='*'){
				p2=i;
				break;
			}
		}
		String sub1=s1.substring(0,p1);
		String sub2=s1.substring(p1+1);
		String sub3=s2.substring(0,p2);
		String sub4=s2.substring(p2+1);
		
		for(int i=0;i<sub1.length()&&i<sub3.length();i++){
			if(sub1.charAt(i)!=sub3.charAt(i)) return "impossible";
		}
		for(int i=0;i<sub2.length()&&i<sub4.length();i++){
			if(sub2.charAt(sub2.length()-i-1)!=sub4.charAt(sub4.length()-i-1))return "impossible";
		}
		if(sub1.length()>sub3.length())result=sub1;
		else result=sub3;
		if(sub2.length()>sub4.length())temp=sub2;
		else temp=sub4;
		for(int i=0;i<result.length()&&i<temp.length();i++){
			
			
			
			if(result.substring(i).contains(temp.substring(0,temp.length()-i))){
				if(result.substring(result.length()-(temp.length()-i)).equals(temp.substring(0,temp.length()-i)))
//				if(!(result.equals(sub1)&&temp.substring(temp.length()-1).equals(sub2))){
				if(result.length()+i>=s1.length()-1&&result.length()+i>=s2.length()-1){
				result+=temp.substring(temp.length()-i);
				return result;
				}
			}
			if(temp.substring(0, temp.length()-i).contains(result.substring(i))){
				if(result.substring(i).equals(temp.substring(0,result.length()-i)))
//				if(!(result.equals(sub2)&&temp.substring(temp.length()-1).equals(sub4))){
				if(result.length()+temp.length()-result.length()+i>=s1.length()-1&&result.length()+temp.length()-result.length()+i>=s2.length()-1){
				result+=temp.substring(result.length()-i);
				return result;
				}
			}
			
		}
		result+=temp;

		
		return result;
	}
	


	public static void main(String[] args) {
//		String s1="TOPC*DER";String s2="T*PCODER"; //TOPCODER
//		String s1="HELLO*",s2="HI*"; //impossible
//		String s1="GOOD*LUCK";String s2="*"; //GOODLUCK
//		String s1="*SAMPLETEST";String s2="THIRDSAMPLE*"; //THIRDSAMPLETEST
//		String s1="*TOP",s2="*CODER"; //impossible
//		String s1="*",s2="A*"; //A
//		String s1="*B",s2="A*"; //AB
//		String s1="LASTCASE*",s2="*LASTCASE"; //LASTCASE
//		String s2="THISISATESTTHATCHECKSAVERYWEIRDSPECIFIC*SITUTATION",s1="THISIS*ON"; //THISISATESTTHATCHECKSAVERYWEIRDSPECIFICSITUTATION
//		String s1="*ODDTESTCASE",s2="ROBINHOOD*"; // ROBINHOODDTESTCASE
		String s1="TEST*ABACABADABACABAEND",s2="TESTABACABAEABACABA*END"; //TESTABACABAEABACABADABACABAEND
//		String s1="ABC*ABC",s2="*BC";//ABCABC							  
//		String s1="HOWMUCHWOODWOULDAWOODCHUCKIFAWOODCHUCKWOULDCHUCKW*",s2="*HOWMUCHWOODWOULDAWOODCHUCKIFAWOODCHUCKWOULDCHUCKW";
				   
		System.out.println(shortestMatch(s1,s2));
		

	}

}
