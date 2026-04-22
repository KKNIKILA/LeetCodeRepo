class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        for(int i=0;i<haystack.length();i++)
        {
            int j=0;
            int NumbeR=i;
            int i1=i;
            while((j<needle.length()) && (i1<haystack.length()) && (needle.charAt(j)==haystack.charAt(i1)))
            {
                j++;
                i1++;
            }
            if(j==needle.length())
            {
                return NumbeR;
            }
        }
        return -1;
    }
}