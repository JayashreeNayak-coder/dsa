class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];

        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
           // System.out.println(prefix[i]);
        }
        int inner=0;
        int outer=0;
        int sum=0;
        int sub=0;

        while(outer<n){
            sum=sum+prefix[outer];inner=outer+1;sub=0;
            while(inner<n){
                sum=sum+(prefix[inner]-prefix[sub]);
                inner++;sub++;
            }
            //System.out.println(sum);
            outer+=2;

        }
        return sum;
    }
}