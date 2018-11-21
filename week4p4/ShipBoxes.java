import java.util.Arrays;

public class ShipBoxes {

	public static int count=0;

	public static int bestCost(int[] box1,int[] box2){
		int space=1;
		for(int i=1;i<=box1.length;i++)space=space*i;
		int[][] box3=new int[space][box1.length];
		space=1;
		for(int i=1;i<=box1.length;i++)space=space*i;
		int[][] box4=new int[space][box2.length];
		int min=-1;
		int[] box=new int[3];
		order(box1,0,box1.length-1,box3);
		count=0;
		order(box2,0,box2.length-1,box4);
		count=0;
		for(int i=0;i<box3.length;i++)
			for(int j=0;j<box4.length;j++){
			box[0]=box3[i][0]+box4[j][0];
			if(box3[i][1]>box4[j][1])box[1]=box3[i][1];else box[1]=box4[j][1];
			if(box3[i][2]>box4[j][2])box[2]=box3[i][2];else box[2]=box4[j][2];
			Arrays.sort(box);
			if(min==-1||min>4*box[0]*box[1]+2*box[1]*box[2]+2*box[0]*box[2])min=4*box[0]*box[1]+2*box[1]*box[2]+2*box[0]*box[2];
		}
		return min;
	}

	public static void order(int[] a1,int start,int end,int[][] a2){
		int temp;
		if(start==end){
			for(int i=0;i<a1.length;i++){
				a2[count][i]=a1[i];
			}
			count++;
		}
		else 
			for(int i=start;i<=end;i++){
				temp=a1[start];
				a1[start]=a1[i];
				a1[i]=temp;
				order(a1,start+1,a1.length-1,a2);
				temp=a1[start];
				a1[start]=a1[i];
				a1[i]=temp;			
			}
		
	}
	
		
	public static void main(String[] args) {
//		int[] box1={1,4,9}; int[] box2={1,4,9}; //140
//		int[] box1={1,1,1}; int[] box2={1,1,1}; //12
//		int[] box1={1,9000,9000}; int[] box2={40,40,40}; //164214000
		int[] box1={6570,6076,5880}; int[] box2={7595,3,1835}; //324635290
		System.out.println(bestCost(box1,box2));

	}

}
