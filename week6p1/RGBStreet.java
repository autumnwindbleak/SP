import java.util.Arrays;

public class RGBStreet {
	
	public static int estimateCost(String[] houses){
		int[] temp=new int[3];
		int[][] inthouses=new int[houses.length][3];
		for(int i=0;i<houses.length;i++)
			for(int j=0;j<3;j++)
				inthouses[i][j]=0;
		int count=0;
		for(int i=0;i<houses.length;i++){
			count=0;
			for(int j=0;j<houses[i].length();j++){
				if(houses[i].charAt(j)!=' ')inthouses[i][count]=inthouses[i][count]*10+houses[i].charAt(j)-48;
				else count++;
			}
		}
		
		temp[0]=paintnext(inthouses,0,0);
		temp[1]=paintnext(inthouses,0,1);
		temp[2]=paintnext(inthouses,0,2);
		Arrays.sort(temp);
		return temp[0];
		
	}
	
	public static int paintnext(int[][] inthouses,int number,int color){
		int cost=0,temp1,temp2;
		if(number==inthouses.length) return 0;
		switch(color){
		case 0:{
			temp1=paintnext(inthouses,number+1,1);
			temp2=paintnext(inthouses,number+1,2);
			break;
		}
		case 1:{
			temp1=paintnext(inthouses,number+1,0);
			temp2=paintnext(inthouses,number+1,2);
			break;
		}
		case 2:{
			temp1=paintnext(inthouses,number+1,0);
			temp2=paintnext(inthouses,number+1,1);
			break;
		}default:{
			System.out.println("color is wrong");
			temp1=-1;
			temp2=-1;
		}
		}
		if(temp1<temp2)cost+=temp1+inthouses[number][color];
		else cost+=temp2+inthouses[number][color];
		return cost;
		
	}

	public static void main(String[] args) {
//		String[] houses={"1 100 100", "100 1 100", "100 100 1"}; //3
//		String[] houses={"1 100 100", "100 100 100", "1 100 100"}; //102
//		String[] houses={"26 40 83", "49 60 57", "13 89 99"}; //96
//		String[] houses={"30 19 5", "64 77 64", "15 19 97", "4 71 57", "90 86 84", "93 32 91"}; //208
		String[] houses={"71 39 44", "32 83 55", "51 37 63", "89 29 100", "83 58 11", "65 13 15", "47 25 29", "60 66 19"}; //253
		System.out.println(estimateCost(houses));

	}

}
