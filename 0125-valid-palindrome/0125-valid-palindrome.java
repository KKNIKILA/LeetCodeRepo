class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String NumbeR="";
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(((c>='a') && (c<='z'))||(((c>='0') && (c<='9'))))
            {
                NumbeR=NumbeR+c;
            }
        }
        s=NumbeR;
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}