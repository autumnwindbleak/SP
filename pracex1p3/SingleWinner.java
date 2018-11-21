
public class SingleWinner {
	public static class letter{
		int amount;
		char c;
		letter(){
			amount=0;
			c=' ';
		}
	}
	public static char happyLetter(String letters){
		int count=1,max=0,location=-1;
		letter[] l=new letter[letters.length()];
		l[0]=new letter();
		l[0].c=letters.charAt(0);
		l[0].amount=1;
		for(int i=1;i<letters.length();i++){
			l[i]=new letter();
			for(int j=0;j<count;j++){
				if(l[j].c==letters.charAt(i)){
					l[j].amount++;
					break;
				};
				if(j==count-1){
					l[count].c=letters.charAt(i);
					l[count].amount++;
					count++;
					break;
				};
			}
			}
		for(int i=0;i<count;i++)
			if(max<l[i].amount){
				max=l[i].amount;
				location=i;
			}
		for(int i=0;i<count;i++)
			if(i!=location){
				max-=l[i].amount;
			}
		if(max>0)return l[location].c;
		else return '.';
	}

	public static void main(String[] args) {
//		String letters="aacaaa"; //a
//		String letters="dcdjx"; //.
//		String letters="bcbbbbba"; //b
		String letters="aabc"; //.
		System.out.println(happyLetter(letters));
	}

}
