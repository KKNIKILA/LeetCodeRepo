class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        int NumbeR;
        Arrays.sort(strs);
        String string="";
        int i=0;
        while((i<strs[0].length()) && (i<strs[strs.length-1].length()))
        {
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i))
            {
                break;
            }
            string=string+strs[0].charAt(i);
            i++;
        }
        return string;
    }
}