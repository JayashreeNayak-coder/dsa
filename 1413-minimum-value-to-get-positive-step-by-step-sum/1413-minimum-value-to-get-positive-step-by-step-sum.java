class Solution {
    public int minStartValue(int[] nums) {
        
        int lowest=0;
        int prefix[]=new int[nums.length+1];
        prefix[0]=0;

        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        
        for(int i=1;i<prefix.length;i++){
            lowest=Math.min(lowest,prefix[i]);
        }
        
        
     return 1-lowest;
       

    }
}