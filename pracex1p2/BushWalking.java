public class BushWalking {

	public static int pathLength(String[] areaMap, int heightDifference){
		int[][] digitalMap =new int[areaMap[0].length()][areaMap.length]; 
		for(int i=0;i<areaMap.length;i++) // vertical
			for(int j=0;j<areaMap[i].length();j++)//horizontal
				digitalMap[j][i]=areaMap[i].charAt(j)-48;
		return walk(0,0,digitalMap,heightDifference);
				
	}
	public static int walk(int x,int y,int[][] map,int heightDifference){
		int count=0; //counter use for count steps
		
		if(y+1<map[x].length)
			if(Math.abs(map[x][y]-map[x][y+1])<=heightDifference&&map[x][y+1]!=-1){
				map[x][y]=-1;
				count=count+walk(x,y+1,map,heightDifference);
				return count+1;
				};
		if(x-1>=0)
			if(Math.abs(map[x][y]-map[x-1][y])<=heightDifference&&map[x-1][y]!=-1){
				map[x][y]=-1;
				count=count+walk(x-1,y,map,heightDifference);
				return count+1;
				};	
		if(y-1>=0)
			if(Math.abs(map[x][y]-map[x][y-1])<=heightDifference&&map[x][y-1]!=-1){
				map[x][y]=-1;
				count=count+walk(x,y-1,map,heightDifference);
				return count+1;
				};		
		
		if(x+1<map.length)
			if(Math.abs(map[x][y]-map[x+1][y])<=heightDifference&&map[x+1][y]!=-1) {
				map[x][y]=-1;
				count=count+walk(x+1,y,map,heightDifference);
				return count+1;
			};					
		return count+1;
	}
	
	public static void main(String[] args){
//		String[] areaMap={"056","135","234"}; int heightDifference=1; //5
//		String[] areaMap={"056","195","234"}; int heightDifference=1; //8
//		String[] areaMap={"865","123","111"}; int heightDifference=3; //9
		String[] areaMap={"00009876543210","00009876543210","00009876543210","00009876543210"}; int heightDifference=8; //16 
//		String[] areaMap=; 
//		String[] areaMap=; 
//		String[] areaMap=; 
//		String[] areaMap=; 
	
		System.out.println(pathLength(areaMap,heightDifference));
	}
}
