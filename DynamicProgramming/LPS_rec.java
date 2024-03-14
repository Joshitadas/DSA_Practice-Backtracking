class Solution {
    //sdot 4 - recursion
    public static int LPS(String s, int start, int end){
        if(start>end){
            return 0;
        }
        if(start == end){
            return 1;
        }
        else if(s.charAt(start)== s.charAt(end)){
            return 2+LPS(s,start+1,end-1);
        }
        else{
            return Math.max(LPS(s, start+1,end), LPS(s,start,end-1));
        }
    }
    public int longestPalindromeSubseq(String s) {
        int l = s.length();
        return LPS(s,0,l-1);
    }
}
