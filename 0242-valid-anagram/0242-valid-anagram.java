class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        int[] newarr1=new int[256];
        int[] newarr2=new int[256];
        for(int i=0;i<s.length();i++)
        {
            newarr1[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++)
        {
            newarr2[t.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if(newarr1[i]!=newarr2[i])
            {
                return false;
            }
        }
        return true;
    }
}