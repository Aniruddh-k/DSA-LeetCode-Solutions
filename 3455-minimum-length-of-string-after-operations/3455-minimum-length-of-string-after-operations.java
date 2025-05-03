class Solution {
    public int minimumLength(String s) {
        if (s.length() < 3) {
            return s.length();
        }
        HashMap<Character, Integer> h1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            if (h1.containsKey(s.charAt(i))) {
                count = h1.get(s.charAt(i));
            }
            h1.put(s.charAt(i), count + 1);
        }
        int length = 0;
        int deletecount = 0;
        for (Map.Entry<Character, Integer> entry : h1.entrySet()) {
            int value = entry.getValue();
            if (value % 2 == 0) {
                deletecount += value - 2;
            } else {
                deletecount += value - 1;
            }
        }
        return s.length() - deletecount;
    }
}