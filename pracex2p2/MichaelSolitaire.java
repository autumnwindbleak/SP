
public class MichaelSolitaire {

	public static int minFlips(String cardFront){
		int count=0,flag=0,temp;
		for(int i=0;i<cardFront.length();i++){
			if(flag==0){
				if(cardFront.charAt(i)=='B')count++;
				flag=1;
			}else{
				if(cardFront.charAt(i)=='W')count++;
				flag=0;
			}
		}
		temp=count;
		count=0;
		flag=1;
		for(int i=0;i<cardFront.length();i++){
			if(flag==0){
				if(cardFront.charAt(i)=='B')count++;
				flag=1;
			}
			else{
				if(cardFront.charAt(i)=='W')count++;
				flag=0;
			}
		}
		if(temp>count)temp=count;
		return temp;
	}
	public static void main(String[] args) {
//		String carFront="BBBW"; //1
//		String carFront="WBWBW"; //0
//		String carFront="WWWWWWWWW"; //4
		String carFront="BBWBWWBWBWWBBBWBWBWBBWBBW"; //10
//		String carFront=;
//		String carFront=;
		System.out.println(minFlips(carFront));

	}

}
