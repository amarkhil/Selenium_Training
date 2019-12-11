package Fifth_code;

public class Coding_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int profitcalculation = netprofitofcompany(10000, 6000, "2019");
		System.out.println("This is profit for calculation "+profitcalculation);
		float netprofitaftertax = profitcalculation-(profitcalculation*0.02f);
		System.out.println("this is profit after Tax "+netprofitaftertax);
		
	/*	Profit_of_Company(10000,6000,"January");
		Profit_of_Company(60000, 8000, "February");
		Profit_of_Company(100000, 80000, "March");
//Third();
	}
/*	public static void Third() {
	
	int Income = 10000;
	int Expenses = 8000;
	int Profit = Income-Expenses;
	System.out.println("This is Profit of the company: "+Profit);
	
}*/
/*	public static void Profit_of_Company(int income, int expense, String month) {
	
		int profit = income-expense;
		int Netprofit = profit-1000;
		System.out.println("This is the profit of the company on "+month +" "+profit);
		System.out.println("this is net profit of the Company :" + Netprofit);
	*/
	}
	
	public static int netprofitofcompany(int income, int expense, String year) {
		
		int profit = income-expense;
		System.out.println(profit);
		return profit;
		
	}
}
