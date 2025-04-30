class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0;i<2*n;i++)
        {
            if(i>=n)
            {
                int a = i-n;
                ans[i] = nums[a]; 
            }
            else{
               ans[i] = nums[i];
            }
        }

        return ans;
    }
}