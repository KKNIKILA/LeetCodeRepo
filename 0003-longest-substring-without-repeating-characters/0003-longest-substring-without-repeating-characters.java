class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int[] newarr=new int[256];
        int j=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            newarr[s.charAt(i)]++;
            while(newarr[s.charAt(i)]>=2)
            {
                newarr[s.charAt(j)]--;
                j++;
            }
            max=Math.max(max,(i-j+1));
        }
        return max;
    }
}