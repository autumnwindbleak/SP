
public class VerticalFall {

	public static int dropTime(int x,int y,String[] obstacles){
		int i,j,l,tem;
		String s;
		l=obstacles.length;
		int table[][]=new int[50][3];
		for(i=0;i<obstacles.length;i++){
				s = "" + obstacles[i].charAt(0)+obstacles[i].charAt(1)+obstacles[i].charAt(2);
				table[i][0]= Integer.parseInt(s);
				s = "" + obstacles[i].charAt(4)+obstacles[i].charAt(5)+obstacles[i].charAt(6);
				table[i][1]= Integer.parseInt(s);
				s = "" + obstacles[i].charAt(8)+obstacles[i].charAt(9)+obstacles[i].charAt(10);
				table[i][2]= Integer.parseInt(s);
		}
		for(i=0;i<obstacles.length-1;i++)
			for(j=i+1;j<obstacles.length;j++)
				if(table[i][0]<table[j][0]){
					tem=table[i][0];
					table[i][0]=table[j][0];
					table[j][0]=tem;
					tem=table[i][1];
					table[i][1]=table[j][1];
					table[j][1]=tem;
					tem=table[i][2];
					table[i][2]=table[j][2];
					table[j][2]=tem;
				};
				
		return search(x,y,table,l,y,0);
		
	}
	
	public static int search(int x, int y,int[][] table,int l,int time,int position){
		int i;
		for(i=position;i<l;i++){
			if(y>=table[i][0]&&x>=table[i][1]&&x<=table[i][2]) {
				time=search(table[i][2],table[i][0],table,l,time,i+1);
				time=time+5;
				break;
			}
		}
		return time;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x=15,y=12;String s[]={"010 010 020","015 010 020","005 020 050"}; //22.0
//		int x=15,y=10;String s[]={"005 010 020"};                             //15
//		int x=50,y=85;String s[]={"020 001 100","010 100 100","005 100 200"}; //100
//		int x=10,y=1000;String s[]={};                                        //1000
		int x=500,y=800;String s[]={"800 001 500","400 001 499","401 501 999"}; //805
//		int x=50,y=85;String s[]={""};
		System.out.println(dropTime(x,y,s));
		

	}

}
