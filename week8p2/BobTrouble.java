public class BobTrouble {
  public int minSupers(String[] name, String[] bossName) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < name.length; i++) min = Math.min(min, count(i,bossName, name));
    if(min>1000)return -1;
    else return min;
  }
  
  public int count(int n, String[] bossName, String[] name) {
    int[] boss = new int[name.length];
    for (int i = 0; i < name.length; i++) {
      if (bossName[i]=="BOB") {
        if (name[n]!="BOB") return Integer.MAX_VALUE;
        boss[i] = n;
      } else 
    	  if (bossName[i]=="*")boss[i] = -1;
    	  else boss[i] = find(bossName[i], name);
      
    }
    for (int i = 0; i < name.length; i++) 
      if (circle(i, boss))return Integer.MAX_VALUE;
    
    boolean[] available = new boolean[name.length];
    
    for (int i = 0; i < boss.length; i++) 
      if (boss[i] != -1)available[boss[i]] = true;
    int count = 0;
    for (int i = 0; i < available.length; i++) 
      if (available[i])count++;
    return count;
  }
  
 public boolean circle(int n,int[] boss) {
    for (int i = 0; i < 100; i++) {
      n = boss[n];
      if (n == -1) return false;
    }
    return true;
  }
  
 public int find(String name, String[] _name) {
    for (int i = 0; i < _name.length; i++)
      if (_name[i].equals(name))return i;
    return -1;
  }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] name = {"BOB","BOB","BOB"}, bossName = {"BOB","*","BOB"}; //1
//		String[] name = {"JOHN","AL","DON","BOB"}, bossName = {"*","*","*","*"}; //0
//		String[] name = {"BOB","BOB","BOB"}, bossName = {"*","*","BOB"}; //1
//		String[] name = {"BOB","BOB","JACK"}, bossName = {"BOB","BOB","*"}; //-1
//		String[] name = {"BOB","BOB","BOB", "JACK"}, bossName = {"BOB","BOB", "JACK", "*"}; //1
//		String[] name = {"A","B","C"}, bossName = {"B","C","A"}; //-1
		String[] name = {"BOB", "BOB", "J", "K", "L", "M"}, bossName = {"K", "J", "BOB", "J", "M", "*"}; //-1
		
		BobTrouble b = new BobTrouble();
		System.out.println(b.minSupers(name, bossName));

	}
 
}
 