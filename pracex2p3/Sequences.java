import java.util.ArrayList;


public class Sequences {
	public static int count=0;
	Sequences(){
		count=0;
	}
	public static int getLongest(int start){
		int length;
		length=getlength(start);
		return find(start,length);
	}
	
	public static int find(int start,int length){
		int next,temp,max=0;
		ArrayList<Integer> possible = new ArrayList<Integer>();
		if(length==0)return count+1;
		if(length==1)return count+1;
		for(int i=0;i<length;i++){
			possible=getpossible(start);
			for(int j=0;j<possible.size()-1;j++){
				next=possible.get(j);
				count++;
				temp=find(next,getlength(next));	
				if(temp>max)max=temp;
				count--;
			}
		}
		return max;
		
/*		
		if(length%2==0){
			ten=10;
			for(int i=1;i<length/2;i++)ten=ten*10;
			next=(start/ten)*(start%ten);
			return find(next,getlength(next))+1; 
		}else{
			ten=10;
			for(int i=1;i<length/2;i++)ten=ten*10;
			next=(start/ten)*(start%ten);
			temp1=find(next,getlength(next));
			ten=ten*10;
			next=(start/ten)*(start%ten);
			temp2=find(next,getlength(next));
			if(temp1>temp2) return temp1+1;
			else return temp2+1;
		}
*/		
	}
	
	public static ArrayList<Integer> getpossible(int n){
		int length,ten=1;
		ArrayList<Integer> next=new ArrayList<Integer>();
		ArrayList<Integer> result=new ArrayList<Integer>();
		length=getlength(n);
		if(length==1){
			result.add(n);
			return result;
		}
		for(int i=0;i<length-1;i++){
			ten=ten*10;
			next=getpossible(n%ten);
			for(int j=0;j<next.size();j++){
				result.add(n/ten*next.get(j));
			}
		}
		result.add(n);
		return result;
	}
	
	public static int getlength(int n){
		int count=0;
		while(n!=0){
			count++;
			n=n/10;
		}
		return count;
	}

	public static void main(String[] args) {
//		int start=6;  //1
//		int start=97; //4
//		int start=234; //5
//		int start=876; //7
		int start=99999; //29
		System.out.println(getLongest(start));
	}

}
