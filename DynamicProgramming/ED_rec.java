class Solution {
    //sdot 5 - using recursion 
    public static int ed(String s1, String s2, int i,int j){

        //these indicate how many deletions are required
        if(i==-1){
            return j+1;
        }
        if(j==-1){
            return i+1;
        }

        else if(s1.charAt(i)==s2.charAt(j)){
            return 0+ed(s1,s2,i-1,j-1);
        }

        //replace, insert, delete resp.
        else{
            return Math.min(1+ed(s1,s2,i-1,j-1), Math.min(1+ed(s1,s2,i,j-1), 1+ed(s1,s2,i-1,j)));
        }
    }

    public int minDistance(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();

        return ed(s1,s2,l1-1,l2-1);
    }
}
