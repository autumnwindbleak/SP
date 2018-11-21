
public class RockStar {

	public static int getNumSongs(int ff, int fs, int sf, int ss){
		int sum = 0;
		if(ff != 0){
				sum += ff;
				if(fs == 0) return sum;
				if(fs <= sf){
					sum += fs * 2 -1;
					if(ss == 0) {
						sum++;
						return sum;
					}else{
						sum += ss;
						return sum+1;
					}
				}
				else{
					sum += sf * 2 +1;
					if(ss == 0) return sum;
					else return sum + ss;
				}
		}else{
			if(fs == 0)
				if(ss != 0) {
					if(sf != 0) return ss+1;
					return ss;
				}
				else 
					return 1;
			
				if(fs <= sf){
					sum += fs * 2 -1;
					if(ss == 0) {
						sum++;
						return sum;
					}else{
						sum += ss;
						return sum+1;
					}
				}
			else{
				sum += sf * 2 +1;
				if(ss == 0) return sum;
				else return sum + ss;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int ff = 100, fs = 0, sf = 0, ss = 200; //100
//		int ff = 0, fs = 0, sf = 20, ss = 200; //201
//		int ff = 1, fs = 2, sf = 1, ss = 1; //5
//		int ff = 192, fs = 279, sf = 971, ss = 249; //999
//		int ff = 1000, fs = 1000, sf = 1000, ss = 1000; //4000
//		int ff = 0, fs = 0, sf = 0, ss = 100; //100
		int ff = 0, fs = 56, sf = 92, ss = 23; //135
		System.out.println(getNumSongs(ff,fs,sf,ss));

	}

}
