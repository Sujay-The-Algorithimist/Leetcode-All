class Solution {
    public boolean f(int n,int turn,int maxi)
    {
        if(n<maxi)
        {
            if(turn==0)
            return true;
            else
            return false;
        }
        boolean ans=true;
        if(turn==0)
        ans=f(n-maxi,turn+1,maxi-1);
        else
        ans=f(n-maxi,turn-1,maxi-1);

        return ans;
    }
    public boolean canAliceWin(int n) {
        // 27 17 8 0 
        if(n<10)
        return false;
        else
        return f(n-10,0,9); // 1-alice 0-bob
    }
}