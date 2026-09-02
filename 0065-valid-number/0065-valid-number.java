class Solution 
{
    public boolean isNumber(String s) 
    {
        boolean e=false;
        boolean digit=false;
        boolean dot=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='.')
            {
                if(dot||e)
                {
                    return false;
                }
                dot=true;
            }
            else if((ch=='e')||(ch=='E'))
            {
                if((!digit) || (i==s.length()-1) ||(e))
                {
                    return false;
                }
                e=true;
            }
            else if((ch=='-')||(ch=='+'))
            {
                if(((i!=0) && ((s.charAt(i-1)!='e') && (s.charAt(i-1)!='E'))) || (i==s.length()-1))
                {
                    return false;
                }
            }
            else if((ch>='0') && (ch<='9'))
            {
                digit=true;
            }
            else
            {
                return false;
            }
        }
        if(!digit)
        {
            return false;
        }
        return true;
    }
}