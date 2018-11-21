
public class NiceOrUgly {
	
	public static String describe(String s){
		if(!check(s))return "UGLY";
		else{
			String sv = "";
			String sc = "";
			boolean u = false;
			for(int i = 0; i < s.length(); i++){
				if(s.charAt(i)!='?'){
					sv += s.charAt(i);
					sc += s.charAt(i);
				}
				else{
					sv += "A";
					sc += "Z";
//					if(checkq(i,s)) return "UGLY";
				}
			}
			if(check(sv)&&check(sc))return "NICE";
		}
		return "42";
	}

	public static boolean check(String s){
		int vow = 0,con = 0;
		for(int i = 0; i < s.length(); i++){
			switch(vow(s.charAt(i))){
			case 0:
				boolean flag = true;
				if(vow == 2){
					vow = 0;
					con++;
					flag = false;
				}
				if(con == 4){
					con = 0;
					vow++;
					flag = false;
				}
				if(flag){
					vow = 0;
					con = 0;
				}

				break;
			case 1:
				con = 0;
				vow ++;
				if(vow >= 3)return false;
				break;
			case -1:
				vow = 0;
				con++;
				if(con >= 5)return false;
				break;
			}
		}
		return true;
	}
	
	public static int vow(char c){
		switch(c){
		case 'A':
			return 1;
		case 'E':
			return 1;
		case 'I':
			return 1;
		case 'O':
			return 1;
		case 'U':
			return 1;
		case '?':
			return 0;
		default:
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HELLOWORLD"; //nice
//		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //ugly
//		String s = "HELLOW?RLD"; //42
//		String s = "H??LOWOR??"; //nice
//		String s = "EE?FFFF"; //ugly
//		String s = "EI?RQQ?A?WWQ?I?QRQ?A?QRQ?I?WQR?A?RWR?E?WQR?E?QRR"; //42
//		String s = "IE?LPS?E?QCL?I?VRV?A?MPD?I?BHR?O?SFJ?E?MFG?I?CHYW"; //ugly
//		String s = "AA?QQQ?A?QQQ?A?QQQ?A??QQQ?A?QQQ?A?QQQ?A?QQQ?A?QQQQ"; // 42
		
		System.out.println(describe(s));

	}

}
