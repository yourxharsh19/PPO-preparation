package DSA.DAA;
import java.util.*;

class Item {
    int weight;
    int profit;
    double ratio;

    Item(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
        this.ratio = (double) profit / weight;
    }
}

public class FractionalKnapsack {

    static double getMaxProfit(int capacity, Item[] items) {
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalProfit = 0.0;

        for (Item item : items) {
            if (capacity == 0)
                break;

            if (item.weight <= capacity) {
                totalProfit += item.profit;
                capacity -= item.weight;
            } else {
                double fraction = (double) capacity / item.weight;
                totalProfit += item.profit * fraction;
                capacity = 0;
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };

        int capacity = 50;

        double maxProfit = getMaxProfit(capacity, items);
        System.out.println("Maximum profit = " + maxProfit);
    }
}
