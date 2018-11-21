import java.util.*;
public class SpecialDay {

	public static int howMany(String weekday,int which,String month,int day){
		int monthnumber,weekdaynumber,weeknumber,counter=0;
		Calendar cal=Calendar.getInstance();
		cal.clear();
		
		switch(month){
		case "JANUARY": monthnumber=0;break;
		case "FEBRUARY": monthnumber=1;break;
		case "MARCH": monthnumber=2;break;
		case "APRIL": monthnumber=3;break;
		case "MAY": monthnumber=4;break;
		case "JUNE": monthnumber=5;break;
		case "JULY": monthnumber=6;break;
		case "AUGUST": monthnumber=7;break;
		case "SEPTEMBER": monthnumber=8;break;
		case "OCTOBER": monthnumber=9;break;
		case "NOVEMBER": monthnumber=10;break;
		case "DECEMBER": monthnumber=11;break;
		default:System.out.println("Month is not correct!");return -1;
		}
		switch(weekday){
		case "SUNDAY": weekdaynumber=1;break;
		case "MONDAY": weekdaynumber=2;break;
		case "TUESDAY": weekdaynumber=3;break;
		case "WEDNESDAY": weekdaynumber=4;break;
		case "THURSDAY": weekdaynumber=5;break;
		case "FRIDAY": weekdaynumber=6; break;
		case "SATURDAY": weekdaynumber=7; break;
		default:System.out.println("weekday is not correct!");return -1;
		}
		
		for(int i=2000;i<2101;i++){
			cal.set(i, monthnumber, day);
			if(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)==which&&weekdaynumber==cal.get(Calendar.DAY_OF_WEEK))counter++;	
		}
	
		return counter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String weekday="THURSDAY",month="NOVEMBER";int which=4, day=23; //14
//		String weekday="SUNDAY",month="MAY";int which=2, day=13;  //15
//		String weekday="TUESDAY",month="FEBRUARY";int which=5, day=29; //4
//		String weekday="MONDAY",month="OCTOBER";int which=2, day=6; //0
//		String weekday="MONDAY",month="FEBRUARY";int which=5, day=29; //3
		String weekday="SATURDAY",month="JULY";int which=1, day=7;
		System.out.println(howMany(weekday,which,month,day));

	}

}
