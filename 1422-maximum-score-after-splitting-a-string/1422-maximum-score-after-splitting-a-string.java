class Solution {
    public int maxScore(String s) {
        
        int[] prefix=new int[s.length()];
        int[] suffix=new int[s.length()];
        int res=-9999;

        prefix[0]=s.charAt(0)=='0'?1:0;
        suffix[suffix.length-1]=s.charAt(s.length()-1)=='1'?1:0;

        for(int i=1;i<prefix.length;i++){
            if(s.charAt(i)=='0'){
                prefix[i]=prefix[i-1]+1;
            }else prefix[i]=prefix[i-1];
            
        }
        for(int i=suffix.length-2;i>=0;i--){
            if(s.charAt(i)=='1'){
                suffix[i]=suffix[i+1]+1;
            }else suffix[i]=suffix[i+1];
            
        }

        for(int i=0;i<prefix.length-1;i++){
            res=Math.max(res,prefix[i]+suffix[i+1]);
        }
        return res;

    }
}