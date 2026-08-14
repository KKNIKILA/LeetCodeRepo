class Solution 
{
    public int maximumLengthSubstring(String s) 
    {
        // HashSet<Character> hs=new HashSet<>();
        int count=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     hs.add(s.charAt(i));
        // }
        int[] newarr=new int[256];
        int j=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            newarr[s.charAt(i)]++;
            // if(newarr[s.charAt(i)]==1)
            // {
            //     count++;
            // }
            while(newarr[s.charAt(i)]>2)
            {
                newarr[s.charAt(j)]--;
                // if(newarr[s.charAt(j)]==0)
                // {
                //     count--;
                // }
                j++;
            }
            max=Math.max(max,i-j+1);
            // if(count==hs.size())
            // {
            //     max=Math.max(max,i-j+1);
            //     for(int i1=j;i1<=i;i1++)
            //     {
            //         System.out.print(s.charAt(i1));
            //     }
            //     System.out.println();
            // }
        }
        int NumbeR;
        return max;
    }
}