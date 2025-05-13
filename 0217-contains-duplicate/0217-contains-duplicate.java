class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            int value = (h1.containsKey(nums[i]))? h1.get(nums[i]):0;
            if(value>0)
            {
                return true;
            }
            h1.put(nums[i],value+1);
        }
        return false;
    }
}