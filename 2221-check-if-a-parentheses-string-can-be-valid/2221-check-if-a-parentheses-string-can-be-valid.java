class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) {
            return false;
        }
        
        int open = 0, flexible = 0;
        // Left to Right Scan (Checking Open Brackets)
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || locked.charAt(i) == '0') {
                open++;
            } else {
                open--;
            }
            if (open < 0) {
                return false;
            }
        }
        
        int close = 0;
        // Right to Left Scan (Checking Closing Brackets)
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || locked.charAt(i) == '0') {
                close++;
            } else {
                close--;
            }
            if (close < 0) {
                return false;
            }
        }
        
        return true;
    }
}
