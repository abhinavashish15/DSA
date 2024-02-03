package Arrays;

public class buyAndSellStock {
    public static int buyAndSell(int prices[]) {
        int maxProfit = 0, buyingPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            // if buying price is less than selling price then profit gain
            if (buyingPrice < prices[i]) {
                // today's profit
                int profit = prices[i] - buyingPrice;
                // global profit
                maxProfit = Math.max(maxProfit, profit);
            }
            // else buying price is equal to selling price because profit cannot be in -ve
            else {
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSell(prices));
    }

}
