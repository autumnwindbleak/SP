
public class RosePetals {
	public static int getScore(int[] dice){
		int sum=0;
		for(int i=0;i<5;i++)
			switch(dice[i]){
			case 3: sum=sum+2;break;
			case 5: sum=sum+4;break;
			}
		return sum;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] dice={1,2,3,2,1}; //2
//		int[] dice={4, 4, 5, 6, 5};//8
		int[] dice={1, 2, 3, 3, 5};//8
//		int[] dice={3, 3, 3, 3, 3};//10
//		int[] dice={2, 2, 2, 2, 2};//0
		System.out.println(getScore(dice));

	}

}
