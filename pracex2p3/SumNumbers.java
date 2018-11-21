import java.util.ArrayList;
import java.util.Arrays;

public class SumNumbers {
	public static int lowest(int[] S){
		int min=1,size,last;
		ArrayList<Integer> l=new ArrayList<Integer>();
		Arrays.sort(S);
		l.add(S[0]);
		if(S[0]!=1)return 1;
		min++;
		for(int i=1;i<S.length;i++){
			size=l.size();
			last=size-1;
			if(S[i]>min) return min;
			if(S[i]==min){
				l.add(S[i]);
				min++;
				last++;
			}
			for(int j=0;j<size;j++){
				if(S[i]+l.get(j)<=min){
					if(S[i]+l.get(j)==min)
						min++;
					}else return min;
			}
			for(int j=0;j<size;j++)
				if(l.get(j)+S[i]>l.get(last))l.add(l.get(j)+S[i]);
		}
		return l.get(l.size()-1)+1;
		
	}

	public static void main(String[] args) {
//		int[] S={5,1,2}; //4
//		int[] S={2,1,4}; //8
//		int[] S={2,1,2,7}; //6
//		int[] S={94512,2,87654,81316,6,5,6,37151,6,139,1,36,307,1,377,101,8,37,58,1}; //1092
		int[] S={883,66392,3531,28257,1,14131,57,1,25,88474,4,1,110,6,1769,220,442,7064,7,13}; //56523
		System.out.println(lowest(S));
	}

}
