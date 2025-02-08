package JavaBasics;

import java.util.Scanner;

public class OrderManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of items:");
		int numItems = sc.nextInt();

		double[] prices = new double[numItems];
		int[] quantities = new int[numItems];
		System.out.println("Enter the items (price ,quantity):");
		for (int i = 0; i < numItems; i++) {
			prices[i] = sc.nextDouble();
			quantities[i] = sc.nextInt();

		}
		double originalCost = calculateTotalCost(prices, quantities);
		double discountedCost = applyDiscount(originalCost);
		double shippingCost = calculateShipping(discountedCost);
		double finalCost = discountedCost + shippingCost;

		System.out.println("-----Bill of items----");
		System.out.printf("Original cost: Rs%.2f\n", originalCost);
		System.out.printf("Discount Amount: Rs%.2f\n", originalCost - discountedCost);
		System.out.printf("Discounted Cost: Rs%.2f\n", discountedCost);
		System.out.printf("Shipping Cost: Rs%.2f\n", shippingCost);
		System.out.printf("Final cost: Rs%.2f\n", finalCost);

		sc.close();

	}
	static double calculateTotalCost(double[] prices, int[] quantities) {
		double totalCost = 0;
		for (int i = 0; i < prices.length; i++) {
			totalCost += prices[i] * quantities[i];
		}
		return totalCost;
	}

	static double applyDiscount(double cost) {
		if (cost >= 5000 && cost <= 10000) {
			return cost * 0.10;
		} else if (cost > 10000) {
			return cost * 0.20;
		} else {
			return cost;
		}
	}

	

	static double calculateShipping(double discountedCost) {
		return discountedCost >= 7500 ? 0 : 250;
	}

}
