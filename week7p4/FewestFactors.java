
public class FewestFactors {
	public static int count=-1;
	FewestFactors(){
		count=-1;
	}
	public static int number(int[] digits){
		int[] record = new int[digits.length];
		int sum=0;
		order(digits,0,digits.length-1,record);
		for(int i=0;i<record.length;i++)
			sum=sum*10+record[i];
		return sum;
		
	}
	
	public static void order(int[] a,int start,int end,int[] record){
		int temp,sum1=0,sum2=0;
		if(start==end){
			temp=factors(a);
//			System.out.println(temp);
			if(temp<=count||count==-1){
				if(temp!=count){
					count=temp;
					for(int i=0;i<a.length;i++)record[i]=a[i];
				}
				if(temp==count){
					for(int i=0;i<a.length;i++){
						sum1=sum1*10+record[i];
						sum2=sum2*10+a[i];
					}
					if(sum1>sum2)
						for(int i=0;i<a.length;i++)record[i]=a[i];
				}
					
			}
		}
		else 
			for(int i=start;i<=end;i++){
				temp=a[start];
				a[start]=a[i];
				a[i]=temp;
				order(a,start+1,a.length-1,record);
				temp=a[start];
				a[start]=a[i];
				a[i]=temp;			
			}
	}

	public static int factors(int[] a){
		int number=0;
		int counter=0;
		for(int i=0;i<a.length;i++){
			number=number*10+a[i];
		}
		for(int i=1;i<=number;i++)
			if(number%i==0)counter++;
		return counter;
	}
	public static void main(String[] args) {
//		int[] digits={1,2}; //21
//		int[] digits={6,0}; //6
//		int[] digits={4,7,4}; //447
//		int[] digits={1,3,7,9}; //1973
		int[] digits={7,5,4,3,6}; //36457
//		int[] digits={1,2,4}; //241
		System.out.println(number(digits));
//		System.out.println(factors(digits2));


	}

}
