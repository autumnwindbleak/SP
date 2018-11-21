
public class WhiteGame {
	
	public static int max;
	
	public static int getSize(String[] board){
		if(board.length == 1 || board[0].length() == 1) return 1;
		
		if(board.length > board[0].length()) max = board[0].length();
		else max = board.length;
		
		int result = 1;
		int temp;
		for(int i = 0; i < board.length; i++)
			for(int j = 0; j < board[i].length(); j++){
				temp = find(i, j, board);
				if(temp > result) result = temp;
			}
		
		return result;
	}

	public static int find(int i, int j, String[] board){
		int length = 1;
		if(i + 1 >= board.length || j + 1 >= board[0].length()) return length * length;
		while(i + length < board.length && j + length < board[0].length()){
			for(int x = 0; x <= length; x++)
				if(board[i + x].charAt(j + length) != board[i + x].charAt(j + length - 1) || (x != 0 && board[i + length].charAt(j + x) != board[i + length].charAt(j + x - 1))){
					return length * length;
				}
			length++;
		}
		return length * length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[] board = {"BB", "WW"}; // 4
//		String[] board = {"W"}; // 1
//		String[] board = {"WBBB", "WBBB", "WWWW"}; // 9
//		String[] board = {"W", "B", "W", "W", "W"}; // 1
		String[] board = {"BWBBWBB", "WWBWWBW", "BBBBBBW", "WBBBBWB", "BBWWWWB", "WWWWWWW", "BBWWBBB"}; // 9
		
		
		System.out.println(getSize(board));


	}

}
