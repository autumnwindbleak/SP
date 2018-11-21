import java.util.Arrays;


public class BusSeating {

	public static double getArrangement(String leftRow,String rightRow){
		int[][] emptyseat=new int[2][20];
		double min=100,temp;
		int num=0;
		for(int i=0;i<10;i++){
			if(leftRow.charAt(i)=='-'){
				emptyseat[0][num]=0;
				emptyseat[1][num]=i;
				num++;
			}
			if(rightRow.charAt(i)=='-'){
				emptyseat[0][num]=2;
				emptyseat[1][num]=i;
				num++;
			}
		}
		System.out.println(Arrays.deepToString(emptyseat));
		for(int i=0;i<num;i++)
			for(int j=i+1;j<num;j++)
				for(int k=j+1;k<num;k++){
					temp=calculatesum(i,j,k,emptyseat);				
					if(temp<min) min=temp;
				}
		return min;
	}
	
	public static double calculatesum(int i,int j,int k,int[][] emptyseat){
		return distance(i,j,emptyseat)+distance(j,k,emptyseat)+distance(i,k,emptyseat);
		
	}
	public static double distance(int i,int j,int[][] emptyseat){
		return Math.sqrt((emptyseat[0][j]-emptyseat[0][i])*(emptyseat[0][j]-emptyseat[0][i])+(emptyseat[1][j]-emptyseat[1][i])*(emptyseat[1][j]-emptyseat[1][i]));
	}
	
	public static void main(String[] args) {
//		String ls="----------",rs="----------"; //4
//		String ls="XXX-X-XX-X",rs="-XXXX---XX"; //4
//		String ls="XXXXXXXXXX",rs="-XX-XX-X--"; //6
		String ls="XXX-X-XX-X",rs="XXX-X-XX-X"; //6.82842712474619
		System.out.println(getArrangement(ls,rs));
	}
}
