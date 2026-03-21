class Solution 
{
    public String reverseByType(String s) 
    {
        int i=0;
        int j=s.length()-1;
        char[] newarr=s.toCharArray();
        while(i<j)
        {
            while((i<j) && ((newarr[i]<'a') || (newarr[i]>'z')))
            {
                i++;
            }
            while((i<j) && ((newarr[j]<'a')||(newarr[j]>'z')))
            {
                j--;
            }
            char NumbeR=newarr[i];
            newarr[i]=newarr[j];
            newarr[j]=NumbeR;
            i++;
            j--;
        }
        i=0;
        j=s.length()-1;
        while(i<j)
        {
            while((i<j) && ((newarr[i]>='a')&&(newarr[i]<='z')))
            {
                i++;
            }
            while((i<j) && ((newarr[j]>='a')&&(newarr[j]<='z')))
            {
                j--;
            }
            char NumbeR=newarr[i];
            newarr[i]=newarr[j];
            newarr[j]=NumbeR;
            i++;
            j--;
        }
        String string="";
        for(int i1=0;i1<s.length();i1++)
        {
            string=string+newarr[i1];
        }
        return string;
    }
}