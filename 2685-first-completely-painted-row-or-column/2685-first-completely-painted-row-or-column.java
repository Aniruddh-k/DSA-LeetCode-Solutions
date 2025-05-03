import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[] rowCount = new int[rows];  // Tracks filled cells in each row
        int[] colCount = new int[cols];  // Tracks filled cells in each column

        // Map each number in mat to its (row, column) position
        Map<Integer, int[]> positionMap = new HashMap<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                positionMap.put(mat[r][c], new int[]{r, c});
            }
        }

        // Process arr and mark rows/columns
        for (int i = 0; i < arr.length; i++) {
            int[] pos = positionMap.get(arr[i]); // Get (row, col) of arr[i]
            int r = pos[0], c = pos[1];

            rowCount[r]++;
            colCount[c]++;

            if (rowCount[r] == cols || colCount[c] == rows) {
                return i;  // Return index when a row/column is fully marked
            }
        }

        return -1;  // Should never reach here
    }
}
