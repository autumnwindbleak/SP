
public class DestroyBall {

	
	public static String ballColor(long r,long g, long b, long k){
		if(k<=3*r&&k<=3*g&&k<=3*b){
			k=k%3;
			if(k==1) return "RED";
			if(k==2) return "GREEN";
			if(k==0) return "BLUE";
		}
		if(k>=3*r&&k>=3*g&&k<3*b) return "BLUE";
		if(k>=3*r&&k>=3*b&&k<3*g) return "GREEN";
		if(k>=3*b&&k>=3*g&&k<3*r) return "RED";
		if(k<3*b&&k<3*g&&k>=3*r){
			k=k-3*r;
			b=b-r;
			g=g-r;
			if(k<=2*b&&k<=2*g) {
				if(k%2==1)return "GREEN";
				if(k%2==0) return "BLUE";
			}else {
				if(b>g) return "BLUE";
				else return "GREEN";
			}
			
			
		};
		if(k<3*r&&k<3*g&&k>=3*b){
			k=k-3*b;
			r=r-b;
			g=g-b;
			if(k<=2*r&&k<=2*g){
				if(k%2==1) return "RED";
				if(k%2==0) return "GREEN";				
			}else {
				if(r>g) return "RED";
				else return "GREEN";
			}
			
			
		};
		if(k<3*b&&k<3*r&&k>=3*g){
			k=k-3*g;
			r=r-g;
			b=b-g;
			if(k<=2*r&&k<=2*b){
				if(k%2==1) return "RED";
				if(k%2==0) return "BLUE";
			}else{
				if(r>b)return "RED";
				else return "BLUE";
			}
			
		};
		return "ERROR";
		
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long r=1,g=1,b=1,k=3;
//		long r=3,g=4,b=5,k=4;
//		long r=7,g=7,b=1,k=7;
//		long r=1000000000000l,g=1,b=1,k=1000000000002l;
//		long r=653,g=32,b=1230,k=556;
		long r=28,g=4,b=16,k=40;
		System.out.println(ballColor(r,g,b,k));

	}

}
