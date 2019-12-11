package Fifth_code;

public class Practice_of_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//company();
		
		
		
		Netp(10000, 8000,  "January");
		Netp(20000, 15000, "February");
		Netp(50000, 30000, "March");
		
		
	}

	/*public static void company() {
		int income = 10000;
		int expense = 8000;
		int profit = income- expense;
		System.out.println("This is the profit of this Jan "+profit);
		
	}*/
	
	public static void Netp(int income, int expense, String month) {
		
		int profit = income -expense;
		double netprofit = profit - (profit*0.2);
		System.out.println("This is the net profit of company on "+month +" "+netprofit);
	}
}
