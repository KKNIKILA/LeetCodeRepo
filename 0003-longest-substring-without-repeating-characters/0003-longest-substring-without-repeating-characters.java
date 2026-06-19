class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int j=0;
        int max=0;
        int[] arr=new int[256];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)]++;
            while(arr[s.charAt(i)]>1)
            {
                arr[s.charAt(j)]--;
                j++;
            }
            max=Math.max(i-j+1,max);
        }
        return max;
    }
}


//NumbeR