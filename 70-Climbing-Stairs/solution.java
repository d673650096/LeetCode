public class Solution {
    private int times = 0;
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        recursion(n);
        return times;
    }
    
    public void recursion(int n)
    {
        if(n - 2 >= 0) 
        {
            if(n - 2 == 0) times++;
            else recursion(n - 2);
        }
        if(n - 1 >= 0) 
        {
            if(n - 1 == 0) times++;
            else recursion(n - 1);
        }
    }
    
    
}