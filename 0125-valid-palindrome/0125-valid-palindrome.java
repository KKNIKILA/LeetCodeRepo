class Solution 
{
    public boolean isPalindrome(String s) 
    {
        int NumbeR;
        int i=0;
        int j=s.length()-1;
        s=s.toLowerCase();
        while(i<j)
        {
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            while((i<j)&& (!(((s.charAt(i)>='a') && (s.charAt(i)<='z'))||((s.charAt(i)>='0') && (s.charAt(i)<='9')))))
            {
                i++;
            }
            while((i<j) && (!(((s.charAt(j)>='a') && (s.charAt(j)<='z'))||((s.charAt(j)>='0') && (s.charAt(j)<='9')))))
            {
                j--;
            }
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