class Solution {
    public int maxProfit(int[] prices) {
         
         int min=0;
         int diff=0;
        for(int i=0;i<prices.length;i++){
            if(i==0) min=prices[i];
            if(prices[i]<min){
               min=prices[i];
            }
            else{
                 if(prices[i]-min>diff){
                    diff=prices[i]-min;
                }
            } 
        }
        return diff;
    }
}
