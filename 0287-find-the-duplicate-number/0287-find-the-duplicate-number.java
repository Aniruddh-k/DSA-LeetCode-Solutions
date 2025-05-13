import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> elements = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++)
        {
            if(elements.contains(nums[i]))
            {
                return nums[i];
            }
            else
            {
                elements.add(nums[i]);
            }
        }
        return 0;
    }
}