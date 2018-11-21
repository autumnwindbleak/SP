import java.util.Arrays;

public class LostParentheses {
	public static int minResult(String e){
		String[] number = e.split("[^0-9]"); 
		int index = Integer.MAX_VALUE;
		int temp = 1;
		for(int i = 0; i < e.length(); i++){
			if(e.charAt(i) == '+')temp++;
			if(e.charAt(i) == '-'){
				index = temp;
				break;
			}
		}
		int i = 0;
		int result = 0;
		while(i < index && i < number.length){
			result += Integer.parseInt(number[i]);
			i++;			
		}
		while(i >= index && i < number.length){
			result -= Integer.parseInt(number[i]);
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String e = "55-50+40"; // -35
//		String e = "10+20+30+40"; // 100
		String e = "00009-00009"; // 0
		System.out.println(minResult(e));

	}

}
