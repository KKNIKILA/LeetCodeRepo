class Solution 
{
    public int maxArea(int[] height) 
    {
      int i=0;
      int j=height.length-1;
      int max=0;
      while(i<j){

        int min=Math.min(height[i],height[j]);

        max=Math.max(min*(j-i),max);
        
        if(height[i]<height[j]){
            i++;
        }else{
            j--;
        }
      }
      return max;
    }
}