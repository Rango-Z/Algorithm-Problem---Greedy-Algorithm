package com.zsh.greedy;

public class Solution122 {
    /**
     * 122. 买卖股票的最佳时机 II
     * @param prices 股票价格数组
     * @return 最大利润
     */
    public int maxProfit(int[] prices) {
        if(prices.length <= 1){
            return 0;
        }
        int max = 0;
        for(int i = 1; i < prices.length; i++){
            max += Math.max(0,prices[i] - prices[i - 1]);
        }
        return max;
    }
}
