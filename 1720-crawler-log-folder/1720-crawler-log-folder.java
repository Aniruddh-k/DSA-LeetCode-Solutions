class Solution {
    public int minOperations(String[] logs) {
         Stack s = new Stack();
         int n = logs.length;
        for(int i = 0;i<n;i++)
        {
            if(logs[i].equals("../"))
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else if(logs[i].equals("./"))
            {
                continue;
            }
            else
            {
                s.push(1);
            }
        }
        int count = 0;
        while(!s.isEmpty())
        {
           s.pop();
           count++;
        }
        return count;
    }
}