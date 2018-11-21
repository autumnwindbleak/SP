	
public class OptimalList {
	public static String optimize(String inst){
		int n = 0, e = 0;
		String result = "";
		for(int i = 0; i < inst.length(); i++){
			switch(inst.charAt(i)){
			case 'N':
				n++;
				break;
			case 'S':
				n--;
				break;
			case 'E':
				e++;
				break;
			case 'W':
				e--;
				break;
			}
		}
		for(int i = 0; i < Math.abs(n); i++)
			if(n > 0) result += 'N';
			else result += 'S';
		for(int i = 0; i < Math.abs(e); i++)
			if(e > 0) result = 'E' + result;
			else result += "W";
		return result;
	}
	
	
	public static void main(String[] args){
//		String inst = "NENENNWWWWWS";  //NNNWWW
//		String inst = "NNEESSWW";  //""
//		String inst = "NEWSNWESWESSEWSENSEWSEWESEWWEWEEWESSSWWWWWW";  //"SSSSSSSSWWW"
		String inst = "NENENE";  //"EEENNN"
//		String inst = "NENENNWWWWWS";  //NNNWWW
//		String inst = "NENENNWWWWWS";  //NNNWWW
		
		System.out.println(optimize(inst));
		
	}
}
