class Solution 
{
    public int firstUniqChar(String s) 
    {
        int[] newarr=new int[256];
        for(int i=0;i<s.length();i++)
        {
            newarr[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(newarr[s.charAt(i)]==1)
            {
                return i;
            }
        }
        return -1;
    }
}