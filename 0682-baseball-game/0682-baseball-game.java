class Solution 
{
    public int calPoints(String[] operations) 
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("D"))
            {
                st.push(2*(st.peek()));
            }
            else if(operations[i].equals("C"))
            {
                st.pop();
            }
            else if(operations[i].equals("+"))
            {
                int a=st.pop();
                int b=st.pop();
                int c=b+a;
                st.push(b);
                st.push(a);
                st.push(c);
            }
            else
            {
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int NumbeR=0;
        while(!(st.isEmpty()))
        {
            NumbeR=NumbeR+st.peek();
            st.pop();
        }
        return NumbeR;
    }
}