
public class DestoryBall {

	
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
			k=k%2;
			if(k==1) return "GREEN";
			if(k==0) return "BLUE";
		};
		if(k<3*r&&k<3*g&&k>=3*b){
			k=k-3*b;
			k=k%2;
			if(k==1) return "RED";
			if(k==0) return "GREEN";
		};
		if(k<3*b&&k<3*r&&k>=3*g){
			k=k-3*g;
			k=k%2;
			if(k==1) return "RED";
			if(k==0) return "BLUE";
		};
		return "ERROR";
		
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long r=1,g=1,b=1,k=3;
//		long r=3,g=4,b=5,k=4;
//		long r=7,g=7,b=1,k=7;
//		long r=1000000000000l,g=1,b=1,k=1000000000002l;
//		long r=653,g=32,b=1230,k=556;
		System.out.println(ballColor(r,g,b,k));

	}

}
