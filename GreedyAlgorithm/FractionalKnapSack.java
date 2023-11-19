import java.util.*;
public class FractionalKnapSack {

    static class Item implements Comparable<Item> {
        int value;
        int wt;
        double perUnitValue;

        Item() {

        }

        Item(int values, int wt, double perUnitValue) {
            this.value = values;
            this.wt = wt;
            this.perUnitValue = perUnitValue;
        }

        public int compareTo(Item other) {
            if (this.perUnitValue == other.perUnitValue) {
                return 0;

            } else if (this.perUnitValue > other.perUnitValue) {
                return +1;

            } else {
                return -1;
            }
        }

    }

    public static void main(String[] args) {
        int[] values = new int[]{33, 14, 50, 9, 8, 11, 6, 40, 2, 15};
        int[] wt = new int[]{7, 2, 5, 9, 3, 2, 1, 10, 3, 3};
        int cap = 10;

        double ans = maxProfit(values, wt, cap);
        System.out.println(ans);
    }

    public static double maxProfit(int[] values, int[] wt, int cap) {

        Item[] items = new Item[values.length];

        for (int i = 0; i < values.length; i++) {
            double perUnitValue = (values[i] * 1.0) / wt[i];
            Item item = new Item(values[i], wt[i], perUnitValue);
            items[i] = item;
        }

        Arrays.sort(items);

        double valueInBag = 0;
        int remainCap = cap;

        for (int i = values.length - 1; i >= 0; i--) {

            if (items[i].wt <= remainCap) {
                valueInBag += items[i].value;
                remainCap -= items[i].wt;

            } else {
                valueInBag += (remainCap * items[i].perUnitValue);
                remainCap = 0;
                break;
            }

        }
        return valueInBag;
    }

}