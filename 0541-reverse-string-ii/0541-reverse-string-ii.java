class Solution 
{
    public String reverseStr(String s, int k) 
    {
        int i=0;
        int j=k-1;
        String string="";
        while(j<s.length())
        {
            for(int y=j;y>=i;y--)
            {
                string=string+s.charAt(y);
            }
            for(int y=j+1;y<i+2*k && y<s.length();y++)
            {
                string=string+s.charAt(y);
            }
            i=i+2*k;
            j=j+2*k;
        }
        if(i<s.length())
        {
            j=s.length()-1;
            for(int y=j;y>=i;y--)
            {
                string=string+s.charAt(y);
            }
        }
        return string; 
    }
}