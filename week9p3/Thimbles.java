import java.util.Arrays;

public class Thimbles {

	public static int thimbleWithBall(String[] swaps){
		String[][] sstock = new String[swaps.length][2];
		int[][] stock = new int[swaps.length][2];
		String temp;
		int result = 1;
		for(int i = 0; i < swaps.length; i++){
			temp = swaps[i];
			sstock[i] = temp.split("-");
			stock[i][0] = Integer.parseInt(sstock[i][0]);
			stock[i][1] = Integer.parseInt(sstock[i][1]);
		}
		for(int i = 0; i < stock.length; i++){
			if(stock[i][0] == result) result = stock[i][1];
			else
				if(stock[i][1] == result) result = stock[i][0];
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] swaps={"1-2", "3-1"}; //2
//		String[] swaps={"3-1", "2-3", "3-1", "3-2"}; //3
//		String[] swaps={"2-3", "1-3", "2-3", "2-1", "3-1"}; //3
		String[] swaps={"1-2", "3-2", "1-2", "2-1", "2-1", "3-2", "1-3", "3-1", "1-2"}; //1
//		String[] swaps={"1-2", "3-1"}; //2
//		String[] swaps={"1-2", "3-1"}; //2
		
		System.out.println(thimbleWithBall(swaps));
		

	}

}
