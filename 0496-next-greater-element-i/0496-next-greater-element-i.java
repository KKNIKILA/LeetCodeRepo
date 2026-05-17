class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        int[] nums3=new int[nums1.length];
        int e;
        int NumbeR;
        for(int i=0;i<nums1.length;i++)
        {
            nums3[i]=-1;
            for(int j=0;j<nums2.length-1;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    int k=j+1;
                    while(k<nums2.length)
                    {
                        if(nums2[k]>nums1[i])
                        {
                            nums3[i]=nums2[k];
                            break;
                        }
                        k++;
                    }
                }
            }
        }
        return nums3;
    }
}