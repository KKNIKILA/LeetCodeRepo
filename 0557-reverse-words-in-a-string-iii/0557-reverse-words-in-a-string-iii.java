class Solution 
{
    public String reverseWords(String s) 
    {
        String[] newarr=s.split(" ");
        String string="";
        for(int i=0;i<newarr.length;i++)
        {
            for(int i1=newarr[i].length()-1;i1>=0;i1--)
            {
                string=string+newarr[i].charAt(i1);
            }
            if(i==newarr.length-1)
            {
                continue;
            }
            string=string+' ';
        }
        return string;
    }
}