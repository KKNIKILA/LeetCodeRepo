class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String word=strs[i];
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String string=new String(ch);
            if(!map.containsKey(string))
            {
                map.put(string,new ArrayList<>());
            }
            map.get(string).add(word);
        }
        return new ArrayList<>(map.values());
    }
}