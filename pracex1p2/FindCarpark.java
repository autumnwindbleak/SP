
public class FindCarpark {

	public static int howMany(String street){
		int[] possible=new int[street.length()];
		int count=0;
		for(int i=0;i<street.length();i++){
			if(street.charAt(i)=='-'){
				if(possible[i]==-1)possible[i]=0;
				else possible[i]=1;
			}
			if(street.charAt(i)=='B'){
				possible[i]=0;
				if(i>=1)possible[i-1]=0;
				if(i>=2)possible[i-2]=0;
			}
			if(street.charAt(i)=='S'){
				possible[i]=0;
				if(i>=1)possible[i-1]=0;
				if(i<street.length()-1)possible[i+1]=-1;
			}
			if(street.charAt(i)=='D'){
				possible[i]=0;
			}
		}
		for(int i=0;i<possible.length;i++)
			if(possible[i]==1) count++;
		return count;
			
	}
	public static void main(String[] args){
//		String street="---B--S-D--S--"; //4
//		String street="DDBDDBDDBDD"; //0
//		String street="--S--S--S--S--"; //2
		String street="SSD-B---BD-DDSB-----S-S--------S-B----BSB-S--B-S-D"; //14
		System.out.println(howMany(street));
	}
}
