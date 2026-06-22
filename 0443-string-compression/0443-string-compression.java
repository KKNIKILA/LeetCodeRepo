class Solution 
{
    public int compress(char[] chars) 
    {
        int mar=0;
        int count=1;
        int NumbeR;
        for(int i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1])
            {
                count++;
            }
            else if((count==1) && (chars[i]!=chars[i+1]))
            {
                chars[mar]=chars[i];
                mar++;
            }
            else if(chars[i]!=chars[i+1])
            {
                chars[mar]=chars[i];
                mar++;
                if(count>9)
                {
                    String string=String.valueOf(count);
                    for(int j=0;j<string.length();j++)
                    {
                        chars[mar]=string.charAt(j);
                        mar++;
                    }
                }
                else
                {
                    chars[mar]=String.valueOf(count).charAt(0);
                    mar++;
                }
                count=1;
            }
        }
        chars[mar]=chars[chars.length-1];
        mar++;
        if(count>1)
        {
            String string=String.valueOf(count);
            for(int i=0;i<string.length();i++)
            {
                chars[mar]=string.charAt(i);
                mar++;
            }
        }
        return mar;
    }
}