class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i+1])
            {
                nums[i] = -101;
                count++;
            }
        }

        int j = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] != -101 && nums[j] == -101)
            {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            if(nums[j] != -101)
            {
                j++;
            }
        }

        return nums.length-count;
    }
}