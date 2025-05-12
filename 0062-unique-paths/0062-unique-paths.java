class Solution {
    public int uniquePaths(int m, int n) {
        // Use the combinatorial approach
        int totalSteps = m + n - 2; // Total steps to reach the bottom-right corner
        int chooseSteps = Math.min(m - 1, n - 1); // Choosing the minimum for better efficiency
        long result = 1;

        for (int i = 0; i < chooseSteps; i++) {
            result = result * (totalSteps - i) / (i + 1);
        }

        return (int) result; // Cast to int for return
    }
}
