class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        int NumbeR;
        int i=0;
        int j=0;
        while(i<haystack.length() && j<needle.length())
        {
            if(haystack.charAt(i)==needle.charAt(j))
            {
                i++;
                j++;
            }
            else if(haystack.charAt(i)!=needle.charAt(j))
            {
                i=i-j+1;
                j=0;
            }
            if(j==needle.length())
            {
                return i-j;
            }
        }
        return -1;
    }
}