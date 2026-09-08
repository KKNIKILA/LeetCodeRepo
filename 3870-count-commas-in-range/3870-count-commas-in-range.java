class Solution 
{
    public int countCommas(int n) 
    {
        int count=0;
        int digitCount=0;
        int copy=n;
        int NumbeR;
        while(n>0)
        {
            digitCount++;
            n=n/10;
        }
        if(digitCount>3)
        {
            count=count+(copy-999);
        }
        return count;
    }
}