class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int[] newarr=new int[nums1.length];
        int i=0;
        int j=0;
        int k=0;
        while((i<m) && (j<n))
        {
            if(nums1[i]>nums2[j])
            {
                newarr[k]=nums2[j];
                j++;
            }
            else
            {
                newarr[k]=nums1[i];
                i++;
            }
            k++;
        }
        while(j<n)
        {
            newarr[k]=nums2[j];
            j++;
            k++;
        }
        while(i<m)
        {
            newarr[k]=nums1[i];
            i++;
            k++;
        }
        for(int i1=0;i1<newarr.length;i1++)
        {
            nums1[i1]=newarr[i1];
        }
        return;
    }
}