class Solution 
{
    public boolean isVowel(char ch)
    {
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public int maxVowels(String s, int k) 
    {
        int NumbeR;
        int max=0;
        int count=0;
        for(int we=0;we<s.length();we++)
        {
            if(isVowel(s.charAt(we)))
            {
                count++;
            }
            if(we>=k-1)  //2>=2
            {
                max=Math.max(max,count);
                if(isVowel(s.charAt(we-k+1)))
                {
                    count--;
                }
            }
        }
        return max;
    }
}