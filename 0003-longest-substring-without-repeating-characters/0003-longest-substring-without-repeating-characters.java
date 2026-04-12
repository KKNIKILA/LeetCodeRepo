class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int NumbeR=0;
        int j=0;
        int[] newarr=new int[256];
        for(int i=0;i<s.length();i++)
        {
            newarr[s.charAt(i)]++;
            while(newarr[s.charAt(i)]==2)
            {
                newarr[s.charAt(j)]--;
                j++;
            }
            NumbeR=Math.max(NumbeR,i-j+1);
        } 
        return NumbeR;  
    }
}