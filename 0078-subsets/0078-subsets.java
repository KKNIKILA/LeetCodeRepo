class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        int NumbeR;
        ArrayList<List<Integer>> al=new ArrayList<>();
        backtrack(al,new ArrayList<>(),nums,0);
        return al;
    }
    private void backtrack(List<List<Integer>> al,List<Integer> tempSet,int[] nums,int start)
    {
        al.add(new ArrayList<>(tempSet));
        for(int i=start;i<nums.length;i++)
        {
            tempSet.add(nums[i]);
            backtrack(al,tempSet,nums,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
}