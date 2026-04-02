class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int maxs=0;
        int sub=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<sub)
            {
                sub=prices[i];
            }
            else
            {
                maxs=Math.max(maxs,prices[i]-sub);
            }
        }
        return maxs;
    }
}