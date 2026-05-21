class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int NumbeR;
        int i=0;
        int j=numbers.length-1;
        int[] newarr=new int[2];
        while(i<j)
        {
            if((numbers[i]+numbers[j])<target)
            {
                i++;
            }
            else if((numbers[i]+numbers[j])==target)
            {
                newarr[0]=i+1;
                newarr[1]=j+1;
                i++;
                j--;
            }
            else
            {
                j--;
            }
        }
        return newarr;
    }
}