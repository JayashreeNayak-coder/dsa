class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int len = (word1.length()<word2.length())?word1.length():word2.length();
        String merged="";

        for(int i=0;i<len;i++){
            merged=merged+word1.charAt(i)+word2.charAt(i);
        }

        if(word1.length()>word2.length()){
            for(int i=len;i<word1.length();i++){
                merged=merged+word1.charAt(i);
            }
        }else{
             for(int j=len;j<word2.length();j++){
                merged=merged+word2.charAt(j);
            }
        }

        return merged;
    }
}