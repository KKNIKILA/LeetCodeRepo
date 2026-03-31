class Solution 
{
    public int countPrefixes(String[] words, String s) 
    {
        int NumbeR=0;
        for(int i=0;i<words.length;i++)
        {
            String string=words[i];
            int j=0;
            int flag=1;
            int i1=0;
            if(string.length()>s.length())
            {
                continue;
            }
            while((j<s.length()) && (i1<string.length()))
            {
                if(string.charAt(i1)!=s.charAt(j))
                {
                    flag=0;
                    break;
                }
                i1++;
                j++;
            }
            if(flag==1)
            {
                NumbeR++;
            }
        }
        return NumbeR;
    }
}