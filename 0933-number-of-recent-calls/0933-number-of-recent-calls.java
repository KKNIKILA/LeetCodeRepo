class RecentCounter 
{
    Queue<Integer> queue;
    public RecentCounter() 
    {
        queue=new LinkedList<>();
    }
    public int ping(int t) 
    {
        queue.offer(t);
        while(queue.peek()<t-3000)
        {
            queue.poll();
        }
        int NumbeR=queue.size();
        return NumbeR;
    }
}
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */