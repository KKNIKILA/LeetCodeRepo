class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int NumbeR=0;
        int sub=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<sub)
            {
                sub=prices[i];
            }
            else
            {
                NumbeR=Math.max(NumbeR,prices[i]-sub);
            }
        }
        return NumbeR;
    }
}