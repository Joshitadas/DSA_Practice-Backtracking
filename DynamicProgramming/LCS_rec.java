class Solution {
    //using recursion
    public static int LCS(String s1, String s2, int i, int j){
        if(i==-1 || j==-1){
            return 0;
        }
        else if(s1.charAt(i) == s2.charAt(j)){
            return 1+LCS(s1,s2,i-1,j-1);
        }
        else{
            return Math.max(LCS(s1,s2,i,j-1), LCS(s1,s2,i-1,j));
        }
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();

        return LCS(s1,s2, l1-1, l2-1);
    }
}
