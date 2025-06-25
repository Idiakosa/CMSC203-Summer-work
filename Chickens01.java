package chickens01;
import java.util.*;

public class Chickens01 {
	public static void main(String[] args) {
		int chickenCount = 8; //scenario 1 this is 3
		int eggsPerChicken = 4; //scenario 1 this is 5
		int mondayEggs = eggsPerChicken * chickenCount;
		chickenCount += 1;
		int tuesdayEggs = eggsPerChicken * chickenCount;
		int wednesdayEggs = (chickenCount / 2) * eggsPerChicken;
		int totalEggs = mondayEggs + tuesdayEggs + wednesdayEggs;
		
		System.out.println(totalEggs);
	}
}