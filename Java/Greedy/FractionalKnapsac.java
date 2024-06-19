package Java.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Object {
    double profit;
    int weight;

    public Object(int profit, int weight) {
        this.profit = profit;
        this.weight = weight;
    }

    // public String toString() {
    // return "p" + profit + " w" + weight;
    // }
}

// class ratio comperator
class ratioComperator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {

        double ratio1 = (double) (o1.profit) / (double) (o1.weight);
        double ratio2 = (double) (o2.profit) / (double) (o2.weight);
        /* SORT IN DESCENDING ORDER */

        // if object o1 is greater than o2
        if (ratio1 < ratio2)
            return 1;
        // if object o1 is less than o2
        if (ratio1 > ratio2)
            return -1;
        // if both the item is greter return 0
        else
            return 0;

    }
}

// Sort the boxTypes array using a custom comparator
class compareInteger implements Comparator<int[]> {
    @Override
    public int compare(int a[], int b[]) {
        // double ratio1 = (double) b[1] / b[0]; // Profit-to-weight ratio of b
        // double ratio2 = (double) a[1] / a[0]; // Profit-to-weight ratio of a
        // return Double.compare(ratio1, ratio2); // Return in Descenting order
        // To maximize the number of units, we need to prioritize the boxes with the
        // most units per
        // return Integer.compare(a[1], b[1]);
        return Integer.compare(b[1], a[1]);
    }

}

public class FractionalKnapsac {

    public static void main(String[] args) {
        // profits : 10, 5, 15, 7, 6, 18, 3
        // weights : 2, 3, 5, 7, 1, 4, 1
        // maxProfit = 54.6
        ArrayList<Object> obj = new ArrayList<>();
        obj.add(new Object(10, 2));
        obj.add(new Object(5, 3));
        obj.add(new Object(15, 5));
        obj.add(new Object(7, 7));
        obj.add(new Object(5, 1));
        obj.add(new Object(18, 4));
        obj.add(new Object(3, 1));

        Object arr[] = { new Object(10, 2), new Object(5, 3), new Object(15, 5), new Object(7, 7), new Object(5, 1),
                new Object(18, 4), new Object(3, 1) };

        Collections.sort(obj, new ratioComperator());
        Arrays.sort(arr, new ratioComperator());
        int W = 15;
        int n = 7;
        System.out.println(fractionalKnapsack(W, arr, n));

        int boxTypes[][] = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
        int truckSize = 10;
        int boxTypes2[][] = { { 1, 3 }, { 2, 2 }, { 3, 1 } };
        int truckSize2 = 4;
        Arrays.sort(boxTypes, new compareInteger());
        // Print the sorted array
        System.out.println("Sorted boxTypes based on profit-to-weight ratio:");
        for (int[] box : boxTypes) {
            System.out.println(Arrays.toString(box));
        }
        System.out.println(FractionalKnapsack(boxTypes, truckSize));
        System.out.println(FractionalKnapsack(boxTypes2, truckSize2));
    }

    public static double fractionalKnapsack(int W, Object[] obj, int n) {

        int currentWeight = 0;
        double maxProfit = 0.0;

        for (int i = 0; i < n; i++) {

            if (currentWeight + obj[i].weight <= W) {
                currentWeight += obj[i].weight;
                maxProfit += obj[i].profit;
            } else {
                int remainingWeight = W - currentWeight;
                double remaningProfit = (remainingWeight / (double) obj[i].weight) * obj[i].profit;
                maxProfit = maxProfit + remaningProfit;
                break;
            }
        }
        return maxProfit;
    }

    public static int FractionalKnapsack(int boxTypes[][], int boxSize) {

        int maxProfit = 0;
        int currentWeight = 0;

        for (int i = 0; i < boxTypes.length; i++) {

            if (currentWeight + boxTypes[i][0] <= boxSize) {
                maxProfit = maxProfit + boxTypes[i][1] * boxTypes[i][0];
                currentWeight += boxTypes[i][0];
            } else {
                int remainingWeight = boxSize - currentWeight;
                int remaningProfit = remainingWeight * boxTypes[i][1];
                maxProfit = maxProfit + remaningProfit;
                break;
            }
        }
        return maxProfit;
    }

}
