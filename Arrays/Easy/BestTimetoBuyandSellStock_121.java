import java.util.Scanner;

public class BestTimetoBuyandSellStock_121 {

    public static int maximumProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of days.");
            sc.close();
            return;
        }
        int[] prices = new int[n];
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int result = maximumProfit(prices);
        System.out.println("Maximum Profit: " + result);
        sc.close();
    }
}