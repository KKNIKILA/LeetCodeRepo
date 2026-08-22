class Solution 
{
    public boolean checkDivisibility(int n) 
    {
        int NumbeR=n;
        int sum=0;
        int pro=1;
        while(n>0)
        {
            sum=sum+(n%10);
            pro=pro*(n%10);
            n=n/10;
        }
        int num=sum+pro;
        if((NumbeR%num)==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}