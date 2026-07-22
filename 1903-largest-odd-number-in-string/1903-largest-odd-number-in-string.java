class Solution {
    public String largestOddNumber(String num) {
        
        int pos=-1;
        String res="";

        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2==1){
                pos=i;
                break;
            }
        }

        if(pos==-1) return res;
        
        for(int i=0;i<=pos;i++){
            res=res+num.charAt(i);
        }

        return res;
    }
}