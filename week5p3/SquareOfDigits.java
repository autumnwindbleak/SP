
public class SquareOfDigits {
	public static int getMax(String[] data){
//		int[][] grid=new int[data.length][data[0].length()];
		int max=1;
		for(int i=0;i<data.length;i++)
			for(int j=0;j<data[0].length();j++){
				for(int k=j+1;k<data[0].length();k++)
					if(data[i].charAt(j)==data[i].charAt(k))
						if(i+k-j<data.length)
							if(data[i].charAt(j)==data[i+k-j].charAt(j)&&data[i].charAt(k)==data[i+k-j].charAt(k))
								if(k-j+1>max)max=k-j+1;
				
//				grid[i][j]=data[i].charAt(j)-48;
			}
		return max*max;
	}

	public static void main(String[] args) {
//		String[] data={"12","34"}; //1
//		String[] data={"1255","3455"}; //4
//		String[] data={"42101","22100","22101"}; //9
//		String[] data={"1234567890"}; //1
		String[] data={"9785409507","2055103694","0861396761","3073207669","1233049493","2300248968","9769239548","7984130001","1670020095","8894239889","4053971072"}; //49

		System.out.println(getMax(data));



	}

}
