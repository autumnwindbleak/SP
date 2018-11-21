import java.util.Arrays;


public class CellRemoval {
	
	public static boolean[] son;
	
	public static int result = 0;
	
	CellRemoval(){
		result = 0;
	}
	
	
	public static int cellsLeft(int[] parent, int deletedCell){

		son =	find(parent);
		parent[deletedCell] = -2;
		for(int i = 0; i < parent.length; i++)
			if(son[i])
				search(i,parent);
		return result;
	}
	
	public static void search(int n, int[] parent){
		if(parent[n] != -2){
			if(parent[n] == -1)
				result++;
			else{
				search(parent[n],parent);
			}
		}
	}
	
	public static boolean[] find(int[] parent){
		boolean[] temp = new boolean[parent.length];
		Arrays.fill(temp, true);
		for(int i = 0; i < parent.length; i++)
			if(parent[i] != -1){
				temp[parent[i]] = false;
				}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] parent = {-1,0,0,1,1}; int deletedCell = 2; //2
//		int[] parent = {-1,0,0,1,1}; int deletedCell = 1; //1
//		int[] parent = {-1,0,0,1,1}; int deletedCell = 0; //2
//		int[] parent = {-1,0,0,2,2,4,4,6,6}; int deletedCell = 4; //2
		int[] parent = {1,-1,1}; int deletedCell = 2; //2
//		int[] parent = {-1,0,0,1,1}; int deletedCell = 2; //2
		System.out.println(cellsLeft(parent,deletedCell));
		

	}

}
