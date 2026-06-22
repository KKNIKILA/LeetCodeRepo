class Solution 
{
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int[] newarr=new int[2];
        int ij=0;
        boolean[] anti=new boolean[grid.length*grid[0].length+1];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(anti[grid[i][j]])
                {
                    newarr[ij]=grid[i][j];
                    ij++;
                }
                else
                {
                    anti[grid[i][j]]=!anti[grid[i][j]];
                }
            }
        }
        for(int i=1;i<anti.length;i++)
        {
            if(!anti[i])
            {
                newarr[ij]=i;
            }
        }
        return newarr;
    }
}