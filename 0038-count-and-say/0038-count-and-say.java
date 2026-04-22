class Solution 
{
    public String countAndSay(int n) 
    {
        int NumbeR;
        String string="1";
        for(int i1=1;i1<n;i1++)
        {
            System.out.println(string);
            int count=1;
            String res="";
            for(int i=0;i<string.length()-1;i++)
            {
                if(string.charAt(i)==string.charAt(i+1))
                {
                    count++;
                }
                else
                {
                    res=res+String.valueOf(count);
                    res=res+String.valueOf(string.charAt(i));
                    count=1;
                }
            }
            res=res+String.valueOf(count);
            res=res+String.valueOf(string.charAt(string.length()-1));
            string=res;
        }
        return string;
    }
}