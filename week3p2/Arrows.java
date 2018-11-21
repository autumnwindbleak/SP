
public class Arrows {

	
	
	public static int longestArrow(String s){
		
		int max=-1,long1=-1;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='<'){
				long1=1;
				if(i+1<s.length())
				if((s.charAt(i+1)!='<')&&(s.charAt(i+1)!='>'))
				{	long1++;
					for(int j=i+1;j<s.length()-1;j++){
						if(s.charAt(j)==s.charAt(j+1))long1++;
						else break;
					}
				}
			}
			if(long1>max)max=long1;
			if(s.charAt(i)=='>'){
				long1=1;
				if(i-1>-1)
				if((s.charAt(i-1)!='<')&&(s.charAt(i-1)!='>')){
					long1++;
					for(int j=i-1;j>0;j--){
						if(s.charAt(j)==s.charAt(j-1))long1++;
						else break;
					}
				}
			}
			if(long1>max)max=long1;
		}
		return max;
	}
	public static void main(String[] args) {
		String s="<--->--==>";   //4
//		String s="<----=====>";  //6
//		String s="<<<<<<<<<<";   //1
//		String s=">----=====<";  //1
//		String s="<---";   //4
//		String s="=>"; //2
		System.out.println(longestArrow(s));

	}

}
