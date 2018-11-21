import java.util.Arrays;

public class ElevatorLimit {
	
	public static int[] getRange(int[] enter,int[] exit,int physicalLimit){
		int[] minandmax={0,physicalLimit};
		int number=0;
		for(int i=0;i<enter.length;i++){
			number-=exit[i];
			if(number<0&0-number>minandmax[0])minandmax[0]=0-number;
			number+=enter[i];
			if(number>0&&number>physicalLimit-minandmax[1])minandmax[1]=physicalLimit-number;
		}
		int[] empty={};
		if(minandmax[1]>=minandmax[0])return minandmax;
		else return empty;
	}

	public static void main(String[] args) {
//		int[] enter={1,0}, exit={0,1};int physicalLimit=1;//0.0
//		int[] enter={1,0}, exit={0,1};int physicalLimit=2;//0.1
//		int[] enter={0,1}, exit={1,0};int physicalLimit=1;//1.1
//		int[] enter={0,2}, exit={1,0};int physicalLimit=1;//[]
//		int[] enter={6,85,106,1,199,76,162,141}, exit={38,68,62,83,170,12,61,114};int physicalLimit=668;//233,500
//		int[] enter={179, 135, 104, 90, 97, 186, 187, 47, 152, 100, 119, 28, 193, 11, 103, 100, 179, 11, 80, 163, 50, 131, 103, 50, 142, 51, 112, 62, 69, 72, 88, 3, 162,93, 190, 85, 79, 86, 146, 71, 65, 131, 179, 119, 66, 111} , exit={134, 81, 178, 168, 86, 128, 1, 165, 62, 46, 188, 70, 104, 111, 3, 47, 144,69, 163, 21, 101, 126, 169, 84, 146, 165, 198, 1, 65, 181, 135, 99, 100,195, 171, 47, 16, 54, 79, 69, 6, 97, 154, 80, 151, 76} ;int physicalLimit=954;//453.659
		int[] enter={2}, exit={3};int physicalLimit=2;//[]
		System.out.println(Arrays.toString(getRange(enter,exit,physicalLimit)));
		

	}

}
