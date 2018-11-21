public class TestBettingStrategy 
{ 
  double[][][] stock; 
  int Rounds, GoalSum; 
  double Prob; 
  public double winProbability(int initSum, int goalSum, int rounds, int prob) 
  { 
    Prob = prob/100.0; 
    GoalSum = goalSum; 
    Rounds = rounds;  
    stock = new double[goalSum+1][rounds][rounds]; 
    for(int i=0;i<stock.length;i++) 
    	for(int j=0;j<stock[i].length;j++)
    		for(int k=0;k<stock[i][j].length;k++)
    			stock[i][j][k]=-1.0; 
     
    return count(initSum,0,0); 
  } 
  
  double count(int sum, int rounds, int fails) 
  { 
    if(sum>=GoalSum)return 1.0; 
    if(rounds>=Rounds)return 0.0; 
    if(stock[sum][rounds][fails]<0){
    	double result=0; 
    	int money = 1<<fails; 
    	if(money<=sum){
    		result = Prob*count(sum+money,rounds+1,0); 
    		result += (1-Prob)*count(sum-money,rounds+1,fails+1); 
    		} 
    	stock[sum][rounds][fails] = result; 
    	} 
    return stock[sum][rounds][fails]; 
  } 


	public static void main(String[] args) {
//		int initSum=10,goalSum=11,rounds=4,prob=50; //0.875
//		int initSum=10,goalSum=20,rounds=20,prob=50; //0.3441343307495117
//		int initSum=10,goalSum=20,rounds=10,prob=90; //0.34867844010000015
		int initSum=24,goalSum=38,rounds=24,prob=60; //0.5940784635646947
//		int initSum=100,goalSum=1000,rounds=50,prob=50; 
		TestBettingStrategy o = new TestBettingStrategy();
		System.out.println(o.winProbability(initSum,goalSum,rounds,prob));

	}

}
