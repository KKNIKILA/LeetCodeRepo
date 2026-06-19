class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int max=0;
        int sum=0;
        int NumbeR;
        for(int i=0;i<gain.length;i++)
        {
            max=(sum>max)?sum:max;
            sum=sum+gain[i];
        }
        max=(sum>max)?sum:max;
        return max;
    }
}