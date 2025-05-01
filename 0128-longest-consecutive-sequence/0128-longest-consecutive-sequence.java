class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            h1.put(nums[i],i);
        }
        int max = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(!h1.containsKey(nums[i] -1)){
            int len = 1;
            int k = nums[i];
            while(h1.containsKey(k+1))
            {
               k++;
               len++;
            }
            if(len>max)
            {
                max = len;
            }
            }
        }
        return max;
    }
}