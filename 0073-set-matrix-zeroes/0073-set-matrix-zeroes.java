class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<int[]> l1 = new ArrayList<>();
        for(int i = 0;i<matrix.length;i++)
        {
            for(int j =0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == 0)
                {
                    int[] nums = new int[2];
                    nums[0] = i;
                    nums[1] = j;
                    l1.add(nums);
                }
            }
        }
        for(int i = 0;i<l1.size();i++)
        {
            int a = l1.get(i)[0];
            int b = l1.get(i)[1];
            for(int k = 0;k<matrix[0].length;k++)
            {
                matrix[a][k] = 0;
            }
            for(int j = 0;j<matrix.length;j++)
            {
                matrix[j][b] = 0;
            }
        }
    }
}