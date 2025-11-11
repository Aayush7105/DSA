package Practice.Greedy;

import java.util.*;

public class knapsack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        double[][] items = new double[n][3];

        System.out.println("Enter profit and weight for each item:");
        for (int i = 0; i < n; i++) {
            System.out.print("Profit " + (i + 1) + ": ");
            items[i][0] = sc.nextDouble();
            System.out.print("Weight " + (i + 1) + ": ");
            items[i][1] = sc.nextDouble();
            items[i][2] = (double) items[i][0] / items[i][1];

        }

        System.out.print("Enter knapsack capacity: ");
        double capacity = sc.nextDouble();

        Arrays.sort(items, (a, b) -> Double.compare(b[0], a[0]));

        //case2:
        //Arrays.sort(items, (a, b) -> Double.compare(a[1], b[1]));
        //case3:
        // Arrays.sort(items, (a, b) -> Double.compare(b[2], a[2]));
        double profitByProfit = fractionalKnapsack(items, capacity);
        System.out.println("Total Profit (by profit): " + profitByProfit);

    }

    public static double fractionalKnapsack(double[][] items, double capacity) {
        double totalProfit = 0.0;

        for (double[] item : items) {
            double profit = item[0];
            double weight = item[1];

            if (capacity >= weight) {
                totalProfit += profit;
                capacity -= weight;
            } else {
                totalProfit += (profit / weight) * capacity;
                break;
            }
        }
        return totalProfit;
    }
}