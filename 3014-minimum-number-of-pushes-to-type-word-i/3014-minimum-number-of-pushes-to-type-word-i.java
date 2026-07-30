class Solution 
{
    public int minimumPushes(String word) 
    {
        int len=word.length();
        int res=0;
        int i=1;
        while(len>=8)
        {
            len=len-8;
            res+=8*i;
            i++;
        }
        if(len>0)
        {
            return res+i*len;
        }
        return res;
    }
}