package DSA.ArrayConcepts;

public class Stocks2{

    /*
   Best Time to buy and sell stock
   input: prices = [7,1,5,3,6,4]
   Output: 5
   Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
   Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

   Brute-Force Approach

    */

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println("daily prices are:");
        for(int i=0;i<prices.length;i++)
        {
            System.out.print(prices[i]+" ");
        }
        System.out.println();
        System.out.println("The maximum profit is "+maxProfit(prices));

    }

    public static int maxProfit(int[] prices){
        int max = 0;

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit = prices[j] - prices[i];
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }

}
