class Solution 
{
    public int countCommas(int n) 
    {
        int count=0;
        int digitCount=0;
        int copy=n;
        int NumbeR;
        if((n/1000)>0)
        {
            count=count+(n-999);
        }
        return count;
    }
}