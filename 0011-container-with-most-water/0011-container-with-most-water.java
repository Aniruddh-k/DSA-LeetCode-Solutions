class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int p1 = 0;
        int p2 = height.length-1;
        while(p2>p1)
        {
         if(height[p1] >= height[p2])
         {
            int temp = height[p2]*(p2-p1);
            if(temp>max)
            {
                max = temp;
            }
            p2--;
         }
         else if(height[p1] < height[p2])
         {
            int temp = height[p1]*(p2-p1);
            if(temp>max)
            {
                max = temp;
            }
            p1++;
         }
        }
        return max;
    }
}