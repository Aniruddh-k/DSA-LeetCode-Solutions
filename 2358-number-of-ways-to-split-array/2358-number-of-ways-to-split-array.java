class Solution {
    public int waysToSplitArray(int[] nums) {
        long[] fr = new long[nums.length];
        long[] br = new long[nums.length];
        fr[0] = nums[0];
        br[nums.length - 1] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            fr[i] = fr[i - 1] + nums[i];
        }
        for (int i = nums.length - 2; i > -1; i--) {
            br[i] = br[i + 1] + nums[i];
        }
        int splitCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (fr[i] >= br[i + 1]) {
                splitCount += 1;
            }
        }
        return splitCount;
    }
}