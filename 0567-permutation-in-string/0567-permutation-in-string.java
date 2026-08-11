class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        char[] newarr=s1.toCharArray();
        Arrays.sort(newarr);
        String s=new String(newarr);
        for(int i=0;i<=s2.length()-s1.length();i++)
        {
            String string=s2.substring(i,i+s1.length());
            char[] newarr1=string.toCharArray();
            Arrays.sort(newarr1);
            String strings=new String(newarr1);
            if(strings.equals(s))
            {
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }
}