class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0;i<matrix.length;i++)
        {
            if(matrix[0].length == 1)
            {
                if(matrix[i][0] == target)
                {
                    return true;
                }
            }
            int l = 0;
            int r = matrix[0].length-1;
            while(r>=l)
            {
                int mid = (l+r)/2;
                if(matrix[i][mid] == target)
                {
                    return true;
                }
                else if (target>matrix[i][mid])
                {
                    l = mid + 1;
                }
                else
                {
                    r = mid - 1;
                }
            }
        }
        return false;
    }
}