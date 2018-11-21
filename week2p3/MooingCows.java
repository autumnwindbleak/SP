
public class MooingCows {
	
	public static int dissatisfaction(String[] farmland){
		int[][] cows=new int[2500][2];
		int count=0;
		int min=-1,temp;
		for(int i=0;i<farmland.length;i++)
			for(int j=0;j<farmland[0].length();j++)
				if(farmland[i].charAt(j)=='C'){
					cows[count][0]=j;
					cows[count][1]=i;
					count++;
				}
		for(int i=0;i<count;i++){
			temp=0;
			for(int j=0;j<count;j++){
				temp+=(cows[i][0]-cows[j][0])*(cows[i][0]-cows[j][0])+(cows[i][1]-cows[j][1])*(cows[i][1]-cows[j][1]);
			}
			if(temp<min||min==-1)min=temp;
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] farmland={"C..",".C.",".C."};//3
//		String[] farmland={"CCCC","CCCC","CCCC"};//26
//		String[] farmland={"C"};//0
		String[] farmland={"CCC....","C......","....C.C",".C.CC..","C......"};//81
		System.out.println(dissatisfaction(farmland));

	}

}
