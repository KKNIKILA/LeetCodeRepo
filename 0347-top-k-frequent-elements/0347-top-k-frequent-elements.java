class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        int[] newarr=new int[nums.length];
        int[] res=new int[k];
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                count++;
            }
            else
            {
                newarr[i]=count;
                count=1;
            }
        }
        newarr[nums.length-1]=count;
        int j=0;
        for(int i1=0;i1<k;i1++)
        {
            int indi=-1;
            int max=0;
            for(int i=0;i<newarr.length;i++)
            {
                if(newarr[i]>max)
                {
                    max=newarr[i];
                    indi=i;
                }
            }
            if(indi!=-1)
            {
                res[j]=nums[indi];
                newarr[indi]=0;
                j++;
            }
        }
        return res;
    }
}