
public class Inchworm {
	public static int lunchtime(int branch,int rest,int leaf){
		int multi=1,count=1;
		while(multi*leaf<=branch){
			if((multi*leaf)%rest==0)count++;
			multi++;
		}
		return count;
		
	}

	public static void main(String[] args) {
//		int branch=11,rest=2,leaf=4; //3
//		int branch=12,rest=6,leaf=4; //2
//		int branch=20,rest=3,leaf=7; //1
//		int branch=21,rest=3,leaf=7; //2
//		int branch=15,rest=16,leaf=5; //1
//		int branch=1000,rest=3,leaf=7; //48
		int branch=1000,rest=7,leaf=3; //48
		System.out.println(lunchtime(branch,rest,leaf));

	}

}
