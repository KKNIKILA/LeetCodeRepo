/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame 
{
    public int search(int low,int high)
    {
        if(low>high)
        {
            return -1;
        }
        int mid=low+(high-low)/2;
        int NumbeR=guess(mid);
        if(NumbeR==0)
        {
            return mid;
        }
        else if(NumbeR==1)
        {
            return search(mid+1,high);
        }
        else
        {
            return search(low,mid-1);
        }
    }
    public int guessNumber(int n)
    {
        int NumbeR=search(1,n);
        return NumbeR;
    }
}