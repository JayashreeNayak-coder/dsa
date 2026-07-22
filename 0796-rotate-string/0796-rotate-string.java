class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length()!=goal.length()) return false;

        String check="";
        if(s.length()==goal.length() && s.equals(goal)) return true;
        
        for(int i=0;i<s.length()-1;i++){
            check= s.substring(i+1,s.length())+ s.substring(0,i+1);
            //System.out.println(check);
            if(check.equals(goal)) return true;
        }

        return false;
    }
}