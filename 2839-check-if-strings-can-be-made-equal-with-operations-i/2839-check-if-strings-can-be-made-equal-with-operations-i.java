class Solution 
{
    public boolean canBeEqual(String s1, String s2) 
    {
        if(s1.equals(s2))
        {
            return true;
        }
        char[] newarr=s1.toCharArray();
        char NumbeR=newarr[0];
        newarr[0]=newarr[2];
        newarr[2]=NumbeR;
        String string1=new String(newarr);
        if(s2.equals(string1))
        {
            return true;
        }
        NumbeR=newarr[1];
        newarr[1]=newarr[3];
        newarr[3]=NumbeR;
        String string=new String(newarr);
        if(s2.equals(string))
        {
            return true;
        }
        NumbeR=newarr[0];
        newarr[0]=newarr[2];
        newarr[2]=NumbeR;
        String string2=new String(newarr);
        if(s2.equals(string2))
        {
            return true;
        }
        return false;
    }
}