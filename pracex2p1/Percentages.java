
public class Percentages {
	public static int getNumber(String time){
		int second,left,percent=100;
		second=(time.charAt(0)-48)*10*60*60+(time.charAt(1)-48)*60*60+(time.charAt(3)-48)*10*60+(time.charAt(4)-48)*60+(time.charAt(6)-48)*10+time.charAt(7)-48;
		left=second%100;
		for(int i=1;i<100;i++)
			if((i*left)%100==0){
				percent=i;
				break;
			}
		return 100/percent-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String time="00:30:00"; //99
//		String time="00:28:00"; //19
//		String time="23:59:59"; //0
//		String time="00:14:10"; //49
		String time="00:19:16"; //3
		System.out.println(getNumber(time));

	}

}
