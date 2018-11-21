
public class ChangeSequence {
	public int countAdds(int[] sequence){
		if(order(sequence)) return 0;
		if(sequence.length==1)return 0;
		if(sequence.length==2){
			if(sequence[0]!=sequence[1])return 1;
			else return 0;
		}
		int left=0,right=sequence.length-1,result=0;
		int templ=0,tempr=sequence.length-1;
		int suml,sumr;
		while(tempr!=templ){
			suml=sum(0,templ,sequence);
			sumr=sum(tempr,sequence.length-1,sequence);
			if(suml==sumr){
				left=Math.max(templ, left);
				right=Math.min(tempr, right);
				templ++;
			}
			else
				if(suml>sumr)tempr--;
				else templ++;
			
		}
		
		if(sum(0,left,sequence)!=sum(right,sequence.length-1,sequence))return sequence.length-1;
		if(left-right!=1){
			int[] s = new int[right-left-1];
			for(int i=left+1;i<right;i++)s[i-left-1]=sequence[i];
				result=countAdds(s);
		}
		int[] leftsequence=new int[left+1];
		int[] rightsequence= new int[sequence.length-right];
		for(int i=0;i<=left;i++)leftsequence[i]=sequence[i];
		for(int i=sequence.length-1;i>=right;i--)rightsequence[sequence.length-1-i]=sequence[i];
		
		result+=count(leftsequence,rightsequence);
		return result;
	}
	
	int count(int[] l, int[] r){
		int lefts=0,lefte=0,rights=0,righte=0,suml=0,sumr=0;
		int count=0;
		while(lefts<l.length||rights<r.length){
			suml=sum(lefts,lefte,l);
			sumr=sum(rights,righte,r);
			if(suml==sumr){
				lefts=lefte+1;
				lefte=lefts;
				rights=righte+1;
				righte=rights;
			}
			else
				if(suml>sumr){
					righte++;
					count++;
				}
				else {
					lefte++;
					count++;
				}
		}
		return count;
	}
	
	int sum(int start,int end,int[] sequence){
		int sum=0;
		for(int i=start;i<=end;i++)sum+=sequence[i];
		return sum;
	}
	
	boolean order(int[] sequence){
		for(int i=0;i<sequence.length/2;i++)
			if(sequence[i]!=sequence[sequence.length-1-i])return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] sequence={15,78,78,15}; //0
//		int[] sequence={15,78,87,51}; //3
//		int[] sequence={1,1,1,3}; //2
//		int[] sequence={3,23,21,23,42,39,63,76,13,13,13,32,12,42,26}; //8
		int[] sequence={10000,9999,10000,9999}; //2
		
		ChangeSequence c = new ChangeSequence();
		System.out.println(c.countAdds(sequence));

	}

}
