class Solution 
{
    public String intToRoman(int num) 
    {
        int[] newarr1={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] newarr2={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String string="";
        for(int i=12;i>=0;i--)
        {
            while(num>=newarr1[i])
            {
                string=string+newarr2[i];
                num=num-newarr1[i];
            }
        }
        return string;
    }
}