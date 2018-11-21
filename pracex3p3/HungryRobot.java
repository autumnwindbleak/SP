import java.util.Arrays;

public class HungryRobot {
	public int getAmount(int[] type,int[]taste){
		int[] negative = new int[type.length];
		int sumtaste = 0;
		int result,count=0;
		String typestockp = "", typestockn="", temp;
		for(int i=0;i<type.length;i++){
			if(taste[i]>=0) {
				sumtaste += taste[i];
				temp = ""+type[i];
				if(!typestockp.contains(temp))typestockp = typestockp+type[i]+" ";
			}
		}
		for(int i=0;i<type.length;i++){
		if(taste[i]<0){
				temp = ""+type[i];
				if(!typestockp.contains(temp))
					if(!typestockn.contains(temp)){
						typestockn = typestockn+type[i]+" ";
						negative[count]=taste[i];
						count++;
					}else
						if(negative[Arrays.binarySearch(typestockn.split(" "),temp)] < taste[i])
							negative[Arrays.binarySearch(typestockn.split(" "),temp)]=taste[i];
			}
		}
		
		
		
		int length = typestockp.split(" ").length;
		result = sumtaste * length;
		for(int i=0;i<count;i++){
			if((sumtaste+negative[i])*(length+1)>result){
				result=(sumtaste+negative[i])*(length+1);
				length++;
				sumtaste+=negative[i];
				}
			}
		return result;
	}

	public static void main(String[] args){
		HungryRobot hr = new HungryRobot();
//		int[] type = {1, 2}, taste = {4, 7}; //22
//		int[] type = {1, 1}, taste = {-1, -1}; //0
//		int[] type = {1, 2, 3}, taste = {7, 4, -1}; //30
		int[] type = {1, 2, 3, 2, 3, 1, 3, 2, 3, 1, 1, 1}, taste={1, 7, -2, 3, -4, -1, 3, 1, 3, -5, -1, 0}; //54
//		int[] type = {30, 20, 10}, taste = {100000, -100000, 100000}; //400000
		System.out.println(hr.getAmount(type,taste));
	}
}
