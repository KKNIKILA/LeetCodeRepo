class Solution 
{
    public String reverseStr(String s, int k) 
    {
        char[] newarr=s.toCharArray();
        int i=0;
        int j=k-1;
        while(j<s.length())
        {
            int ogi=i;
            int ogj=j;
            while(i<j)
            {
                char temp=newarr[i];
                newarr[i]=newarr[j];
                newarr[j]=temp;
                i++;
                j--;
            }
            i=ogi+2*k;
            j=ogj+2*k;
        }
        if(i<s.length())
        {
            j=s.length()-1;
            while(i<j)
            {
                char temp=newarr[i];
                newarr[i]=newarr[j];
                newarr[j]=temp;
                i++;
                j--;
            }
        }
        String string="";
        for(int i1=0;i1<s.length();i1++)
        {
            string=string+newarr[i1];
        }
        return string; 
    }
}