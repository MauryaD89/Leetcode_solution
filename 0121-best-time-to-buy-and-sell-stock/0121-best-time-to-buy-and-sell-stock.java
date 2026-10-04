class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
    for(int price:prices){
       if(price<min){
        min=price;
       } 

       int profit=price-min;
       if(profit>maxprofit){
        maxprofit=profit;
       }
    }
    return maxprofit;
    }
}