
import java.util.Arrays;



public class DeleteDuplicates {
	int index;
	
	public int[] eliminate(int[] sequence){
		int[] stock = new int[sequence.length];
		index = 0;
		for(int i=0;i<sequence.length;i++)
			if(!contain(sequence[i],stock)){
				stock[index]=sequence[i];
				index++;
			}
		int[] result = new int[index];
		int count=0;
		for(int i=sequence.length-1;i>=0;i--)
			if(contain(sequence[i],stock)&&!contain(sequence[i],result)){
				result[count]=sequence[i];
				count++;
				index--;
				if(index==0)break;
			}
		int [] result1= new int[result.length];
		for(int i=0;i<result1.length;i++)
			result1[i]=result[result.length-i-1];
		return result1;
	}
	
	boolean contain(int n, int[] stock){
		if(index==0)return false;
		for(int i=0;i<stock.length;i++)
			if(stock[i]==n) return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] sequence={1,5,5,1,6,1};
//		int[] sequence={2,4,2,4,4};
//		int[] sequence={6,6,6,6,6,6,6};
//		int[] sequence={1,2,3,4,2,2,3};
		int[] sequence={100,100,100,99,99,99,100,100,100};
		
		
		DeleteDuplicates d = new DeleteDuplicates();
		System.out.println(Arrays.toString(d.eliminate(sequence)));
	}

}
