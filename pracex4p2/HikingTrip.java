
public class HikingTrip {
	
	public static String possible(int n, int h0,int hn,String history){
		int dis = hn - h0;
		if(dis > n) return "NO";
		int up = 0, down = 0, low = 0;
		for(int i = 0; i < history.length(); i++)
			if(history.charAt(i) == 'U')
				up++;
			else{
				down++;
				if(up - down < low) low = up -down;
				}
		
		if(up + down > n) return "NO";
		if(Math.abs(up-down-dis) > n - up -down) return "NO";
		else {
			if((n - up - down - Math.abs(up - down -dis)) % 2 != 0) return "NO";
			if(h0 + low < 0)
				if(n - up - down < 0 - h0 - low) return "NO";
				else{
					for(int i = 0; i < 0 - h0 - low; i++){
						history = "U" + history;
					}
					String temp = possible(n, h0, hn, history);
					if(temp.equals("YES"))return "YES";
					else return "NO";
					
				}
			return "YES";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 4, h0 = 0, hn = 4; String history = "UU"; //YES
//		int n = 4, h0 = 0, hn = 4; String history = "D"; //NO
//		int n = 4, h0 = 100000, hn = 100000; String history = "DDU"; //YES
//		int n = 4, h0 = 0, hn = 0; String history = "DDU"; //NO
//		int n = 20, h0 = 20, hn = 20; String history = "UDUDUDUDUD"; //YES
//		int n = 20, h0 = 0, hn = 0; String history = "UUUUUUUUUU"; //YES
//		int n = 20, h0 = 0, hn = 0; String history = "UUUUUUUUUUU"; //NO
		int n = 10, h0 = 10, hn = 11; String history = "D"; //NO
		
		System.out.println(possible(n, h0, hn, history));

	}

}
