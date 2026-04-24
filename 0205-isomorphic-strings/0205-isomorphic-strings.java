class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        int NumbeR;
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Character> hs=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {                                      
            char original=s.charAt(i);         
            char mapping=t.charAt(i);     
            if(!hs.containsKey(original))      
            {                                     
                if(!hs.containsValue(mapping))
                {
                    hs.put(original,mapping);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if(hs.get(original)!=mapping)
                {
                    return false;
                }
            }
        }
        return true;
    }
}