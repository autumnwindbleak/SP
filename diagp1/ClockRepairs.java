//package com.ian;


public class ClockRepairs {
	public static int days(int[] arrivals, int numPerDay){
		int d,i,stock;
		stock=0;
		d=0;
		for(i=0;i<arrivals.length;i++)
		{
			stock=stock+arrivals[i];
			if(stock!=0) {
				stock=stock-numPerDay;
				if(stock<0)	stock=0;
			    d++;
			}
		}
		if(stock!=0)
			while(stock>0){
				stock=stock-numPerDay;
				d++;
			}
		return d;
	}
	public static void main(String[] args) {
//		int[] arrivals={6,5,4,3,2,1,0,0,1,2,3,4,5,6};int numPerDay=3;
		int[] arrivals={10,0,0,4,20};int numPerDay=8;
//		int[] arrivals={27,0,0,0,0,9}; int numPerDay=9;
//		int[] arrivals={100,100}; int numPerDay=10;
//		int[] arrivals={0,0,0}; int numPerDay=10;
		System.out.println(days(arrivals,numPerDay));
	}
}
