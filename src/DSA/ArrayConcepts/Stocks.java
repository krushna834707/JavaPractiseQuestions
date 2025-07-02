package DSA.ArrayConcepts;

/*
   Best Time to buy and sell stock
   input: prices = [7,1,5,3,6,4]
   Output: 5
   Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
   Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

 Time complexity is: 0(n)
 */
public class Stocks {

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
        int buy = prices[0];

        int prf = 0;

        for(int i=1;i<prices.length;i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                int cur_prf = prices[i] - buy;
                prf = Math.max(prf, cur_prf);
            }
        }
        return prf;
    }

}
