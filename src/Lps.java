class Solution {
    
    static Integer[][] t;
    
    public int longestPalindromeSubseq(String s) {
        
        
        t = new Integer[s.length()][s.length()];
        
        StringBuilder str = new StringBuilder(s);
        
        str.reverse();
        
        return dp(s, str, 0, 0, s.length(), str.length());
        
    }
    
    static int dp(String s1, StringBuilder s2, int i, int j, int n, int m){
        
        if(i==n || j==m)return 0;
        
        if(t[i][j]!=null)return t[i][j];
            
        if(s1.charAt(i)==s2.charAt(j)){
            return t[i][j]=1+dp(s1, s2, i+1, j+1, n, m);
        }
        
        int x = dp(s1, s2, i+1, j, n, m);
        
        int y = dp(s1, s2, i, j+1, n, m);
        
        return t[i][j]=Math.max(x, y);
        
    }
    
}
