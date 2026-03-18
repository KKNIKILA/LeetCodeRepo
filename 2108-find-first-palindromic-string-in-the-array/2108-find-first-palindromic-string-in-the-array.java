class Solution 
{
    public String firstPalindrome(String[] words)
    {
       for(int i=0;i<words.length;i++)
       {
            String string=words[i];
            int p1=0;
            int p2=string.length()-1;
            int NumbeR=1;
            while(p1<p2)
            {
                if(string.charAt(p1)!=string.charAt(p2))
                {
                    NumbeR=0;
                }
                p1++;
                p2--;
            }
            if(NumbeR==1)
            {
                return words[i];
            }
       } 
       return "";
    }
}