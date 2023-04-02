package dsa;

public class MaxProfit {
    public static void main(String[] args) {
        int[] x = {7,6,4,3,1};
        System.out.println(maximumProfit(x));
    }
    public static int maximumProfit(int[] prices){
        int maxProfit = 0;
        int maxValue = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxValue){
                int maxi = prices[i] - maxValue;
                maxProfit=Math.max(maxProfit, maxi);
            }
            else {
                maxValue =prices[i];
            }

        }
        return maxProfit;
    }
}
