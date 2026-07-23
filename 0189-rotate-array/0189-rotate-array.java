class Solution {
    public void rotate(int[] nums, int k) {
         
         int len=nums.length;
         int[] arr=new int[len];
         int times=0;

         if(len==1) return;

        if(k>len) k=k%len;
        
         for(int i=0;i<len;i++){
            if(i+k<len){
                arr[i+k]=nums[i];
            }
            else{
                arr[i+k-len]=nums[i];
            }
            
         }
        

         for(int i=0;i<len;i++){
            nums[i]=arr[i];
            }      
        
    }
}