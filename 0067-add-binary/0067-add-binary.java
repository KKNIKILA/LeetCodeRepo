class Solution 
{
    public String addBinary(String a, String b) 
    {
        int NumbeR;
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        String string="";
        while((i>=0) || (j>=0) || (carry==1))
        {
            int f=0;
            int s=0;
            if(i>=0)
            {
                f=a.charAt(i)-'0';
            }
            if(j>=0)
            {
                s=b.charAt(j)-'0';
            }
            int tot=f+s+carry;
            string=(tot%2)+string;
            carry=tot/2;
            i--;
            j--;
        }
        return string;
    }
}