class Solution 
{
    public int sumOfEncryptedInt(int[] nums) 
    {
        int NumbeR=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            int len=String.valueOf(n).length();
            int max=0;
            while(n>0)
            {
                if((n%10)>max)
                {
                    max=n%10;
                }
                n=n/10;
            }
            String string="";
            for(int i1=0;i1<len;i1++)
            {
                string=string+max;
            }
            nums[i]=Integer.parseInt(string);
            NumbeR=NumbeR+nums[i];
        }
        return NumbeR;
    }
}