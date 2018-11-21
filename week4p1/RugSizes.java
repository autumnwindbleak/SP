
public class RugSizes {

	public static int rugCount(int area){
		int[] multi=new int[100000];
		int amount=0,count=0;
		for(int i=1;i<=Math.sqrt(area);i++){
			if(area%i==0) {
				multi[amount]=i;
				amount++;
			}
		}
		for(int i=0;i<amount;i++){
			if(area==multi[i]*multi[i])count++;
			else if((multi[i]%2==1)||((area/multi[i])%2==1))count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int area=4; //2
//		int area=8; //1
		
		System.out.println(rugCount(area));

	}

}
