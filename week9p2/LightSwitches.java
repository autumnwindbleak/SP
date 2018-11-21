import java.util.Arrays;

public class LightSwitches {
	
	public static String[] stock;
	public static boolean[] available;
	public static int num_s;
	public static int num_l;
	public static int result = 0;
	LightSwitches(){
		result = 0;
	}
	
	public static long countPossibleConfigurations(String[] switches){
		stock = new String[switches.length];
		Arrays.fill(stock, "");
		available = new boolean[switches.length];
		Arrays.fill(available, true);
		num_s = switches.length;
		num_l = 0;
		for(int i = 0; i < switches.length; i++)
			for(int j = 0; j < switches[i].length(); j++)
				if(switches[i].charAt(j) == 'Y') stock[i] += "1";
				else stock[i] += "0";
		int index;
		clean();
		while(num_s != 0 && num_l != switches[0].length()){
			do{
				index = find(num_l);
				num_l++;
				if(num_l >= switches[0].length())
					return (long) Math.pow(2, result+1);
			}while(index == -1);
			result++;
			for(int i = 0; i < switches.length; i++)
				if(available[i] && stock[i].charAt(index) == '1') 
					change(index,i);
			num_s--;
			clean();
		}
		return (long) Math.pow(2, result);
	}
	
	public static void change(int x, int n){
		String s = "";
		for(int i = 0; i< stock[x].length(); i++){
			if(stock[x].charAt(i) == '1'){
				if(stock[n].charAt(i) == '1')
					s += '0';
				else
					s += '0';
			}
			else
				s += stock[n].charAt(i);
		}
		stock[n] = s;
	}
	
	
	public static void clean(){
		boolean flag = false;
		for(int i = 0; i < stock.length; i++)
			if(available[i]){
				flag = false;
				for(int j = 0; j < stock[i].length(); j++)
					if(stock[i].charAt(j) == '1'){
						flag = true;
						break;
					}
				if(!flag) {
					num_s--;
					available[i] = false;
				}
			}
	}
	
	public static int find(int light){
		for(int i = 0; i < stock.length; i++)
			if(available[i])
				if(stock[i].charAt(light) == '1'){
					available[i] = false;
					return i;
				}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] switches = {"YYN",	"NNY", "YYY", "NNN"}; //4
		String[] switches = {"NNNNYYYNYYNYYYYYNYY"}; //2
//		String[] switches = {"NYNYNYN", "YNYNYNY", "YYNNNYN", "NNNYNYN", "YYYYYNN", "YNNNNYN"}; //32
//		String[] switches = {"YNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNNN","NNNNNNNNNNNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNNN", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNYNNNNNNNNNNNNNNNNNNNN"}; //1073741824
//		String[] switches = {"YYN",	"NNY", "YYY", "NNN"}; //4
//		String[] switches = {"YYN",	"NNY", "YYY", "NNN"}; //4
//		String[] switches = {"YYN",	"NNY", "YYY", "NNN"}; //4
		
		System.out.println(countPossibleConfigurations(switches));
		

	}

	
//	public static void change(int x, int n){
//	String s = stock[n].substring(0, num_l-1);
//	if(stock[x].charAt(num_l) == '1'){
//		if(stock[n].charAt(num_l) == '1')
//			s += '0';
//		else
//			s += '0';
//	}
//	else
//		s += stock[n].charAt(num_l);
//	s += stock[n].substring(num_l);
//	stock[n] = s;
//}
	
	
}
