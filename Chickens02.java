package chickens02;
import java.util.*;

public class Chickens02 {
	public static void main(String[] args) {
		int mondayEggs = 100;
		int tuesdayEggs = 121;
		int wednesdayEggs = 117;
		double dailyAverage = (mondayEggs + tuesdayEggs + wednesdayEggs) / 3.0;
		double monthlyAverage = dailyAverage * 30;
		double monthlyProfit = monthlyAverage * 0.18;
		
		System.out.println("Daily Average: " +dailyAverage);
		System.out.println("Monthly Average: " +monthlyAverage);
		System.out.println("Monthly Profit: $" +monthlyProfit);
	}
}