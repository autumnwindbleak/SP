
public class MatchNumbersEasy {
	public static String maxNumber(int[] matches,int n){
		int left=n;
		int min=100,index=-1,length=0;
		int[] result=new int[n+1];
		for(int i=1;i<matches.length;i++)
			if(min>matches[i]){
				min=matches[i];
				index=i;
			}
		if(n<min)return "0";
		result[length]=index;
		length++;
		n-=matches[index];
		for(int i=0;i<matches.length;i++)
			if(min>matches[i]){
				min=matches[i];
				index=i;
			}
		while(n>=matches[index]){
			result[length]=index;
			n-=matches[index];
			length++;
		}
		for(int i=0;i<result.length;i++){
			for(int j=matches.length-1;j>result[i];j--){
				if(matches[j]-matches[result[i]]<=n){
					n=n-matches[j]+matches[result[i]];
					result[i]=j;
					if(n<0)break;
				}
			}
			if(n<0)break;
		}
		String s="";
		for(int i=0;i<length;i++)s=s+result[i];
		return s;
	}

	public static void main(String[] args){
		int[] matches={6,7,8}; int n=21; //210
//		int[] matches={5,23,24}; int n=30; //20
//		int[] matches={1,5,3,2}; int n=1; //0
//		int[] matches={1,1,1,1,1,1,1,1,1,1}; int n=50;
		System.out.println(maxNumber(matches,n));
		
		
	}
}
