class Solution {
    public int[] searchRange(int[] nums, int target) {
        
       int i=0;
       int j=nums.length-1;
       int[] res=new int[]{-1,-1};

       while(i<=j&&(res[0]==-1||res[1]==-1)){
        if(res[0]==-1){
            if(nums[i]==target) 
                res[0]=i;
            else i++;
        }
        if(res[1]==-1){
            if(nums[j]==target)
                res[1]=j;
            else j--;
        }
        
       }
       return res;
    }
}