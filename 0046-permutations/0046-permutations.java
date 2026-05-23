class Solution 
{
    private void backtrack(List<List<Integer>> resultList,ArrayList<Integer> tempList,int[] nums)
    {
        if(tempList.size()==nums.length)
        {
            resultList.add(new ArrayList<>(tempList));
        }
        for(int NumbeR:nums)
        {
            if(tempList.contains(NumbeR))
            {
                continue;
            }
            tempList.add(NumbeR);
            backtrack(resultList,tempList,nums);
            tempList.remove(tempList.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) 
    {
        ArrayList<List<Integer>> resultList=new ArrayList<>();
        backtrack(resultList,new ArrayList(),nums);
        return resultList;
    }
}