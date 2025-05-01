import java.util.*;
class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        int a = 0;
        int b = 1;
        while(b<nums.length)
        {
            int count = 0;
            int freq = nums[a];
            int val = nums[b];
            while(count<freq)
            {
                l.add(val);
                count++;
            }
            a=a+2;
            b=b+2;
        }
        int[] result = new int[l.size()];
        for(int i = 0;i<result.length;i++)
        {
            result[i] = l.get(i);
        }

        return result;
    }
}