class Solution 
{
    public int[] dailyTemperatures(int[] t) 
    {
        int NumbeR;
        int[] answers=new int[t.length];
        for(int i=t.length-2;i>=0;i--)
        {
            int j=i+1;
            while(j<t.length)
            {
                if(t[j]>t[i])
                {
                    answers[i]=j-i;
                    break;
                }
                if(answers[j]==0)
                {
                    break;
                }
                j=j+answers[j];
            }
        }
        return answers;
    }
}