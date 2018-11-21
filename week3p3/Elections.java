
public class Elections {
	public static int visit(String[] likelihoods){
		int record=-1;
		double min=1.1,tem;
		for(int i=0;i<likelihoods.length;i++){
			tem=findpercent(likelihoods[i]);
			if(tem<min){
				min=tem;
				record=i;
			}
		}
		return record;
	}
	public static double findpercent(String sublikelihoods){
		double percent;
		double count1=0,count2=0;
		for(int i=0;i<sublikelihoods.length();i++){
			switch(sublikelihoods.charAt(i)){
				case '1': count1++;break;
				case '2': count2++;break;
				default:System.out.println("ERROR!");
			}
		}
		percent=count1/(count1+count2);
		return percent;
		
	}
		

	public static void main(String[] args) {
//		String[] text={"1222","1122","1222"}; //0
//		String[] text={"1222111122","2222222111","11111222221222222222"}; //1
//		String[] text={"111","112","121","122","211","212","221","222"}; //7
//		String[] text={"1122","1221","1212","2112","2121","2211"}; //0
//		String[] text={"11112222111121","1211221212121","112111222","11122222222111","112121222","1212122211112"}; //3
		String[] text={"1111111111111111111111","1111111111111111111111111111111"};
		System.out.println(visit(text));
		
	}
}
