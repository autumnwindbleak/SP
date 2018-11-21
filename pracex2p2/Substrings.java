
public class Substrings {
	
	public static int findLongest(String input){
		int max=0;
		for(int i=0;i<input.length();i++)
			for(int j=1;j<input.length()-i;j++)
				if(input.substring(j+i).indexOf(input.substring(i, j+i))!=-1)
					if(max<j)max=j;
		return max;
	}

	public static void main(String[] args) {
//		String input="ABCDEXXXYYYZZZABCDEZZZYYYXXX"; //5
		String input="abcdabcdabcdabCD"; //6
		System.out.println(findLongest(input));

	}

}
