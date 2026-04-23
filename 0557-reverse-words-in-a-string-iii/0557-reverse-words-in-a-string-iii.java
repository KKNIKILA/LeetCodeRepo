class Solution 
{
    public String reverseWords(String s) 
    {
        String string="";
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                s1=s.charAt(i)+s1;
            }
            else
            {
                string=string+s1;
                s1="";
                string=string+' ';
            }
        }
        string=string+s1;
        return string;
    }
}