class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.containsKey(nums[i]))
            {
                hs.put(nums[i],0);
            }
            hs.put(nums[i],hs.get(nums[i])+1);
        }
        List<Integer>[] bucket=new List[nums.length+1];
        for(int key:hs.keySet())
        {
            int frequency=hs.get(key);
            if(bucket[frequency]==null)
            {
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int[] res=new int[k];
        int NumbeR=0;
        for(int i=nums.length;(i>=0) && (NumbeR<k);i--)
        {
            if(bucket[i]!=null)
            {
                for(Integer in:bucket[i])
                {
                    res[NumbeR++]=in;
                }
            }
        }
        return res;
    }
}