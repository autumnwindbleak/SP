import java.util.Arrays;

public class PartySeats {

	public static class person{
		int gender;
		String name;
		person(){
			name="";
			gender=-1;
		}
	}
	public static String[] seating(String[] attendnees){
		int boysnumber=0,girlsnumber=0;
		String[] empty={};
		
		person[] p=new person[attendnees.length];
		for(int i=0;i<attendnees.length;i++){
			p[i]=new person();
			for(int j=0;j<attendnees[i].length();j++)
				if(attendnees[i].charAt(j)!=' ')p[i].name+=attendnees[i].charAt(j);
				else {
					if(attendnees[i].charAt(j+1)=='b'){
						p[i].gender=0;
						boysnumber++;
					}
					if(attendnees[i].charAt(j+1)=='g'){
						p[i].gender=1;
						girlsnumber++;
					}
					break;
				}
		}
		if(boysnumber==0||girlsnumber==0) return empty;
		if(boysnumber!=girlsnumber)return empty;
		if((girlsnumber+boysnumber)%4!=0)return empty;
		
		String[] plan=new String[boysnumber+girlsnumber+2];
		int setboy=2,setgirl=1;
		sort(p);
		plan[0]="HOST";
		plan[boysnumber+1]="HOSTESS";
		for(int i=0;i<p.length;i++){
				if(p[i].gender==1){
					plan[setgirl]=p[i].name;
					setgirl+=2;
					if(setgirl==boysnumber+1)setgirl+=2;
				};
				if(p[i].gender==0){
					plan[setboy]=p[i].name;
					setboy+=2;
				};
			}
		return plan;

	}
	public static void sort(person[] p){
		String name;
		int gender;
		for(int i=0;i<p.length;i++)
			for(int j=i+1;j<p.length;j++)
				if(compare(p[i].name,p[j].name)){
					gender=p[j].gender;
					name=p[j].name;
					p[j].gender=p[i].gender;
					p[j].name=p[i].name;
					p[i].name=name;
					p[i].gender=gender;
				}
	}
	
	public static boolean compare(String a,String b){
		if(a.length()==0)return false;
		if(b.length()==0)return true;
		if(a.charAt(0)>b.charAt(0)) return true;
		else 
			if(a.charAt(0)<b.charAt(0)) return false;
			else return compare(a.substring(1),b.substring(1));
		
	}
	public static void main(String[] args){
//		String[] attendees={"BOB boy","SAM girl","DAVE boy","JO girl"};//[HOST, JO, BOB, HOSTESS, DAVE, SAM]
//		String[] attendees={"JOHN boy"}; //[]
//		String[] attendees={"JOHN boy","CARLA girl"};//[]
//		String[] attendees={"BOB boy","SUZIE girl","DAVE boy","JO girl","AL boy","BOB boy","CARLA girl","DEBBIE girl"}; //[HOST, CARLA, AL, DEBBIE, BOB, HOSTESS, BOB, JO, DAVE, SUZIE]
		String[] attendees={"BOB boy","SAM girl","DAVE boy","JOHN boy","BILL boy","DEE girl","JUNE girl","JO girl","A boy","B boy","C girl","D girl"};
		System.out.println(Arrays.deepToString(seating(attendees)));

		
	}
}
