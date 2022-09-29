import java.util.ArrayList;

public class CafeUtil {
	public int getStreakGoal(int numWeeks) {
		int streak = 0;
		for(int i = 1; i <= numWeeks; i++) {
			streak += i;
		}
		return streak;
	}
	
	public double getOrderTotal(double[] prices) {
		double orderTotal = 0.0;
		for(int i = 0; i < prices.length; i++) {
			orderTotal += prices[i];
		}
		return orderTotal;
	}
	
	public void displayMenu(ArrayList<String> menuItems) {
		for(int i = 0; i < menuItems.size(); i++) {
			System.out.println(i + " " + menuItems.get(i));
		}
	}
	
	public void addCustomer(ArrayList<String> customers) {
		System.out.println("Please enter your name: ");
		String userName = System.console().readLine();
		System.out.println("Hello, " + userName + "!");
		System.out.println("There are " + customers.size() + " in front of you.");
		customers.add(userName);
		System.out.println(customers);
	}
	
	public void printPriceChart(String product, double price, int maxQuantity) {
		System.out.println(product);
		for(int i = 1; i < maxQuantity + 1; i++) {
			if(i == 1) {
				System.out.println(i + " - " + "$" + (price * i));
				continue;
			}
			System.out.printf(i + " - " + "$%f", ((price * i) - (i * 0.50)));
		}
	}
}
