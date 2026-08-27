class Solution 
{
    public int nearestDrone(int[][] drones, int[] target) 
    {
        int store;
        int NumbeR=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<drones.length;i++)
        {
            store=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if((store<min) && (store<=drones[i][2]))
            {
                min=store;
                NumbeR=i;
            }
        }
        return NumbeR;
    }
}