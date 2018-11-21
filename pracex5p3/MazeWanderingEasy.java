
public class MazeWanderingEasy {
	
	public static boolean[][] bmaze;
	public static int mx,my,cx,cy;
	public static int result;
	public static boolean found;
	
	public static int decisions(String[] maze){
		inistiallized(maze);
		search(mx,my);
		return result;	
	}
	
	public static void search(int x, int y){
		int decision = 0;
		if(x == cx && y == cy) {
			found = true;
			return;
		}
		else{
			if(x-1 >= 0 && bmaze[x-1][y]){
				decision++;
				if(!found){
					bmaze[x-1][y] = false;
					search(x-1, y);
					bmaze[x-1][y] = true;
				}
			}
			if(y+1 < bmaze[x].length && bmaze[x][y+1]){
				decision++;
				if(!found){
					bmaze[x][y+1] = false;
					search(x, y+1);
					bmaze[x][y+1] = true;
				}
			}
			if(x+1 < bmaze.length && bmaze[x+1][y]){
				decision++;
				if(!found){
					bmaze[x+1][y] = false;
					search(x+1,y);
					bmaze[x+1][y] = true;
				}
			}
			if(y-1 >= 0 && bmaze[x][y-1]){
				decision++;
				if(!found){
					bmaze[x][y-1] = false;
					search(x, y-1);
					bmaze[x][y-1] = true;
				}
			}
			if(decision > 1 && found) result++;
		}
	}
	
	public static void inistiallized(String[] maze){
		result = 0;
		found = false;
		bmaze = new boolean[maze.length][maze[0].length()];
		for(int i = 0; i < maze.length; i++)
			for(int j = 0; j < maze[i].length(); j++){
				switch(maze[i].charAt(j)){
				case '*':
					bmaze[i][j] = true;
					cx = i;
					cy = j;
					break;
				case 'M':
					bmaze[i][j] = false;
					mx = i;
					my = j;
					break;
				case 'X':
					bmaze[i][j] = false;
					break;
				case '.':
					bmaze[i][j] = true;
				}
			}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] maze = {"*.M",".X."};//1
//		String[] maze = {"...","XMX","..*"}; //2
//		String[] maze = {".X.X......X", ".X*.X.XXX.X", ".XX.X.XM...", "......XXXX."}; //3
		String[] maze = {"..........*", ".XXXXXXXXXX", "...........", "XXXXXXXXXX.", "M.........."}; //0
//		String[] maze = {}; //
//		String[] maze = {}; //
		
		System.out.println(decisions(maze));

	}

}
