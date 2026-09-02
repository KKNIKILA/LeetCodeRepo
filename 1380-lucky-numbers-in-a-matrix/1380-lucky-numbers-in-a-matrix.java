class Solution 
{
    public List<Integer> luckyNumbers(int[][] matrix) 
    {
        int[] rowmin=new int[matrix.length];
        int[] colmax=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            int min=matrix[i][0];
            int col=0;
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    col=j;
                }
            }
            rowmin[i]=col;
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            int max=matrix[0][i];
            int row=0;
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[j][i]>max)
                {
                    max=matrix[j][i];
                    row=j;
                }
            }
            colmax[i]=row;
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<rowmin.length;i++)
        {
            if(colmax[rowmin[i]]==i)
            {
                li.add(matrix[i][rowmin[i]]);
            }
        }
        return li;
    }
}